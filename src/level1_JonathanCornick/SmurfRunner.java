package level1_JonathanCornick;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf H = new Smurf("Handy");
		System.out.println(H.getName());
		H.eat();
		System.out.println(H.getHatColor());
		System.out.println(H.isGirlOrBoy());
		Smurf P = new Smurf("Papa");
		P.eat();
		System.out.println(P.getName());
		System.out.println(P.getHatColor());
		System.out.println(P.isGirlOrBoy());
		Smurf S = new Smurf("Smurfette");
		S.eat();
		System.out.println(S.getName());
		System.out.println(S.getHatColor());
		System.out.println(S.isGirlOrBoy());
	}
}
/*
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g 2.
 * In a Runner class, make a Handy Smurf. Use the methods below to make him eat,
 * and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy. 6. Make a
 * Smurfette and print her name, hat color and girl or boy.
 */