package com.example.pokedex

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokedex.api.PokeApi
import com.example.pokedex.api.RetroFitClient
import com.example.pokedex.api.models.Pokemon
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    val client = RetroFitClient.client.create(PokeApi::class.java)

    private val _pokemon : MutableLiveData<Pokemon> = MutableLiveData()
    val pokemon : LiveData<Pokemon>
        get() = _pokemon

    fun getPokemon(pokemon: String) {
        viewModelScope.launch {
            _pokemon.value = client.setPokemon(pokemon)
            Log.d("Main activity", _pokemon.value.toString())
        }
    }
}