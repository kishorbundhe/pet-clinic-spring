package com.petclinicspring.com.services.map;

import com.petclinicspring.com.models.Speciality;
import com.petclinicspring.com.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class SpecialityMapService extends AbstractMapService<Speciality,Long> implements SpecialtyService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {

        return this.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {

        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
