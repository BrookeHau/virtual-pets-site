package org.wecancodeit.virtualpetthymeleaf;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class VirtualPetRepository {

	Map<Long, VirtualPet> pets = new HashMap<>();

	public VirtualPetRepository() {
		VirtualPet petOne = new VirtualPet(1L, "Brooke", 5, 5, 5);
		VirtualPet petTwo = new VirtualPet(2L, "David", 5, 2, 4);
		VirtualPet petThree = new VirtualPet(3L, "Asa", 3, 1, 5);
		VirtualPet petFour = new VirtualPet(4L, "Heather", 2, 1, 7);

		pets.put(petOne.getId(), petOne);
		pets.put(petTwo.getId(), petTwo);
		pets.put(petThree.getId(), petThree);
		pets.put(petFour.getId(), petFour);
	}
	
	private void populateVirtualPet(VirtualPet...pets) {
		for(VirtualPet pet : pets) {
			this.pets.put(pet.getId(), pet);
		}
	}
	
	public VirtualPetRepository(VirtualPet...pet) {
		populateVirtualPet(pet);
	}
	
	public VirtualPet findOne(long petId) {
		return pets.get(petId);
	}
	
	public void feedPet(VirtualPet pet) {
		pet.feedPet(1);
	}
	public Collection<VirtualPet> findAll(){
		return pets.values();
	}

}
