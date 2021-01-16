package com.petclinicspring.com.services;

import java.util.Set;

import com.petclinicspring.com.models.Pet;

public interface PetService {
	Pet findById(Long id);
	Pet save();
	Set<Pet> findAll();
}
