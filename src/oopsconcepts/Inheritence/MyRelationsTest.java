package oopsconcepts.Inheritence;

public class MyRelationsTest {

	public static void main(String[] args) {
		MyInheritencePractise_Grandpa obj = new MyInheritencePractise_Grandpa();
		obj.show();
		
		MyInheritencePractise_Dad obj1 = new MyInheritencePractise_Dad();
		obj1.show();
		obj1.age();
		
		MyInheritencePractise_Me obj2 = new MyInheritencePractise_Me();
		obj2.show();
		obj2.myage();
		
		MyInheritencePractise_Grandpa obj3= new MyInheritencePractise_Dad();
		obj3.show();
		//obj3.age(); not accessible
		
		MyInheritencePractise_Grandpa obj4= new MyInheritencePractise_Me();
		obj4.show();
		//obj4.age(); not accessible
		//obj4.myage(); not accessible
		
		MyInheritencePractise_Dad obj5= new MyInheritencePractise_Me();
		obj5.show();
		obj5.age();
		
		//it will throw class cast exception, not supported program, reverse of inheritence
//		MyInheritencePractise_Me obj6 = (MyInheritencePractise_Me) new MyInheritencePractise_Grandpa();
//		obj6.age();
//		obj6.show();
	}

}
