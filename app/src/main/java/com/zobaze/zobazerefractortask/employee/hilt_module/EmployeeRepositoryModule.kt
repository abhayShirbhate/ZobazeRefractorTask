package com.zobaze.zobazerefractortask.employee.hilt_module

import com.zobaze.zobazerefractortask.employee.repository.EmployeeRepository
import com.zobaze.zobazerefractortask.employee.repository.EmployeeRepositoryImpl
import com.zobaze.zobazerefractortask.retrofit.EmployeeService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
object EmployeeRepositoryModule {

    @ViewModelScoped
    @Provides
    fun provideEmployeeRepository(
        employeeService: EmployeeService
    ): EmployeeRepository {
        return EmployeeRepositoryImpl(employeeService)
    }
}