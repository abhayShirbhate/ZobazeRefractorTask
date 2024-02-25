package com.zobaze.zobazerefractortask.retrofit

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.scopes.ViewModelScoped
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
object RetrofitClient {
    private const val BASE_URL = "https://dummy.restapiexample.com/api/v1/"

    private fun getRetrofitInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


    @ViewModelScoped
    @Provides
    fun provideEmployeeService(): EmployeeService{
        return getRetrofitInstance().create(EmployeeService::class.java)
    }

}