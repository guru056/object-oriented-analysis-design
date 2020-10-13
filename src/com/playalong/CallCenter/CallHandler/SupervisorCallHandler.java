package com.playalong.CallCenter.CallHandler;

import com.playalong.CallCenter.*;

import java.util.List;

public class SupervisorCallHandler extends CallHandler{

    public SupervisorCallHandler(CallCenter callCenter, CallRequest callRequest) {
        super(callCenter, callRequest);
    }

    @Override
    public CallResponse processCall() {
        List<Employee> employees = callCenter.getNonEngagedEmployeesByRank(Enums.Rank.SUPERVISOR);
        if (this.assignRandomEmployee(employees)) {
            CallResponse callResponse = new CallResponse(Enums.CallStatus.SUCCESS, "");
            return callResponse;
        }
        return super.processCall();
    }
}
