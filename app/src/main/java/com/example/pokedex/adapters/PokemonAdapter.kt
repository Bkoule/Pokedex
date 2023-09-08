package com.example.pokedex.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.pokedex.R
import com.example.pokedex.api.models.Pokemon

class PokemonAdapter : RecyclerView.Adapter<PokemonAdapter.viewHolder>() {

    private var pokemons : List<Pokemon> = mutableListOf()

    class viewHolder(view: View) : ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_pokemon,parent,false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int {
        return pokemons.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

    }

    fun updatePokemon(pokemon : List<Pokemon>) {
        this.pokemons = pokemons
        notifyDataSetChanged()
    }
}