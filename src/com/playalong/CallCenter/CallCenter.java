package com.playalong.CallCenter;

import com.playalong.CallCenter.CallHandler.CallHandler;
import com.playalong.CallCenter.CallHandler.DirectorCallHandler;
import com.playalong.CallCenter.CallHandler.OperatorCallHandler;
import com.playalong.CallCenter.CallHandler.SupervisorCallHandler;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

public class CallCenter implements Serializable   {

    static List<Employee> employees;
    static CallCenter callCenter;

    private CallCenter() {}

    public static CallCenter getInstance() {
        if (callCenter == null) {
            return new CallCenter();
        }
        return callCenter;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public CallResponse handleCall(CallRequest request) {
        CallHandler callHandler = (new OperatorCallHandler(this, request))
                                    .setNext(new SupervisorCallHandler(this, request))
                                    .setNext(new DirectorCallHandler(this, request));
        return callHandler.processCall();
    }

    public List<Employee> getNonEngagedEmployeesByRank(Enums.Rank rank) {
        return Utils.getNonEngagedEmployeesByRank(employees, rank);
    }

    protected Object readResolve() {
        return callCenter;
    }
}
