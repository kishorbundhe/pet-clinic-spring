package com.petclinicspring.com.repositories;

import com.petclinicspring.com.models.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
