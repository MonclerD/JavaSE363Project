package oop.maltepe.edu.tr;

public class CatClass extends AnimalClass {
	public CatClass(String name) {
		super(name);
	}
	
	@Override
	public void makeSound() {
		System.out.println(name + " is meowed!");
	}

}
