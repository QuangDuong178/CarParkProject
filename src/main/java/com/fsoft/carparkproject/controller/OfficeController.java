package com.fsoft.carparkproject.controller;

import com.fsoft.carparkproject.dto.OfficeDTO;

import com.fsoft.carparkproject.entity.Office;
import com.fsoft.carparkproject.service.interfaces.IOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("office")
public class OfficeController {

    private final IOfficeService officeService;
    @Autowired
    public OfficeController(IOfficeService officeService) {
        this.officeService = officeService;
    }
    @GetMapping("/all")
    public List<Office> getAllOffice(){
        return officeService.getAllOffice();
    }
    @PostMapping("/insert")
    public void insertOffice(@RequestBody OfficeDTO office){
        officeService.addOffice(office);
    }
    @DeleteMapping(path = "/delete")
    public void deleteOffice(@RequestParam("id") Long id){
        officeService.deleteOffice(id);
    }
    @PutMapping(path = "/update")
    public void updateOffice(@RequestParam("id") Long id, @RequestBody OfficeDTO office){
        officeService.updateOffice(id,office);
    }

}
