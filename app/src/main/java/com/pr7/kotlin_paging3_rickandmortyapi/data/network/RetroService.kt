package com.pr7.kotlin_paging3_rickandmortyapi.data.network

import com.pr7.kotlin_paging3_rickandmortyapi.data.model.RickAndMortyModel
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {


    @GET("character")
    suspend fun getDataFromApi(@Query("page") page:Int):RickAndMortyModel
}