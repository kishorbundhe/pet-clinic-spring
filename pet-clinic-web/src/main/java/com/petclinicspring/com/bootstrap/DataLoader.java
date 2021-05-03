package com.petclinicspring.com.bootstrap;

import com.petclinicspring.com.models.*;
import com.petclinicspring.com.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;
    private final VisitService visitService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
        this.visitService = visitService;
    }


    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        Speciality radiology = new Speciality();
        radiology.setDescription("radiology");
        Speciality savedRadiology = specialtyService.save(radiology);

        Speciality dentistry = new Speciality();
        radiology.setDescription("dentistry");
        Speciality savedDentistry = specialtyService.save(dentistry);

        Speciality surgery = new Speciality();
        radiology.setDescription("surgery");
        Speciality savedSurgery = specialtyService.save(surgery);

        PetType dog = new PetType();
        dog.setName("Sheru");
        PetType SavedDogPetType = petTypeService.save(dog);

        PetType Cat = new PetType();
        dog.setName("Shila");
        PetType SavedCatPetType = petTypeService.save(Cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickeles");
        owner1.setCity("Miami");
        owner1.setTelephone("12334545");


        Pet pet1 = new Pet();
        pet1.setName("ROSCO");
        pet1.setPetType(SavedDogPetType);
        pet1.setOwner(owner1);
        pet1.setBirDate(LocalDate.now());
        owner1.getPets().add(pet1);

        ownerService.save(owner1);
        Visit visit= new Visit();
        visit.setDescription("Snizzity kitttyyy");
        visit.setDate(LocalDate.now());
        visit.setPet(pet1);
        visitService.save(visit);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fist");
        owner2.setLastName("Giennama");
        owner2.setAddress("123 Brickeles");
        owner2.setCity("Miami");
        owner2.setTelephone("32456567");

        Pet pet2 = new Pet();
        pet2.setName("ROSCO");
        pet2.setPetType(SavedCatPetType);
        pet2.setOwner(owner2);
        pet2.setBirDate(LocalDate.now());
        owner2.getPets().add(pet2);

        ownerService.save(owner2);

        System.out.println("Loaded Owner");
        Vet vet = new Vet();

        vet.setFirstName("Sam");
        vet.setLastName("Axe");
        vetService.save(vet);

        Vet vet1 = new Vet();

        vet1.setFirstName("Samy");
        vet1.setLastName("Jaxe");
        vet1.getSpecialities().add(savedDentistry);
        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Hughes");
        vet2.setLastName("Nolan");
        vet2.getSpecialities().add(savedDentistry);
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);
    }
}
