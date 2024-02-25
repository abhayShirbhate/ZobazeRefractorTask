package com.zobaze.zobazerefractortask.employee.hilt_module;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/zobaze/zobazerefractortask/employee/hilt_module/EmployeeRepositoryModule;", "", "()V", "provideEmployeeRepository", "Lcom/zobaze/zobazerefractortask/employee/repository/EmployeeRepository;", "employeeService", "Lcom/zobaze/zobazerefractortask/retrofit/EmployeeService;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
public final class EmployeeRepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.zobaze.zobazerefractortask.employee.hilt_module.EmployeeRepositoryModule INSTANCE = null;
    
    private EmployeeRepositoryModule() {
        super();
    }
    
    @dagger.Provides()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @org.jetbrains.annotations.NotNull()
    public final com.zobaze.zobazerefractortask.employee.repository.EmployeeRepository provideEmployeeRepository(@org.jetbrains.annotations.NotNull()
    com.zobaze.zobazerefractortask.retrofit.EmployeeService employeeService) {
        return null;
    }
}