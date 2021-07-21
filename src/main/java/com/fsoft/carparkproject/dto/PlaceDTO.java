package com.fsoft.carparkproject.dto;

import com.fsoft.carparkproject.entity.Place;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PlaceDTO {
    private Long id;
    private String name;
    public PlaceDTO(Place place){
        this.id = place.getId();
        this.name = place.getPlaceName();
    }

}
