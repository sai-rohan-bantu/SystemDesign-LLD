package com.example;


import com.example.Approvers.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Visitor Pattern Example");
        Approver supervisor = new Supervisor();
        Approver manager = new Manager();
        Approver director = new Director();
        Approver hr= new Hr();

        supervisor.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(hr);

        supervisor.approveRequest(8);
    }
}