package com.petclinicspring.com.bootstrap;

import com.petclinicspring.com.models.PetType;
import com.petclinicspring.com.services.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.petclinicspring.com.models.Owner;
import com.petclinicspring.com.models.Vet;
import com.petclinicspring.com.services.OwnerService;
import com.petclinicspring.com.services.VetService;
@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;

	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService,PetTypeService petTypeService) {
    this.ownerService = ownerService;
    this.vetService = vetService;
    this.petTypeService=petTypeService;
  }


@Override
  public void run(String... args) throws Exception {

	PetType dog= new PetType();
	dog.setName("Sheru");
	PetType SavedDogPetType=petTypeService.save(dog);

	PetType Cat= new PetType();
	dog.setName("Shila");
	PetType SavedCatPetType=petTypeService.save(dog);

	Owner owner1 = new Owner();
	owner1.setFirstName("Michael");
	owner1.setLastName("Weston");
	ownerService.save(owner1);
	
	Owner owner2 = new Owner();
	owner2.setFirstName("Fist");

	owner2.setLastName("Giennama");
	ownerService.save(owner2);
	
	System.out.println("Loaded Owner");
	Vet vet = new Vet();

	vet.setFirstName("Sam");
	vet.setLastName("Axe");
	vetService.save(vet);
	
	Vet vet1 = new Vet();

	vet1.setFirstName("Samy");
	vet1.setLastName("Jaxe");
	vetService.save(vet1);
}
}
