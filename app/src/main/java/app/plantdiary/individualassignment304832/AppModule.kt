package app.plantdiary.individualassignment304832


import androidx.lifecycle.ViewModel
import app.plantdiary.individualassignment304832.service.CountryService
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    viewModel { MainViewModel() }
}