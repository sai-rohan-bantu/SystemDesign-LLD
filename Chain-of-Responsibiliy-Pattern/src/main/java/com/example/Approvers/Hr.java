package com.example.Approvers;

public class Hr extends Approver{
    @Override
    public void approveRequest(int leaveDays) {
        System.out.println("HR: Leave request requires further discussion.");
    }
}
