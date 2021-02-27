package com.petclinicspring.com.bootstrap;

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

	@Autowired
	public DataLoader(OwnerService ownerService, VetService vetService) {
    this.ownerService = ownerService;
    this.vetService = vetService;
  }


@Override
  public void run(String... args) throws Exception {
	
	Owner owner1 = new Owner();
	owner1.setFirstName("Michael");
	owner1.setId(1L);
	owner1.setLastName("Weston");
	ownerService.save(owner1);
	
	Owner owner2 = new Owner();
	owner2.setFirstName("Fist");
	owner2.setId(2L);
	owner2.setLastName("Giennama");
	ownerService.save(owner2);
	
	System.out.println("Loaded Owner");
	Vet vet = new Vet();
	vet.setId(1L);
	vet.setFirstName("Sam");
	vet.setLastName("Axe");
	vetService.save(vet);
	
	Vet vet1 = new Vet();
	vet1.setId(2L);
	vet1.setFirstName("Samy");
	vet1.setLastName("Jaxe");
	vetService.save(vet1);
	
}
}
