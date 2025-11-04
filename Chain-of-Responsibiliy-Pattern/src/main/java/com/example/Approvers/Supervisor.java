package com.example.Approvers;

public class Supervisor extends Approver{
    @Override
    public void approveRequest(int request) {
        if(request <= 2){
            System.out.println("Supervisor approved request of amount: " + request);
        } else if(nextApprover != null){
            nextApprover.approveRequest(request);
        }
    }
}
