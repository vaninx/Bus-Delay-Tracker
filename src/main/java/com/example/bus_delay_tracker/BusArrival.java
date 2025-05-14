package com.example.bus_delay_tracker;

public class BusArrival {
    String lineName;
    String destinationName;
    String expectedArrival;

    public BusArrival(){};

    public BusArrival(String lineName, String destinationName, String expectedArrival){
        this.lineName = lineName;
        this.destinationName = destinationName;
        this.expectedArrival = expectedArrival;
    }


}
