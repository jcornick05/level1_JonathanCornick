package level1_JonathanCornick;

public class Athlete {  //static means just one being shared
	static int runnerCount = 0;
	int shirtNumber;
	int speed;
	private String name;
	static String location = "Solana Beach";
	public Athlete (String runnerName, int runnerSpeed) {
		this.name=runnerName;
		this.speed=runnerSpeed;
		runnerCount++;
		shirtNumber = runnerCount;
		
	}
	public static void main(String[] args) {
		Athlete Sean = new Athlete("Sean", 500);
		Athlete Jessie = new Athlete("Jessie", 1000);
		Athlete Jonny = new Athlete("Jonny", 2000);
		System.out.println(Sean.name + " " + Sean.shirtNumber);
		System.out.println(runnerCount);
		System.out.println(location);
		System.out.println(Jonny.name+" is running at " + location);
		Jessie.location = "Big Bear";
	    System.out.println(Jonny.name + " is running at "+Jonny.location+" " +Jessie.name+ " is running at "+ Jessie.location);
	
	}
}
