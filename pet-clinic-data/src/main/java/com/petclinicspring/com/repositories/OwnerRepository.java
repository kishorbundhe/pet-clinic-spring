package com.petclinicspring.com.repositories;

import com.petclinicspring.com.models.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface OwnerRepository  extends CrudRepository<Owner,Long> {
    public Owner findByLastName(String lastname);
}
