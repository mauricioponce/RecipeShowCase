package cl.eme.rm.businesslogic.domain

import cl.eme.rm.businesslogic.domain.dto.Ingredient
import cl.eme.rm.core.domain.dto.Recipe

interface RecipesRepository {
    fun getRecipes(): SimpleResult<List<Recipe>>

    fun createRecipe(recipe: Recipe)

    fun getIngredients(): SimpleResult<List<Ingredient>>
}
