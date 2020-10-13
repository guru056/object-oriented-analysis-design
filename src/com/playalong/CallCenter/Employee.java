package com.playalong.CallCenter;

public class Employee {

    protected int id;
    protected String name;
    protected Enums.Rank rank;
    protected boolean isEngaged;

    public Employee(int id, String name, Enums.Rank rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.isEngaged = false;
    }

    public void setEngaged(boolean engaged) {
        isEngaged = engaged;
    }

    public void setRank(Enums.Rank rank) {
        this.rank = rank;
    }

    public Enums.Rank getRank() {
        return rank;
    }

    public void completeCall(CallRequest call) {
        call.setState(Enums.CallState.COMPLETED);
        isEngaged = false;
    }

    public void takeCall(CallRequest call) throws Exception {
        if (isEngaged)
            throw new Exception("Call cannot be completed.");
        call.setState(Enums.CallState.IN_PROGRESS);
        isEngaged = true;
    }

}
