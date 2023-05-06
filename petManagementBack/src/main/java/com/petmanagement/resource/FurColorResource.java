package com.petmanagement.resource;

import com.petmanagement.model.FurColor;
import com.petmanagement.service.FurColorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/furColors")
public class FurColorResource {
    private final FurColorService furColorService;

    public FurColorResource(FurColorService furColorService) {
        this.furColorService = furColorService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<FurColor>> getAllFurColors() {
        List<FurColor> furColors = furColorService.getAllFurColors();
        return new ResponseEntity<>(furColors, HttpStatus.OK);
    }
}
