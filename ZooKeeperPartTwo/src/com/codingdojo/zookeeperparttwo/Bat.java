package com.codingdojo.zookeeperparttwo;

// 1- Create a Bat class that can fly(), eatHumans(), and attackTown() and has a default energy level of 300.
public class Bat extends Mammal{
	//  CONSTRUCTOR :
	public Bat() {
		this.energyLevel=300; 
	}
	
// 2- For the fly() method, print the sound a bat taking off and decrease its energy by 50.
	public void fly() {
		System.out.print("any sound of a bat");
		decrease(50);
	}
	
// 3- For the eatHumans() method, print the so- well, never mind, just increase its energy by 25.
	public void eatHumans() {
		System.out.println("so- well, never mind");
		increase(25);
	}
	
// 4- For the attackTown() method, print the sound of a town on fire and decrease its energy by 100.
	public void attackTown() {
		System.out.println("any sound of a town");
		decrease(100);
	}
	
	
	
	

	
	
	

}
