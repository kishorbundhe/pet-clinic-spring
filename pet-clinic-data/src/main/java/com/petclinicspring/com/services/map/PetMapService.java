package com.petclinicspring.com.services.map;

import com.petclinicspring.com.models.Pet;
import com.petclinicspring.com.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class PetMapService extends AbstractMapService<Pet, Long>
        implements PetService {

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

        return super.save(object);
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
