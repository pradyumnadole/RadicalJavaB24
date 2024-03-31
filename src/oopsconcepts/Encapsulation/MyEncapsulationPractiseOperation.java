package oopsconcepts.Encapsulation;

public class MyEncapsulationPractiseOperation {
	
	public void studentData(MyEncapsulationPractise obj) {
		
		if(obj.getStdname()!=null) {
			System.out.println("Student name is " + obj.getStdname());
		}
		
		if(obj.getStdrollno()!=0) {
			System.out.println("Student roll no is " + obj.getStdrollno());
		}
		
		if(obj.getStdbusno()!=0) {
			System.out.println("Student bus no is " + obj.getStdbusno());
		}
		
	}

}
