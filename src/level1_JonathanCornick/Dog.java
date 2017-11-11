package level1_JonathanCornick;

public class Dog {
	// variables
	String dogName;
	int dogAge;
	int dogToyNumber;

	// constructor
	public Dog(String Name, int Age, int Toys) {
		dogName = Name;
		dogAge = Age;
		dogToyNumber = Toys;

	}

	// methods
	public void speak() {
		System.out.println("My name is " + dogName + ".");
	}

	public void bark() {
		if (dogToyNumber <= 3) {
			System.out.println("Bark");
		} else {
			System.out.println("Sit");
		}
	}
}
