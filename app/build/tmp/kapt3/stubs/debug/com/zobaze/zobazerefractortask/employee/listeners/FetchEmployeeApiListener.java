package com.zobaze.zobazerefractortask.employee.listeners;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/zobaze/zobazerefractortask/employee/listeners/FetchEmployeeApiListener;", "", "fetchEmployeeApiListenerCallBack", "", "result", "Lcom/zobaze/zobazerefractortask/employee/Response/ApiResult;", "Lcom/zobaze/zobazerefractortask/employee/model/EmployeeResponse;", "app_debug"})
public abstract interface FetchEmployeeApiListener {
    
    public abstract void fetchEmployeeApiListenerCallBack(@org.jetbrains.annotations.NotNull()
    com.zobaze.zobazerefractortask.employee.Response.ApiResult<com.zobaze.zobazerefractortask.employee.model.EmployeeResponse> result);
}