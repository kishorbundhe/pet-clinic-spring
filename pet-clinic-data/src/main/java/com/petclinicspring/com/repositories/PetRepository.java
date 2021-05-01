package com.petclinicspring.com.repositories;

import com.petclinicspring.com.models.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
