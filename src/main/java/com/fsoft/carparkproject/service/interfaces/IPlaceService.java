package com.fsoft.carparkproject.service.interfaces;

import com.fsoft.carparkproject.dto.PlaceDTO;
import com.fsoft.carparkproject.model.Place;

import java.util.List;

public interface IPlaceService {
    List<Place> getAllPlace();
    void insertPlace(Place place);
    void deletePlace(Long id);
    void updatePlace(Long id, Place place);
}
