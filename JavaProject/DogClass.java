package oop.maltepe.edu.tr;

public class DogClass extends AnimalClass  {
	
	public DogClass(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println(name + " is barked!");
	}

}
