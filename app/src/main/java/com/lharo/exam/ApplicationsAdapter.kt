package com.lharo.exam
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ApplicationsAdapter(context: Context, feedEntries: ArrayList<MovieModel>): RecyclerView.Adapter<ApplicationsAdapter.ViewHolder>() {
    private var localContext: Context? = null
    private var localFeedentries: ArrayList<MovieModel>? = null

    init {
        localContext = context
        localFeedentries = feedEntries
    }

    // inflar layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ApplicationsAdapter.ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(localContext)  // Referencia a MainActivity
        val view: View = layoutInflater.inflate(R.layout.activity_movies, parent, false)
        return ViewHolder(view)
    }

    // asignar valores a las filas basadas en la posición de la lista
    override fun onBindViewHolder(holder: ApplicationsAdapter.ViewHolder, position: Int)
    {
        val currentFeedEntry: MovieModel = localFeedentries!![position]
        holder.movieName.text = currentFeedEntry.title
        holder.movieYear.text = currentFeedEntry.year
        holder.movieDirector.text = currentFeedEntry.director
        holder.movieLanguage.text = currentFeedEntry.language

    }

    override fun getItemCount(): Int {
        return localFeedentries?.size ?: 0
    }

    class ViewHolder(v: View): RecyclerView.ViewHolder(v) {
        val movieName: TextView = v.findViewById(R.id.movieName)
        val movieYear: TextView = v.findViewById(R.id.movieYear)
        val movieLanguage: TextView = v.findViewById(R.id.movieLang)
        val movieDirector: TextView = v.findViewById(R.id.movieDirector)
//        var textName: TextView? = null
//
//        init {
//            textName = v.findViewById(R.id.textViewName);
//        }
    }
}