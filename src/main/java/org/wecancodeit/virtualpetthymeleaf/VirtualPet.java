package org.wecancodeit.virtualpetthymeleaf;

public class VirtualPet {

	public int hunger;
	public int thirst;
	public int boredom;
	public int tick;
	public String name;
	public Long petId;

	public VirtualPet(Long petId, String name, int hunger, int thirst, int boredom) {
		this.petId = petId;
		this.name = name;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
	}

	public Long getId() {
		return petId;
	}
	public String getName() {
		return name;
	}
	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getTick() {
		return tick;
	}

	public void feedPet(int amountToFeedPet) {
		hunger += amountToFeedPet;
		thirst += (amountToFeedPet + 1);
	}

	public void waterPet(int amountToWaterPet) {
		thirst += amountToWaterPet;
	}

	public void playWithPet(int amountOfPlay) {
		boredom -= amountOfPlay;
	}

	public void doNothing(int doNothingAmount) {
		hunger += doNothingAmount;
		thirst += doNothingAmount;
		boredom += (doNothingAmount * 2);
	}

	public void tick() {
		hunger += 2;
		thirst += 1;
		boredom -= 3;
	}

}
