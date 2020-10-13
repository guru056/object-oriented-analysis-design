package com.playalong.CallCenter;

public class CallRequest {

    private int requestId;
    private String fromPhone;
    private Enums.CallState state;

    public void setState(Enums.CallState state) {
        this.state = state;
    }
}
