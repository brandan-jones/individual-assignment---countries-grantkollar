package app.plantdiary.individualassignment304832

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import app.plantdiary.individualassignment304832.dto.Country


class MainViewModel() : ViewModel() {
    val countries : MutableLiveData<List<Country>> = MutableLiveData<List<Country>>()
    fun fetchCountries(){

    }

}
