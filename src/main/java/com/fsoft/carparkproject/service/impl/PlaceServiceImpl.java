package com.fsoft.carparkproject.service.impl;


import com.fsoft.carparkproject.dto.PlaceDTO;
import com.fsoft.carparkproject.model.Place;
import com.fsoft.carparkproject.repository.PlaceRepository;
import com.fsoft.carparkproject.service.interfaces.IPlaceService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceServiceImpl implements IPlaceService {
    private final PlaceRepository placeRepository;
    private final ModelMapper mapper;
    @Autowired
    public PlaceServiceImpl(PlaceRepository placeRepository, ModelMapper mapper) {
        this.placeRepository = placeRepository;
        this.mapper = mapper;
    }
    @Override
    public List<Place> getAllPlace(){
        return placeRepository.findAll();
    }
    @Override
    public void insertPlace(Place place){
           placeRepository.save(place);

    }

    @Override
    public void deletePlace(Long id) {
        if(placeRepository.existsById(id)){
            placeRepository.deleteById(id);
        }else{
            throw new IllegalStateException("No id existed");
        }

    }

    @Override
    public void updatePlace(Long id, Place newPlace) {
         Long newId = placeRepository.getById(id).getId();
         newPlace.setId(newId);
         placeRepository.save(newPlace);

    }


}
