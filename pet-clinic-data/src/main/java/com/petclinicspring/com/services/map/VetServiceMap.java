package com.petclinicspring.com.services.map;

import com.petclinicspring.com.models.Vet;
import com.petclinicspring.com.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long>
    implements VetService {

  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public Vet findById(Long id) {

    return this.findById(id);
  }

  @Override
  public Vet save(Vet object) {

    return super.save(object.getId(), object);
  }

  @Override
  public void delete(Vet object) {
    super.delete(object);
  }

  @Override
  public void deleteById(Long id) {

    super.deleteById(id);
  }
  
}
