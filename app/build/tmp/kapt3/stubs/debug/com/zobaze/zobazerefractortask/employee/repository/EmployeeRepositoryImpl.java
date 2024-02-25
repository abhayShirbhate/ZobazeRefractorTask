package com.zobaze.zobazerefractortask.employee.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/zobaze/zobazerefractortask/employee/repository/EmployeeRepositoryImpl;", "Lcom/zobaze/zobazerefractortask/employee/repository/EmployeeRepository;", "employeeService", "Lcom/zobaze/zobazerefractortask/retrofit/EmployeeService;", "(Lcom/zobaze/zobazerefractortask/retrofit/EmployeeService;)V", "fetchEmployees", "", "fetchEmployeeApiListener", "Lcom/zobaze/zobazerefractortask/employee/listeners/FetchEmployeeApiListener;", "app_debug"})
public final class EmployeeRepositoryImpl implements com.zobaze.zobazerefractortask.employee.repository.EmployeeRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.zobaze.zobazerefractortask.retrofit.EmployeeService employeeService = null;
    
    @javax.inject.Inject()
    public EmployeeRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.zobaze.zobazerefractortask.retrofit.EmployeeService employeeService) {
        super();
    }
    
    @java.lang.Override()
    public void fetchEmployees(@org.jetbrains.annotations.NotNull()
    com.zobaze.zobazerefractortask.employee.listeners.FetchEmployeeApiListener fetchEmployeeApiListener) {
    }
}