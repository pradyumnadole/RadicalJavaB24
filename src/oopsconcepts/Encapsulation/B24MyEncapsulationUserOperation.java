package oopsconcepts.Encapsulation;

public class B24MyEncapsulationUserOperation {

	public void createUser (B24MyEncapsulation obj) {
		
		if (obj.getSname()!=null) {
		//selenium code to enter	
			if(obj.getSname()=="Pradyumna") {
				System.out.println("Local user "+obj.getSname());
			}else {
				System.out.println("outside user "+obj.getSname());
			}
			
		}
		if(obj.getEmpid()!=0) {
			//selenium code to enter	
			System.out.println("emp id of user " + obj.getEmpid());
		}
		if(obj.getAddress()!=null) {
			//selenium code to enter
			System.out.println("address " + obj.getAddress());
		}
		if(obj.getMob()!=0) {
			//selenium code to enter	
			System.out.println("mob number of user " + obj.getMob());
		}
		if(obj.getEducation()!=null) {
			//selenium code to enter
			System.out.println("education " + obj.getEducation());
		}
		if(obj.getHobby()!=null) {
			//selenium code to enter
			System.out.println("Hobby " + obj.getHobby());
		}
		//selenium code of submit button
	}
	
}
