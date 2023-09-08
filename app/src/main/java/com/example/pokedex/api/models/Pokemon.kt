package com.example.pokedex.api.models

data class Pokemon(
    val forms: List<Form>,
    val height: Int,
    val id: Int,
    val name: String,
    val order: Int,
    val sprites: Sprites,
    val stats: List<Stat>,
    val types: List<Type>,
    val weight: Int
)