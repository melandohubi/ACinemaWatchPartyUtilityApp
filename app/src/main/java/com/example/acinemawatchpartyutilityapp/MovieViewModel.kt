package com.example.acinemawatchpartyutilityapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.acinemawatchpartyutilityapp.data.MovieRepository
import com.example.acinemawatchpartyutilityapp.model.Movie

class MovieViewModel : ViewModel() {
    private val repository = MovieRepository()

    var selectedGenre by mutableStateOf("All")
        private set

    var movies by mutableStateOf<List<Movie>>(emptyList())
        private set

    init {
        loadMovies()
    }

    fun updateGenre(newGenre: String) {
        selectedGenre = newGenre
        loadMovies()
    }

    private fun loadMovies() {
        movies = repository.getMovies(selectedGenre)
    }
}