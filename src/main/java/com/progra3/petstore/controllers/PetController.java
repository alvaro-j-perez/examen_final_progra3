package com.progra3.petstore.controllers;

import java.util.List;

import com.progra3.petstore.entities.Pet;
import com.progra3.petstore.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Pets")
public class PetController {

	@Autowired
	PetService service;

	@GetMapping()
	public List<Pet> findAll(){
		return service.listAll();
	}

	@GetMapping(value = "/{id}")
	public Pet findPet(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping()
	public Pet createPet(@RequestBody Pet pet) {
		pet.setId(null);
		return service.createPet(pet);
	}

	@PutMapping(value = "/{id}")
	public Pet updatePet(@PathVariable Long id, @RequestBody Pet pet) {
		return service.updatePet(id, pet);
	}

	@DeleteMapping(value = "/{id}")
	public void deletePet(@PathVariable Long id) {
		service.deletePet(id);
	}

}