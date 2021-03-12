package id.rosyid.topartists.ui.main.artists.detail

import android.content.Intent
import android.content.SharedPreferences
import android.graphics.BitmapFactory
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.palette.graphics.Palette
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import id.rosyid.topartists.R
import id.rosyid.topartists.data.Album
import id.rosyid.topartists.data.Artist
import id.rosyid.topartists.data.Genre
import id.rosyid.topartists.ui.main.artists.FormatNumberListener
import id.rosyid.topartists.utils.AlbumListener
import id.rosyid.topartists.utils.Const
import id.rosyid.topartists.utils.InitFavoriteToggle
import id.rosyid.topartists.utils.RecyclerViewListener

class DetailArtistActivity : AppCompatActivity() {
    private lateinit var dataArtist: Artist
    private lateinit var recyclerViewListener: RecyclerViewListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_artist)

        // Get Bundle Data from Previous Activity
        if (intent.extras != null) {
            val bundle: Bundle = intent.extras!!
            dataArtist = Artist(
                name = bundle.getString(Const.ARTIST_NAME, ""),
                genres = bundle.getParcelableArrayList<Genre>(Const.ARTIST_GENRE) as ArrayList<Genre>,
                bio = bundle.getString(Const.ARTIST_BIO, ""),
                albums = bundle.getParcelableArrayList<Album>(Const.ARTIST_ALBUMS) as ArrayList<Album>,
                profileImage = bundle.getInt(Const.ARTIST_IMAGE, 0),
                monthlyListener = bundle.getLong(Const.ARTIST_MONTHLY_LISTENER)
            )
        }

        title = "Detail Artist"
        actionBar?.subtitle = dataArtist.name

        // Get View from Layout
        val tvArtistName = findViewById<TextView>(R.id.artist_name)
        val ivArtistProfileImage = findViewById<ImageView>(R.id.artist_profile_image)
        val tvArtistBiography = findViewById<TextView>(R.id.artist_biography)
        val tvArtistMonthlyListener = findViewById<TextView>(R.id.artist_monthly_listener)
        val rvArtistGenre = findViewById<RecyclerView>(R.id.rv_artist_genre)
        val rvArtistAlbum = findViewById<RecyclerView>(R.id.rv_album_lists)
        val flBannerLayout = findViewById<RelativeLayout>(R.id.banner_color)

        // Search palette color from Profile Image
        val profileBitmap = BitmapFactory.decodeResource(resources, dataArtist.profileImage)
        val builder = Palette.Builder(profileBitmap)
        val palette = builder.generate()

        // Apply palette color to view
        flBannerLayout.setBackgroundColor(
            palette.vibrantSwatch?.rgb ?: palette.darkMutedSwatch?.rgb ?: ContextCompat.getColor(
                this,
                R.color.navy_blue
            )
        )
        tvArtistName.setTextColor(
            palette.lightVibrantSwatch?.rgb ?: palette.lightMutedSwatch?.rgb
                ?: ContextCompat.getColor(this, R.color.white)
        )

        // Set Content in view
        tvArtistName.text = dataArtist.name
        tvArtistBiography.text = dataArtist.bio
        tvArtistMonthlyListener.text = FormatNumberListener.format(dataArtist.monthlyListener)
        Glide.with(applicationContext)
            .load(dataArtist.profileImage)
            .into(ivArtistProfileImage)

        // Set RecyclerView for Genre List
        val genreAdapter = GridGenreAdapter(dataArtist.genres)
        genreAdapter.notifyDataSetChanged()
        rvArtistGenre.setHasFixedSize(true)
        rvArtistGenre.layoutManager = GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)
        rvArtistGenre.adapter = genreAdapter

        // Set RecyclerView for Album List
        val albumAdapter = GridAlbumsAdapter(
            dataArtist.albums,
            { selectedAlbum: Album ->
                recyclerViewListener = AlbumListener(rvArtistAlbum.context).apply {
                    this.selectedAlbum = selectedAlbum
                    this.artistName = dataArtist.name
                }
                recyclerViewListener.onItemClick()
            },
            { mPreference: SharedPreferences, toggleButton: ToggleButton, albumTitle: String ->
                InitFavoriteToggle.set(mPreference, toggleButton, albumTitle,)
            }
        )
        albumAdapter.notifyDataSetChanged()
        rvArtistAlbum.setHasFixedSize(true)
        rvArtistAlbum.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        rvArtistAlbum.adapter = albumAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.share_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMenuItem(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMenuItem(itemId: Int) {
        when (itemId) {
            R.id.share -> {
                val sendIntent = Intent().apply {
                    action = Intent.ACTION_SEND
                    putExtra(Intent.EXTRA_TEXT, "Do you guys know? It turns out that ${dataArtist.name} is one of the artists with the highest number of monthly listeners this month, this data is based on data taken on Spotify. Want to know more? Come see the Top Artist application. https://www.github.com/rsdiz")
                    type = "text/plain"
                }

                val shareIntent = Intent.createChooser(sendIntent, null)
                startActivity(shareIntent)
            }
        }
    }
}
