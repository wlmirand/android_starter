package william.miranda.gpsalarm.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import william.miranda.gpsalarm.ui.home.HomeViewModel

/**
 * Koin Module for ViewModels
 */
val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
}