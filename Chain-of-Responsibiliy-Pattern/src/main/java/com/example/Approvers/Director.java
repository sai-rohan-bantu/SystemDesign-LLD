package com.example.Approvers;

public class Director extends Approver{
    @Override
    public void approveRequest(int request) {
        if(request <= 10){
            System.out.println("Director approved request of amount: " + request);
        } else if(nextApprover != null){
            nextApprover.approveRequest(request);
        }
    }
}
