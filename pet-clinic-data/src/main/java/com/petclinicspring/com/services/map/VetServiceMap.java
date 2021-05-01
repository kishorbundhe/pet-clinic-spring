package com.petclinicspring.com.services.map;

import com.petclinicspring.com.models.Speciality;
import com.petclinicspring.com.models.Vet;
import com.petclinicspring.com.services.SpecialtyService;
import com.petclinicspring.com.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long>
        implements VetService {
    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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
        if(object.getSpecialities().size()>0){
            object.getSpecialities().forEach( speciality -> {
                if(speciality.getId()==null){
                    Speciality savedSpeciality= specialtyService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(object);
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
