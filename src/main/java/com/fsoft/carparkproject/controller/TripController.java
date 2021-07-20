package com.fsoft.carparkproject.controller;

import com.fsoft.carparkproject.model.Place;
import com.fsoft.carparkproject.model.Trip;
import com.fsoft.carparkproject.service.interfaces.ITripService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("trip")
public class TripController {
    private final ITripService tripService;
    private final ModelMapper mapper;
    @Autowired
    public TripController(ITripService tripService, ModelMapper mapper) {
        this.tripService = tripService;
        this.mapper = mapper;
    }


    @GetMapping(path = "/all")
    public List<Trip> getAllTrip(){
        return tripService.getAllTrip();
    }
    @PostMapping(path = "/insert")
    public void insertTrip(@RequestBody Trip trip){
        tripService.insertTrip(trip);
    }
    @DeleteMapping(path ="/delete")
    public void deleteTrip(@RequestParam("id") Long id){
        tripService.deleteTrip(id);
    }
    @PutMapping(path = "/update")
    public void updatePlace(@RequestParam("id") Long id, @RequestBody Trip trip){
        tripService.updateTrip(id,trip);
    }
}
