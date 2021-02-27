package com.petclinicspring.com.services;


import com.petclinicspring.com.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
  Owner findByLastName(String lastName);
}
