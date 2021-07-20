package com.fsoft.carparkproject.service.impl;

import com.fsoft.carparkproject.model.Trip;
import com.fsoft.carparkproject.repository.TripRepository;
import com.fsoft.carparkproject.service.interfaces.ITripService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TripServiceImpl implements ITripService {
    private final TripRepository tripRepository;
    private final ModelMapper mapper;

    public TripServiceImpl(TripRepository tripRepository, ModelMapper mapper) {
        this.tripRepository = tripRepository;
        this.mapper = mapper;
    }

    @Override
    public List<Trip> getAllTrip() {
        return tripRepository.findAll();
    }

    @Override
    public void insertTrip(Trip trip) {
        tripRepository.save(trip);
    }

    @Override
    public void deleteTrip(Long id) {
        if(tripRepository.existsById(id)){
            tripRepository.deleteById(id);
        }else{
            throw new IllegalStateException("No id existed");
        }
    }

    @Override
    public void updateTrip(Long id, Trip newTrip) {
        Long newId = tripRepository.getById(id).getId();
        newTrip.setId(newId);
        tripRepository.save(newTrip);
    }
}
