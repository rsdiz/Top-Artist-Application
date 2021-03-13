package id.rosyid.topartists.ui.main.artists.detail

import android.content.SharedPreferences
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.rosyid.topartists.R
import id.rosyid.topartists.data.Album
import id.rosyid.topartists.data.Song
import id.rosyid.topartists.utils.Const
import id.rosyid.topartists.utils.CustomDividerItemDecoration
import id.rosyid.topartists.utils.InitFavoriteToggle
import java.time.LocalDate

class ListSongsActivity : AppCompatActivity() {
    private lateinit var artistName: String
    private lateinit var dataAlbum: Album

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_songs)

        if (intent.extras != null) {
            val bundle = intent.extras!!
            artistName = bundle.getString(Const.ARTIST_NAME, "")
            dataAlbum = Album(
                name = bundle.getString(Const.ALBUM_TITLE, ""),
                releaseDate = bundle.get(Const.ALBUM_RELEASE_DATE) as LocalDate,
                songs = bundle.getParcelableArrayList<Song>(Const.ARTIST_SONG) as ArrayList<Song>,
                duration = bundle.getString(Const.ALBUM_DURATION, ""),
                albumCover = bundle.getInt(Const.ALBUM_COVER, 0)
            )
        }

        supportActionBar?.title = "List Songs"
        supportActionBar?.subtitle = "Album ${dataAlbum.name}"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Get view from Layout
        val ivAlbumImage: ImageView = findViewById(R.id.album_image)
        val tvAlbumName: TextView = findViewById(R.id.album_name)
        val tvArtistName: TextView = findViewById(R.id.artist_name)
        val tvInformation: TextView = findViewById(R.id.information)

        // Set content in View with Current Data
        Glide.with(ivAlbumImage.context)
            .load(dataAlbum.albumCover)
            .into(ivAlbumImage)
        tvAlbumName.text = dataAlbum.name
        tvArtistName.text = "By $artistName"
        tvInformation.text =
            "${dataAlbum.releaseDate.year}, ${dataAlbum.songs.size} Songs, ${dataAlbum.duration}"

        val songAdapter =
            ListSongAdapter(dataAlbum.songs) { mPreferences: SharedPreferences,
                toggleButton: ToggleButton,
                songTitle: String ->
                InitFavoriteToggle.set(mPreferences, toggleButton, songTitle)
            }
        songAdapter.notifyDataSetChanged()

        val rvSongList = findViewById<RecyclerView>(R.id.rv_song_lists)
        rvSongList.setHasFixedSize(true)
        rvSongList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rvSongList.adapter = songAdapter
        rvSongList.addItemDecoration(
            CustomDividerItemDecoration(
                rvSongList.context,
                DividerItemDecoration.VERTICAL
            )
        )
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
