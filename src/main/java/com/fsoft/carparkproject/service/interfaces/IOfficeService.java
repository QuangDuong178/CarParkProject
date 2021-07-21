package com.fsoft.carparkproject.service.interfaces;

import com.fsoft.carparkproject.dto.OfficeDTO;
import com.fsoft.carparkproject.entity.Office;

import java.util.List;

public interface IOfficeService {
    List<Office> getAllOffice();
    void addOffice(OfficeDTO office);
    void deleteOffice(Long id);
    void getOfficeById(Long id);
    void updateOffice(Long id, OfficeDTO newOfice);
}
