package cl.eme.rm.applayout.di

import cl.eme.rm.core.domain.RecipesRepository
import cl.eme.rm.data.RecipesRepositoryImpl
import cl.eme.rm.listing.businesslogic.GetRecipesUseCase
import cl.eme.rm.listing.businesslogic.GetRecipesUseCaseImp
import cl.eme.rm.listing.presentation.ListingViewModel
import org.koin.dsl.module
import org.koin.androidx.viewmodel.dsl.viewModel

val listingAppModule = module {
    // single instance of CounterRepository
    single<RecipesRepository> { RecipesRepositoryImpl() }

    // single instance of use cases
    single<GetRecipesUseCase> { GetRecipesUseCaseImp(get()) }

    // MyViewModel ViewModel
    viewModel { ListingViewModel(get()) }
}