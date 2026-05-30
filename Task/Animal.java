class Animal
{
	void eat()
	{
		System.out.println("Animals eat food..");
	}
}
class Cat extends Animal
{
	void drink()
	{
		System.out.println("Cat drink milk..");
	}
}
class Dog extends Cat
{
	void bark()
	{
		System.out.println("Dog is barking..");
	}
}
class Main
{
	public static void main(String args[])
	{
		Dog a = new Dog();
		a.eat();
		a.drink();
		a.bark();
	}
}