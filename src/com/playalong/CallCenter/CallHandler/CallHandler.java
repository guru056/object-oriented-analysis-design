package com.playalong.CallCenter.CallHandler;

import com.playalong.CallCenter.*;

import java.util.List;

public abstract class CallHandler {

    protected CallCenter callCenter;
    protected CallRequest callRequest;

    //will need access to callCenter and callRequest
    private CallHandler next;

    public CallHandler(CallCenter callCenter, CallRequest callRequest) {
        this.callCenter = callCenter;
        this.callRequest = callRequest;
    }

    public CallHandler setNext(CallHandler next) {
        this.next = next;
        return this;
    }

    public CallResponse processCall() {
        if (this.next == null) {
            return new CallResponse(Enums.CallStatus.FAILED, "No one is free");
        }
        return this.next.processCall();
    }

    protected boolean assignRandomEmployee(List<Employee> employees) {
        Employee employeeAssigned = Utils.getRandomEmployee(employees);
        if (employeeAssigned != null) {
            try {
                employeeAssigned.takeCall(callRequest);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
