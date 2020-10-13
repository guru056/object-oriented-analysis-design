package com.playalong.CallCenter;

public class CallResponse {
    private Enums.CallStatus status;
    private String message;

    public CallResponse(Enums.CallStatus status, String message) {
        this.status = status;
        this.message = message;
    }
}
