package com.petclinicspring.com.services.map;

import java.util.Set;

import com.petclinicspring.com.models.Owner;
import com.petclinicspring.com.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long>
    implements CrudService<Owner, Long> {

  @Override
  public Set<Owner> findAll() {
    return super.findAll();
  }

  @Override
  public Owner findById(Long id) {

    return this.findById(id);
  }

  @Override
  public Owner save(Owner object) {

    return super.save(object.getId(), object);
  }

  @Override
  public void delete(Owner object) {
    super.delete(object);
  }

  @Override
  public void deleteById(Long id) {

    super.deleteById(id);
  }
  
}
