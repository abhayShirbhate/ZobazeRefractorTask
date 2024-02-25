package com.zobaze.zobazerefractortask.retrofit;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/zobaze/zobazerefractortask/retrofit/RetrofitClient;", "", "()V", "BASE_URL", "", "getRetrofitInstance", "Lretrofit2/Retrofit;", "provideEmployeeService", "Lcom/zobaze/zobazerefractortask/retrofit/EmployeeService;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ViewModelComponent.class})
public final class RetrofitClient {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String BASE_URL = "https://dummy.restapiexample.com/api/v1/";
    @org.jetbrains.annotations.NotNull()
    public static final com.zobaze.zobazerefractortask.retrofit.RetrofitClient INSTANCE = null;
    
    private RetrofitClient() {
        super();
    }
    
    private final retrofit2.Retrofit getRetrofitInstance() {
        return null;
    }
    
    @dagger.Provides()
    @dagger.hilt.android.scopes.ViewModelScoped()
    @org.jetbrains.annotations.NotNull()
    public final com.zobaze.zobazerefractortask.retrofit.EmployeeService provideEmployeeService() {
        return null;
    }
}