package cl.eme.rm.core.domain

import cl.eme.rm.core.domain.dto.Ingredient
import cl.eme.rm.core.domain.dto.Recipe

interface RecipesRepository {
    fun getRecipes(): SimpleResult<List<Recipe>>

    fun createRecipe(recipe: Recipe): SimpleResult<Recipe>

    fun getIngredients(): SimpleResult<List<Ingredient>>
}
