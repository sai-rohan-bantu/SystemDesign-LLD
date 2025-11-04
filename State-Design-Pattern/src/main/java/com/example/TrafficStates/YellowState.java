package com.example.TrafficStates;

public class YellowState implements TrafficState {

    @Override
    public void next(com.example.TrafficContext.TrafficControllerContext context) {
        System.out.println("Switching from YELLOW to RED. Stop!");
        context.setState(new RedState());
    }

    @Override
    public String getColor() {
        return "Yellow";
    }
}
