package com.petclinicspring.com.models;

import java.time.LocalDate;

public class Pet extends BaseEntity{

	private PetType petType;
	private Owner owner;
	private LocalDate birDate;
	public PetType getPetType() {
		return petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public LocalDate getBirDate() {
		return birDate;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public void setBirDate(LocalDate birDate) {
		this.birDate = birDate;
	}
	
}
