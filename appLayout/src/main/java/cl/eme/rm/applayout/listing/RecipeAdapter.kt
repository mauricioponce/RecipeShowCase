package cl.eme.rm.applayout.listing

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.eme.rm.applayout.databinding.ItemBinding
import cl.eme.rm.core.domain.dto.Recipe

class RecipeAdapter : RecyclerView.Adapter<RecipeViewHolder>() {

    //TODO esta Recipe debe ser de la vista
    private var recipes = listOf<Recipe>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val itemBinding = ItemBinding.inflate(LayoutInflater.from(parent.context))
        return RecipeViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bind(recipes[position])
    }

    override fun getItemCount() = recipes.size
    fun update(recipesUpdated: List<Recipe>) {
        recipes = recipesUpdated
        notifyDataSetChanged()
    }
}

class RecipeViewHolder(val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(recipe: Recipe) {
        binding.tvName.text = recipe.name
    }
}
