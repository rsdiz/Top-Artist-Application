package id.rosyid.topartists.ui.main.favorite

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ToggleButton
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.rosyid.topartists.R
import id.rosyid.topartists.data.Album
import id.rosyid.topartists.data.Artist
import id.rosyid.topartists.data.ArtistsData
import id.rosyid.topartists.data.Song
import id.rosyid.topartists.ui.main.artists.ListArtistsAdapter
import id.rosyid.topartists.ui.main.artists.detail.GridAlbumsAdapter
import id.rosyid.topartists.ui.main.artists.detail.ListSongAdapter
import id.rosyid.topartists.utils.*
import id.rosyid.topartists.utils.PreferenceHelper.get

/**
 * A simple [Fragment] subclass.
 * Use the [FavoriteFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FavoriteFragment : Fragment() {
    private lateinit var mPreferences: SharedPreferences
    private lateinit var dataArtist: ArrayList<Artist>
    private lateinit var recyclerViewListener: RecyclerViewListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mPreferences = PreferenceHelper.customPrefs(requireContext(), Const.FAVORITE)
        dataArtist = ArtistsData.listData
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorite, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rvFavoriteArtistList: RecyclerView = view.findViewById(R.id.rv_favorite_artists)
        val rvFavoriteAlbumList: RecyclerView = view.findViewById(R.id.rv_favorite_albums)
        val rvFavoriteSongList: RecyclerView = view.findViewById(R.id.rv_favorite_songs)
        val tvEmptyArtistInfo: TextView = view.findViewById(R.id.empty_artist_info)
        val tvEmptyAlbumInfo: TextView = view.findViewById(R.id.empty_album_info)
        val tvEmptySongList: TextView = view.findViewById(R.id.empty_song_info)

        val favArtists: ArrayList<Artist> = ArrayList()
        val favAlbums: ArrayList<Album> = ArrayList()
        val favSongs: ArrayList<Song> = ArrayList()
        dataArtist.forEach { artist ->
            if (mPreferences[artist.name]) favArtists.add(artist)
            artist.albums.forEach { album ->
                if (mPreferences[album.name]) favAlbums.add(album)
                album.songs.forEach { song ->
                    if (mPreferences[song.title]) favSongs.add(song)
                }
            }
        }

        if (favArtists.isEmpty()) {
            tvEmptyArtistInfo.visibility = View.VISIBLE
        }

        if (favAlbums.isEmpty()) {
            tvEmptyAlbumInfo.visibility = View.VISIBLE
        }

        if (favSongs.isEmpty()) {
            tvEmptySongList.visibility = View.VISIBLE
        }

        val artistsAdapter = ListArtistsAdapter(
            favArtists,
            { selectedArtist ->
                recyclerViewListener = ArtistListener(rvFavoriteArtistList.context).apply {
                    this.selectedArtist = selectedArtist
                }
                recyclerViewListener.onItemClick()
            },
            { mPreference: SharedPreferences, toggleButton: ToggleButton, artistName: String ->
                InitFavoriteToggle.set(
                    mPreference,
                    toggleButton,
                    artistName
                )
            },
            1
        )
        artistsAdapter.notifyDataSetChanged()
        rvFavoriteArtistList.setHasFixedSize(true)
        rvFavoriteArtistList.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.VERTICAL,
            false
        )
        rvFavoriteArtistList.addItemDecoration(
            CustomDividerItemDecoration(
                rvFavoriteArtistList.context,
                DividerItemDecoration.VERTICAL
            )
        )
        rvFavoriteArtistList.adapter = artistsAdapter

        val albumAdapter = GridAlbumsAdapter(
            favAlbums,
            { selectedAlbum: Album ->
                recyclerViewListener = AlbumListener(rvFavoriteAlbumList.context).apply {
                    this.selectedAlbum = selectedAlbum
                    this.artistName = SearchArtist.byAlbumName(dataArtist, selectedAlbum.name).name
                }
                recyclerViewListener.onItemClick()
            },
            { mPreference: SharedPreferences, toggleButton: ToggleButton, albumTitle: String ->
                InitFavoriteToggle.set(mPreference, toggleButton, albumTitle,)
            }
        )
        albumAdapter.notifyDataSetChanged()
        rvFavoriteAlbumList.setHasFixedSize(true)
        rvFavoriteAlbumList.layoutManager =
            GridLayoutManager(rvFavoriteAlbumList.context, 2, GridLayoutManager.VERTICAL, false)
        rvFavoriteAlbumList.adapter = albumAdapter

        val songAdapter =
            ListSongAdapter(favSongs) { mPreferences: SharedPreferences,
                toggleButton: ToggleButton,
                songTitle: String ->
                InitFavoriteToggle.set(mPreferences, toggleButton, songTitle,)
            }
        songAdapter.notifyDataSetChanged()

        rvFavoriteSongList.setHasFixedSize(true)
        rvFavoriteSongList.layoutManager =
            LinearLayoutManager(rvFavoriteSongList.context, LinearLayoutManager.VERTICAL, false)
        rvFavoriteSongList.addItemDecoration(
            CustomDividerItemDecoration(
                rvFavoriteSongList.context,
                DividerItemDecoration.VERTICAL
            )
        )
        rvFavoriteSongList.adapter = songAdapter
    }

    companion object {
        @JvmStatic
        fun newInstance() = FavoriteFragment()
    }
}
