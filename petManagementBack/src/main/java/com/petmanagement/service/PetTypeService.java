package com.petmanagement.service;

import com.petmanagement.model.PetType;
import com.petmanagement.repository.PetTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetTypeService {
    private final PetTypeRepository petTypeRepository;
    @Autowired
    public PetTypeService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    public List<PetType> getAllPetTypes() {
        return petTypeRepository.findAll();
    }
}
