package oopsconcepts.Inheritence;

public class B24CarTest {

	public static void main(String[] args) {
		
		//this is regular way to create object
		B24Car objcar = new B24Car();
		objcar.color();
		objcar.engine();
		objcar.speed();
		
		System.out.println("=====================");
		//this is regular way to create object
		B24CarBMW objbmw = new B24CarBMW();
		objbmw.color();
		objbmw.engine();
		objbmw.speed();
		objbmw.ventilatedSeat();
		objbmw.musicSystem();
		System.out.println("=====================");
		//this is regular way to create object
		B24CarBMWX5 x5 = new B24CarBMWX5();
		x5.color();
		x5.engine();
		x5.speed();
		x5.ventilatedSeat();
		x5.musicSystem();
		
		System.out.println("=RefVar====================");
		//Creating reference for B24CarBMW object
		B24Car obj = new B24CarBMW();
		obj.color();
		obj.engine();
		obj.speed();
		//obj.ventilatedSeat(); Not accessible
		//obj.musicSystem();Not accessible
		
		System.out.println("=RefVar1====================");
		//Creating reference for B24CarBMW object
		B24Car obj1 = new B24CarBMWX5();
		obj1.color();
		obj1.engine();
		obj1.speed();
		
		//not supported
//		B24CarBMWX5 objx5= (B24CarBMWX5) new B24Car();
//		objx5.color();

	}

}
