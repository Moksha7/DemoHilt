package com.example.demohilt.api

import com.example.demohilt.data.model.Movie

data class MovieResponse(
    val results: List<Movie>,
)