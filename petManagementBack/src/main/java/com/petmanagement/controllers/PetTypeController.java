package com.petmanagement.controllers;

import com.petmanagement.model.PetType;
import com.petmanagement.service.PetTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/petTypes")
public class PetTypeController {
    private final PetTypeService petTypeService;

    public PetTypeController(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<PetType>> getAllPetTypes() {
        List<PetType> petTypes = petTypeService.getAllPetTypes();
        return new ResponseEntity<>(petTypes, HttpStatus.OK);
    }
}
