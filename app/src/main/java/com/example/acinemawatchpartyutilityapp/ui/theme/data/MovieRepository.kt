package com.example.acinemawatchpartyutilityapp.data

import com.example.acinemawatchpartyutilityapp.model.Movie

class MovieRepository {
    fun getMovies(genreFilter: String): List<Movie> {
        val allMovies = listOf(
            Movie(1, "Interstellar Voyage", "A crew travels beyond this galaxy through a wormhole.", "2026-11-10", 8.6),
            Movie(2, "Cyber City 2099", "Neon-lit action thriller in an underground metropolis.", "2026-11-12", 7.8),
            Movie(3, "The Last Forest", "An emotional journey of survival in the deep wilderness.", "2026-11-15", 8.1),
            Movie(4, "Speed Demon", "High-octane street racing championship drama.", "2026-11-18", 7.5)
        )
        return if (genreFilter == "All") allMovies else allMovies.filter { it.title.contains(genreFilter, ignoreCase = true) || genreFilter == "Action" }
    }
}