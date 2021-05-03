package com.petclinicspring.com.services.springdatajpa;

import com.petclinicspring.com.models.Owner;
import com.petclinicspring.com.repositories.OwnerRepository;
import com.petclinicspring.com.services.OwnerService;
import com.petclinicspring.com.services.PetService;
import com.petclinicspring.com.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;
    private final OwnerRepository ownerRepository;

    public OwnerSDJpaService(PetTypeService petTypeService, PetService petService, OwnerRepository ownerRepository) {
        this.petTypeService = petTypeService;
        this.petService = petService;
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners= new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return  ownerRepository.findByLastName(lastName);
    }
}
