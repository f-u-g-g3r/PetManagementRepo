package com.petmanagement.service;

import com.petmanagement.model.Pet;
import com.petmanagement.repository.PetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetsService {
    private final PetsRepository petsRepository;

    @Autowired
    public PetsService(PetsRepository petsRepository) {
        this.petsRepository = petsRepository;
    }

    public Pet addPet(Pet pet) {
        if (isValid(pet)) {
            return petsRepository.save(pet);
        } else {
            return pet;
        }
    }

    public Pet updatePet(Pet pet) {
        if (isValid(pet)) {
            return petsRepository.save(pet);
        } else {
            return pet;
        }
    }

    public void deletePet(Long id) {
        petsRepository.deletePetById(id);
    }

    public List<Pet> findAllPets() {
        return petsRepository.findAll();
    }

    public List<Pet> findPetsByUserId(Long userId) {
        return petsRepository.findByUserid(userId);
    }

    private boolean isValid(Pet pet) {
        if (!(pet.getName().isEmpty()) || !(pet.getPetType().isEmpty()) || !(pet.getCode().isEmpty()) || !(pet.getCountry().isEmpty()) || !(pet.getFurColor().isEmpty())) {
            return true;
        }
        return false;
    }
}
