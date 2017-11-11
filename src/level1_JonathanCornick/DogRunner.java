package level1_JonathanCornick;

public class DogRunner {
	public static void main(String[] args) {
		Dog d = new Dog("Fluffy", 2, 10);
		d.speak();
		d.bark();
		Dog f = new Dog("Loki", 3, 2);
		f.speak();
		f.bark();
	}

}
