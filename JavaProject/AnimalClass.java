package oop.maltepe.edu.tr;

public abstract class AnimalClass {
	
	protected String name;
	protected int x, y;
	
	public AnimalClass(String name) {
		this.name = name;
		this.x = 0;
		this.y = 0;
	}
	
	public abstract void makeSound();
	
	public void move(int newX, int newY) {
		this.x = newX;
		this.y = newY;
	}
	
	public String getPosition() {
		return "(" + x + "," + y + ")";
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

}
