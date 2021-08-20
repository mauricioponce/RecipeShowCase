package cl.eme.recipemanager.di

import cl.eme.rm.core.domain.RecipesRepository
import cl.eme.rm.data.RecipesRepositoryImpl
import cl.eme.rm.listing.businesslogic.GetIngredientsUseCase
import cl.eme.rm.listing.businesslogic.GetIngredientsUseCaseImp
import cl.eme.rm.listing.businesslogic.GetRecipesUseCase
import cl.eme.rm.listing.businesslogic.GetRecipesUseCaseImp
import cl.eme.rm.listing.presentation.ListingViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    // single instance of repository
    single<RecipesRepository> { RecipesRepositoryImpl() }

    // single instance of use cases
    single<GetRecipesUseCase> { GetRecipesUseCaseImp(get()) }
    single<GetIngredientsUseCase> { GetIngredientsUseCaseImp(get()) }


    // MyViewModel ViewModel
    viewModel { ListingViewModel(get()) }
}