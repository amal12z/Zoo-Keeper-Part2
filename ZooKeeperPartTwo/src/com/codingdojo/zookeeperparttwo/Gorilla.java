package com.codingdojo.zookeeperparttwo;

	//2- Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()

public class Gorilla extends Mammal{
	
	// 3- For the throwSomething() method, have it print out a message indicating that 
	// the gorilla has thrown something, as well as decrease the energy level by 5.
	
	public void throwSomething() {
		System.out.println("The gorilla has thrown something !");
		decrease(5);
		// System.out.println("The energy Level after throw Something : "+energyLevel);
	}
	
	// 4-  For the eatBananas() method, have it print out a message indicating 
	// the gorilla's satisfaction and increase its energy by 10
	public void eatBananas() {
		System.out.println("The gorilla is happy now !");
		increase(10);
		// System.out.println("The energy Level after eat Bananas : "+energyLevel);
	}
	
	// 5- For the climb() method, have it print out a message indicating 
	// the gorilla has climbed a tree and decrease its energy by 10
	public void climb() {
		System.out.println("The gorilla has climbed a tree");
		decrease(10);
		// System.out.println("The energy Level after climb : "+energyLevel);
	}
	
	
	
}
