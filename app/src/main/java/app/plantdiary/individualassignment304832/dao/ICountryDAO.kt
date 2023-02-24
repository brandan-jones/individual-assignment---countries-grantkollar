package app.plantdiary.individualassignment304832.dao

import app.plantdiary.individualassignment304832.dto.Country
import retrofit2.Call
import retrofit2.http.GET

interface ICountryDAO {
    @GET("/")
    fun getAllCountries(): Call<ArrayList<Country>>
}