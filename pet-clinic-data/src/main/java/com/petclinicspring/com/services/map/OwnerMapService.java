package com.petclinicspring.com.services.map;

import com.petclinicspring.com.models.Owner;
import com.petclinicspring.com.models.Pet;
import com.petclinicspring.com.services.OwnerService;
import com.petclinicspring.com.services.PetService;
import com.petclinicspring.com.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

@Service
@Profile({"default", "map"})
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {
    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }


    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {

        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        if (object != null) {
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType().getId() != null) {
                        pet.setPetType(petTypeService.save(pet.getPetType()));
                    } else {
                        throw new RuntimeException("Pet Type is Required");
                    }
                    if (pet.getId() == null) {
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.save(object);
        } else {
            return null;
        }

    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {

        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {// TODO Auto-generated method stub
        return map.entrySet().stream().
                filter(owner -> owner.getValue().getLastName().equals(lastName)).
                findFirst().
                map(Map.Entry::getValue).
                orElse(null);
    }

}
