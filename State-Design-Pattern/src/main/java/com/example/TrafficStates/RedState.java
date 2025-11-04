package com.example.TrafficStates;

import com.example.TrafficContext.TrafficControllerContext;

public class RedState implements TrafficState {

    @Override
    public void next(TrafficControllerContext context) {
        System.out.println("Switching from RED to GREEN. Cars go!");
        context.setState(new GreenState());
    }

    @Override
    public String getColor() {
        return "Red";
    }
}
