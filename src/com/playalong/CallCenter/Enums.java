package com.playalong.CallCenter;

public class Enums {


    public enum CallStatus {
        SUCCESS,
        FAILED
    }

    public enum Rank {
        OPERATOR,
        SUPERVISOR,
        DIRECTOR
    }

    public enum CallState {
        READY,
        IN_PROGRESS,
        COMPLETED
    }
}
