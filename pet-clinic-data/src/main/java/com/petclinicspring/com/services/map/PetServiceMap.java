package com.petclinicspring.com.services.map;

import java.util.Set;

import com.petclinicspring.com.models.Pet;
import com.petclinicspring.com.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long>
    implements CrudService<Pet, Long> {

  @Override
  public Set<Pet> findAll() {
    return super.findAll();
  }

  @Override
  public Pet findById(Long id) {

    return this.findById(id);
  }

  @Override
  public Pet save(Pet object) {

    return super.save(object.getId(), object);
  }

  @Override
  public void delete(Pet object) {
    super.delete(object);
  }

  @Override
  public void deleteById(Long id) {

    super.deleteById(id);
  }
  
}
