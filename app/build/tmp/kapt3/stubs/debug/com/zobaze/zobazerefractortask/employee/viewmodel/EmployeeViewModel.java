package com.zobaze.zobazerefractortask.employee.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0013J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\nH\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/zobaze/zobazerefractortask/employee/viewmodel/EmployeeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/zobaze/zobazerefractortask/employee/listeners/FetchEmployeeApiListener;", "repository", "Lcom/zobaze/zobazerefractortask/employee/repository/EmployeeRepository;", "(Lcom/zobaze/zobazerefractortask/employee/repository/EmployeeRepository;)V", "_employeeResponseErrorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "_employeesLiveData", "Lcom/zobaze/zobazerefractortask/employee/model/EmployeeResponse;", "employeeResponseErrorLiveData", "getEmployeeResponseErrorLiveData", "()Landroidx/lifecycle/MutableLiveData;", "employeesLiveData", "Landroidx/lifecycle/LiveData;", "getEmployeesLiveData", "()Landroidx/lifecycle/LiveData;", "fetchEmployeeApiListenerCallBack", "", "result", "Lcom/zobaze/zobazerefractortask/employee/Response/ApiResult;", "fetchEmployeeData", "shuffleDataAccordingToRequirement", "employeeResponse", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class EmployeeViewModel extends androidx.lifecycle.ViewModel implements com.zobaze.zobazerefractortask.employee.listeners.FetchEmployeeApiListener {
    @org.jetbrains.annotations.NotNull()
    private final com.zobaze.zobazerefractortask.employee.repository.EmployeeRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.zobaze.zobazerefractortask.employee.model.EmployeeResponse> _employeesLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _employeeResponseErrorLiveData = null;
    
    @javax.inject.Inject()
    public EmployeeViewModel(@org.jetbrains.annotations.NotNull()
    com.zobaze.zobazerefractortask.employee.repository.EmployeeRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.zobaze.zobazerefractortask.employee.model.EmployeeResponse> getEmployeesLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEmployeeResponseErrorLiveData() {
        return null;
    }
    
    public final void fetchEmployeeData() {
    }
    
    @java.lang.Override()
    public void fetchEmployeeApiListenerCallBack(@org.jetbrains.annotations.NotNull()
    com.zobaze.zobazerefractortask.employee.Response.ApiResult<com.zobaze.zobazerefractortask.employee.model.EmployeeResponse> result) {
    }
    
    private final void shuffleDataAccordingToRequirement(com.zobaze.zobazerefractortask.employee.model.EmployeeResponse employeeResponse) {
    }
}