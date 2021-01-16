package com.petclinicspring.com.services;

import java.util.Set;

import com.petclinicspring.com.models.Vet;

public interface VetService {
	Vet findById(Long id);
	Vet save();
	Set<Vet> findAll();
}
