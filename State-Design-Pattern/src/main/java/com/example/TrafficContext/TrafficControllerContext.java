package com.example.TrafficContext;

import com.example.TrafficStates.RedState;
import com.example.TrafficStates.TrafficState;

public class TrafficControllerContext {
    TrafficState state;

    public TrafficControllerContext() {
        state = new RedState();
    }

    public void next(){
        state.next(this);
    }

    public void setState(TrafficState state){
        this.state = state;
    }

    public String getColor(){
        return state.getColor();
    }
}
