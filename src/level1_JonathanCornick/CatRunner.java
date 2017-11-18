package level1_JonathanCornick;

public class CatRunner {
	public static void main(String[] args) {
		Cat x = new Cat("Fluffy");

		/* Do the following things without changing the Cat class */

		// 1. Make the Cat meow
		x.meow();
		// 2. Get the Cat to print it's name
		x.printName();
		// 3. Kill the Cat!
		for (int i = 0; i < 19; i++) {
			x.kill();
		}
	}

}
