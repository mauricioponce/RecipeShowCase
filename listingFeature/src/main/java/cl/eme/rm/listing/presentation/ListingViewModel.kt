package cl.eme.rm.listing.presentation

import androidx.lifecycle.ViewModel
import cl.eme.rm.core.domain.BResult
import cl.eme.rm.core.domain.dto.Recipe
import cl.eme.rm.listing.businesslogic.GetRecipesUseCase
import kotlinx.coroutines.flow.flow

class ListingViewModel (private val getRecipesUseCase: GetRecipesUseCase) : ViewModel() {

    fun getRecipes() = flow<List<Recipe>> {
        when (val result = getRecipesUseCase()) {
            is BResult.Success -> emit(result.value)
            is BResult.Failure -> emit(emptyList())
        }
    }
}