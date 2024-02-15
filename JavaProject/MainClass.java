package oop.maltepe.edu.tr;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter dog's name: ");
		String dogName = scanner.nextLine();
		System.out.println("Enter cat's name: ");
		String catName = scanner.nextLine();
		
		DogClass dog = new DogClass(dogName);
		CatClass cat = new CatClass(catName);
		
		dog.makeSound();
		cat.makeSound();
		
		Random random = new Random();
		for (int round = 1; round <= 1000; round++) {
			System.out.println("Round " + round);
			
			dog.move(random.nextInt(101), random.nextInt(101));
			cat.move(random.nextInt(101), random.nextInt(101));
			
			System.out.println(dog.name + " position is: " + dog.getPosition());
			System.out.println(cat.name + " position is: " + cat.getPosition());
			
			if (Math.abs(dog.getX() - cat.getX()) <= 5 && Math.abs(dog.getY() - cat.getY()) <= 5) {
				System.out.println(dog.name + " and " + cat.name + " are fighting now");
			}
			if (dog.getX() == 50 && dog.getY() == 50 && cat.getX() == 50 && cat.getY() == 50) {
				System.out.println("Game is Over");
				break;
			}
		}
		
	}

}
