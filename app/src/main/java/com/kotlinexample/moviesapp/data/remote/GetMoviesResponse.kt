package com.kotlinexample.moviesapp.data.remote

import com.google.gson.annotations.SerializedName
import com.kotlinexample.moviesapp.models.Movie
import com.kotlinexample.moviesapp.models.Tv

data class GetMoviesResponse(
    @SerializedName("page") val page: Int,
    @SerializedName("results") val movies: List<Movie>,
    @SerializedName("total_pages") val pages: Int
)