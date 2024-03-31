package Excercise;

public class MyOverrideProgramGamesTest {

	public static void main(String[] args) {

		// Regular way of declaring object
		MyOverrideProgramGames obj = new MyOverrideProgramGames();
		obj.noOfPlayer();
		System.out.println("1===================================");
		
		// Regular way of declaring object + inheritence concept
		MyOverrideProgramIndoorGames obj1 = new MyOverrideProgramIndoorGames();
		obj1.noOfPlayer();
		obj1.groudAreaRequired();
		
		System.out.println("2===================================");
		// Regular way of declaring object + inheritence concept
		MyOverrideProgramOutdoorGames obj2 = new MyOverrideProgramOutdoorGames();
		obj2.noOfPlayer();
		obj2.groudAreaRequired();
		
		System.out.println("3===================================");
		// Regular way of declaring object + inheritence concept + Method Override
		MyOverrideBadminton obj3 = new MyOverrideBadminton();
		obj3.equipRequied(); // from Badminton class
		obj3.groudAreaRequired(); // from Indoor class
		obj3.noOfPlayer(); // from Badminton class - method overriding
		System.out.println("4===================================");
		
		// Regular way of declaring object + inheritence concept + Method Override
		MyOverrideCricket obj4 = new MyOverrideCricket();
		obj4.equipRequied();// from Cricket class
		obj4.groudAreaRequired();// from Outdoor class
		obj4.noOfPlayer();// from Cricket class - method overriding
		System.out.println("5===================================");
		
		// Creating reference of games + inheritence concept + Method Override
		MyOverrideProgramGames obj5 = new MyOverrideProgramIndoorGames();
		obj5.noOfPlayer(); //from Games class
		// obj5.groudAreaRequired(); //Not accessible
		System.out.println("6===================================");
		
		// Creating reference of games + inheritence concept + Method Override
		MyOverrideProgramGames obj6 = new MyOverrideProgramOutdoorGames();
		obj6.noOfPlayer();//from Games class
		// obj6.groudAreaRequired(); //Not accessible
		System.out.println("7===================================");
		
		// Creating reference of games + inheritence concept + Method Override
		MyOverrideProgramGames obj7 = new MyOverrideBadminton();
		obj7.noOfPlayer();//from Badminton class
		// obj7.equipRequied();//Not accessible
		System.out.println("8===================================");
		
		// Creating reference of games + inheritence concept + Method Override
		MyOverrideProgramGames obj8 = new MyOverrideCricket();
		obj8.noOfPlayer();//from Cricket class
		// obj8.equipRequied();//Not accessible
		System.out.println("9===================================");
		
		// Creating reference of indoor games + inheritence concept + Method Override
		MyOverrideProgramIndoorGames obj9 = new MyOverrideBadminton();
		obj9.groudAreaRequired(); //from indoor class
		obj9.noOfPlayer(); //from Badminton class
		System.out.println("10===================================");
		
		// Creating reference of outdoor games + inheritence concept + Method Override
		MyOverrideProgramOutdoorGames obj10 = new MyOverrideCricket();
		obj10.groudAreaRequired();//from outdoor class
		obj10.noOfPlayer();//from Cricket class

	}
}
