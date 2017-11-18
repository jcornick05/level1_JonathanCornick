package level1_JonathanCornick;

public class HarryPotterRunner {
	public static void main(String[] args) {
		// 1. make harry potter
		HarryPotter g = new HarryPotter();
		// 2. become invisible
		g.makeInvisible(true);
		// 3. spy on professor snape
		g.spyOnSnape();
		// 4. become visible again
		g.makeInvisible(false);
		// 5. cast a “stupefy” spell
		g.castSpell("Stupefy");
	}

}
