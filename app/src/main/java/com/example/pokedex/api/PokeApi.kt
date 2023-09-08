package com.example.pokedex.api

import com.example.pokedex.api.models.Pokemon
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {
    @GET("pokemon/{name}")
    suspend fun setPokemon(@Path("name") name : String) : Pokemon
}