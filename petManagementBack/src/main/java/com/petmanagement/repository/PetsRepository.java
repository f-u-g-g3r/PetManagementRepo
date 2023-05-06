package com.petmanagement.repository;

import com.petmanagement.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface PetsRepository extends JpaRepository<Pet, Long> {
    void deletePetById(Long id);
    List<Pet> findByUserid(Long userId);
}
