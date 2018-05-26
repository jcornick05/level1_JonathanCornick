package level1_JonathanCornick;

public class Person {
String name;
String superpower;
public Person(String name, String superpower) {
	this.name = name;
	this.superpower = superpower;
}
//setter
void setPower(String newSuperpower) {
	 this.superpower = newSuperpower;
}
//getter
String getName() {
	return this.name;
}
String getPower() {
	return this.superpower;
}

}
