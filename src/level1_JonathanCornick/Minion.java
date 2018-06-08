package level1_JonathanCornick;

public class Minion {

	String name;
	int e;
	String color;
	String master;

	public Minion(String name, int e, String color, String master) {
		this.name=name;
		this.e=e;
		this.color = color;
		this.master=master;
	}
	String getName(){
		return this.name;
		
	}
	int getEyes() {
		return this.e;
	}
	String getColor() {
		return this.color;
	}
	String getMaster() {
		return this.master;
	}
	void setName(String newName) {
		this.name= newName;
	}
	void setName(int newEyes) {
		this.e = newEyes;
	}
	void setColor(String newColor) {
		this.color= newColor;
	}
	void setMaster(String newMaster) {
		this.master = newMaster;
	}
	
}
