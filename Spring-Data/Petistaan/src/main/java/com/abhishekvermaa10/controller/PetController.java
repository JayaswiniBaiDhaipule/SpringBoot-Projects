package com.abhishekvermaa10.controller;

import com.abhishekvermaa10.dto.PetDTO;
import com.abhishekvermaa10.exception.PetNotFoundException;
import com.abhishekvermaa10.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

//    to find the average age of pet
    @GetMapping("/average-age")
    public ResponseEntity<Double> getAverageAgeOfPets() {
        double averageAge = petService.findAverageAgeOfPet();
        return ResponseEntity.ok(averageAge);
    }

//     to fetch the pet details
    @GetMapping("/{petId}")
    public ResponseEntity<List<PetDTO>> getPetDetails(@PathVariable int petId) throws PetNotFoundException {
        PetDTO pets = petService.findPet(petId);
        return ResponseEntity.ok(Collections.singletonList(pets));
    }





}
