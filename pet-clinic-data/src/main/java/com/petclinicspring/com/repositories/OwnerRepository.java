package com.petclinicspring.com.repositories;

import com.petclinicspring.com.models.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository  extends CrudRepository<Owner,Long> {
}
