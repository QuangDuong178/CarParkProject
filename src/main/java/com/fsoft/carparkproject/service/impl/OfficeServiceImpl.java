package com.fsoft.carparkproject.service.impl;

import com.fsoft.carparkproject.dto.OfficeDTO;

import com.fsoft.carparkproject.model.Office;
import com.fsoft.carparkproject.model.Place;
import com.fsoft.carparkproject.repository.OfficeRepository;
import com.fsoft.carparkproject.repository.PlaceRepository;
import com.fsoft.carparkproject.repository.TripRepository;
import com.fsoft.carparkproject.service.interfaces.IOfficeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class OfficeServiceImpl implements IOfficeService {
    private final OfficeRepository officeRepository;
    private final PlaceRepository placeRepository;
    private final TripRepository tripRepository;
    private final ModelMapper mapper;
    @Autowired
    public OfficeServiceImpl(OfficeRepository officeRepository, PlaceRepository placeRepository, TripRepository tripRepository, ModelMapper mapper) {
        this.officeRepository = officeRepository;
        this.placeRepository = placeRepository;
        this.tripRepository = tripRepository;
        this.mapper = mapper;
    }
    @Override
    public List<Office> getAllOffice(){
        List<Office> listOffice = officeRepository.findAll();
        return listOffice;
    }
    @Override
    public void addOffice(OfficeDTO office){
        Office newOffice = mapper.map(office,Office.class);
        newOffice.setPlaces(placeRepository.getById(office.getPlace_id()));
        newOffice.setTrip(tripRepository.getById(office.getTrip_id()));

        officeRepository.save(newOffice);
    }
    @Override
    public void deleteOffice(Long id){
        if(!officeRepository.existsById(id)){
            officeRepository.deleteById(id);
        }else{
            throw new IllegalStateException("No id founded");
        }
    };
    @Override
    public void getOfficeById(Long id){
        Optional<Office> office = Optional.ofNullable(officeRepository.findById(id).orElseThrow(() -> new IllegalStateException("Office with id " + id + " is not exist")));
    }
    @Transactional
    @Override
    public void updateOffice(Long id,OfficeDTO newOficeDTO){
        Office office = officeRepository.findById(id).orElseThrow(()-> new IllegalStateException("Office with id "+ id + " is not exist"));
        Office newOffice = mapper.map(newOficeDTO,Office.class);
        newOffice.setId(office.getId());
        newOffice.setPlaces(office.getPlaces());
        newOffice.setTrip(office.getTrip());
        officeRepository.save(newOffice);

    }
}
