package com.example.Approvers;

public class Manager extends Approver{
    @Override
    public void approveRequest(int request) {
        if(request <= 5){
            System.out.println("Manager approved request of amount: " + request);
        } else if(nextApprover != null){
            nextApprover.approveRequest(request);
        }
    }
}
