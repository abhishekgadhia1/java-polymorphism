package practice;


class Animal
{
	void makeSound()
	{
		System.out.println("JBKJBJKBKJB");
	}
}


class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("Meow");
	}
}


	public class Jungle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
		Animal cat = new Cat();
		animal.makeSound();
		cat.makeSound();

	}

}
