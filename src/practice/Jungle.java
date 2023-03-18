package practice;

class Animal
{
	public void makeSound()
	{
		System.out.println("I am the king");
	}
}

class Cat extends Animal
{
	public void makeSound()
	{
		System.out.println("meow");
	}
}

public class Jungle
{
	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		Animal animal2 = new Cat();
		animal1.makeSound();
		animal2.makeSound();
	}
}


