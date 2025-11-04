package com.example.Approvers;

public abstract class Approver {
    public Approver nextApprover;
    public void setNextApprover(Approver approver){
        this.nextApprover = approver;
    }
    public abstract void approveRequest(int request);
}
