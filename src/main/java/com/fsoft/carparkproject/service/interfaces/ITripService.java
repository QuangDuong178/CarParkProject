package com.fsoft.carparkproject.service.interfaces;

import com.fsoft.carparkproject.entity.Trip;

import java.util.List;

public interface ITripService {
    List<Trip> getAllTrip();
    void insertTrip(Trip trip);
    void deleteTrip(Long id);
    void updateTrip(Long id, Trip place);
}
