package com.petmanagement.resource;

import com.petmanagement.model.Pet;
import com.petmanagement.service.PetsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetResource {
    private final PetsService petsService;

    public PetResource(PetsService petsService) {
        this.petsService = petsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Pet>> getAllPets() {
        List<Pet> pets = petsService.findAllPets();
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Pet> addPet(@RequestBody Pet pet) {
        Pet newPet = petsService.addPet(pet);
        return new ResponseEntity<>(newPet, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Pet> updatePet(@RequestBody Pet pet) {
        Pet updatedPet = petsService.updatePet(pet);
        return new ResponseEntity<>(updatedPet, HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> updatePet(@PathVariable("id") Long id) {
        petsService.deletePet(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/findUserPets/{id}")
    public ResponseEntity<List<Pet>> getUserPets(@PathVariable("id") Long id) {
        List<Pet> pets = petsService.findPetsByUserId(id);
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }


}
