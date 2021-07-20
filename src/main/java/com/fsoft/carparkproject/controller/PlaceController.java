package com.fsoft.carparkproject.controller;

import com.fsoft.carparkproject.model.Place;
import com.fsoft.carparkproject.service.interfaces.IPlaceService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("place")
public class PlaceController {
    private final IPlaceService placeService;
    private final ModelMapper mapper;

    public PlaceController(IPlaceService placeService, ModelMapper mapper) {
        this.placeService = placeService;
        this.mapper = mapper;
    }
    @GetMapping(path = "/all")
    public List<Place> getAllPlace(){
        return placeService.getAllPlace();
    }
    @PostMapping(path = "/insert")
    public void insertPlace(@RequestBody Place place){
        placeService.insertPlace(place);
    }
    @DeleteMapping(path ="/delete")
    public void deletePlace(@RequestParam("id") Long id){
        placeService.deletePlace(id);
    }
    @PutMapping(path = "/update")
    public void updatePlace(@RequestParam("id") Long id, @RequestBody Place place){
        placeService.updatePlace(id,place);
    }
}
