package com.example.demohilt.ui.favorite

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.demohilt.data.local.FavoriteMovieRepository

class FavoriteViewModel @ViewModelInject constructor(
    repository: FavoriteMovieRepository,
) : ViewModel() {
    val movies = repository.getFavoriteMovies()
}