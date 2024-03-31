package oopsconcepts.Inheritence;

public class B24MyMethodOverridingParentTest {

	public static void main(String[] args) {
		B24MyMethodOverridingParent parent = new B24MyMethodOverridingParent();
		parent.createuser("New", 0, "new@gmail.com");
		
		B24MyMethodOverridingChild child = new B24MyMethodOverridingChild();
		child.createuser("Pradyumna", 0, "pd@gmail.com");

	}

}
