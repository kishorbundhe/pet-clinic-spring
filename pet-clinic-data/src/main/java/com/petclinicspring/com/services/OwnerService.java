package com.petclinicspring.com.services;

import java.util.Set;

import com.petclinicspring.com.models.Owner;

public interface OwnerService {
	Owner findById(Long id);
	Owner save();
	Set<Owner> findAll();
	Owner findByLastName(String lastName);
}
