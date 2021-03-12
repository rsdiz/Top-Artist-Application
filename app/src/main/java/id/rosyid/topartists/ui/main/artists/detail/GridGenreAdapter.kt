package id.rosyid.topartists.ui.main.artists.detail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import id.rosyid.topartists.R
import id.rosyid.topartists.data.Genre

class GridGenreAdapter(
    private val listGenre: ArrayList<Genre>
) : RecyclerView.Adapter<GridGenreAdapter.GridViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_genre, parent, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        holder.bind(listGenre[position])
    }

    override fun getItemCount(): Int {
        return listGenre.size
    }

    inner class GridViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        private val tvGenreName = view.findViewById<TextView>(R.id.genre_text)
        fun bind(genre: Genre) {
            tvGenreName.text = genre.name
        }
    }
}
