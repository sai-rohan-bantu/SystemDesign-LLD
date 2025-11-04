package com.example.TrafficStates;

import com.example.TrafficContext.TrafficControllerContext;

public interface TrafficState {
     void next(TrafficControllerContext context);
     String getColor();
}
