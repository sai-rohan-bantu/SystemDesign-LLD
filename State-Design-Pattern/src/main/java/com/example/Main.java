package com.example;

import com.example.TrafficContext.TrafficControllerContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("State Design Pattern Example");

        TrafficControllerContext trafficLight = new TrafficControllerContext();
        trafficLight.next(); // RED -> GREEN
        trafficLight.next(); // GREEN -> YELLOW
        trafficLight.next();
        trafficLight.next();
    }
}