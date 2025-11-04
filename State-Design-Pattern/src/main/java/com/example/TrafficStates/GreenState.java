package com.example.TrafficStates;

import com.example.TrafficContext.TrafficControllerContext;

public class GreenState implements TrafficState {

    @Override
    public void next(TrafficControllerContext context) {
        System.out.println("Switching from GREEN to YELLOW. Prepare to stop!");
        context.setState(new YellowState());
    }

    @Override
    public String getColor() {
        return "Green";
    }
}
