package com.example.bus_delay_tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class BusDelayService {
    @Autowired
    private RestTemplate restTemplate;


    public List<BusArrival> getBusArrival(String Id){
        String url = "https://api.tfl.gov.uk/StopPoint/" + Id + "/Arrivals?app_key=5388ff22c930407fa7411f8ab69c2c31";


        return List.of(Objects.requireNonNull(restTemplate.getForObject(url, BusArrival[].class)));
    }
}
