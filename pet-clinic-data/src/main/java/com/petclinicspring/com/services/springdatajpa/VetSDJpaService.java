package com.petclinicspring.com.services.springdatajpa;

import com.petclinicspring.com.models.Vet;
import com.petclinicspring.com.repositories.VetRepository;
import com.petclinicspring.com.services.SpecialtyService;
import com.petclinicspring.com.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {
    private final SpecialtyService specialtyService;
    private final VetRepository vetRepository;

    public VetSDJpaService(SpecialtyService specialtyService, VetRepository vetRepository) {
        this.specialtyService = specialtyService;
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetRepository.deleteById(aLong);
    }
}
