package com.petclinicspring.com.services.map;

import com.petclinicspring.com.models.Owner;
import com.petclinicspring.com.services.PetService;
import com.petclinicspring.com.services.PetTypeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class OwnerMapServiceTest {

    @Mock
    PetTypeService petTypeService;
    @Mock
    PetService petService;

    @InjectMocks
    OwnerMapService service;

    Owner owner;

    @BeforeEach
    void setUp() {
        owner = Owner.builder().id(1L).address("DAT NAGAR").lastName("Bundhe").build();
        service.save(owner);
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = service.findAll();
        assertNotNull(ownerSet);
        assertEquals(ownerSet.size(), 1);
    }

    @Test
    void findById() {
        Owner owner1= service.findById(1l);
        assertEquals(owner1,owner);
    }

    @Test
    void save() {
        Long id= 2L;
        Owner owner2= Owner.builder().id(2L).firstName("Kishor").build();
        service.save(owner2);
        assertEquals(id,owner2.getId());
    }

    @Test
    void delete() {
        service.delete(owner);
        assertEquals(0,service.findAll().size());
    }

    @Test
    void deleteById() {
        service.deleteById(owner.getId());
        assertEquals(0,service.findAll().size());
    }

    @Test
    void findByLastName() {
        Owner owner1= service.findByLastName("Bundhe");
        assertEquals( owner,owner1);
    }
    @Test
    void findByLastNameNotExist() {
        Owner owner1= service.findByLastName("Bundhe1");
        assertNull(owner1);
    }
}