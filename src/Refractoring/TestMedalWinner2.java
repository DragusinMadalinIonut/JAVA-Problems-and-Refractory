/*
 * Create a class named Athlete with subclasses for medals(Gold , Silver, Bronze)
 * Once an Athlete receives a medal no other Athletes can be assigned to that subclass
 * The program isn't allowed to contain conditional statements
 */

package Refractoring;

import java.lang.reflect.Method;


public class TestMedalWinner2 {
	
	private String athleteName ="";
	
	public String getAthleteName() {
		return athleteName;
	}
	public void setAthleteName(String athleteName) {
		this.athleteName = athleteName;
	}
	//Singleton Restricts a class to 1 Object
	public static TestMedalWinner2 getInstance() {
		return null;//is never gonna be called
		
	}
	

}
class GoldWinner extends TestMedalWinner2{
	
	private static GoldWinner goldAthlete = null;
	private GoldWinner(String athleteName) {
		setAthleteName(athleteName);
	}
	
	public static GoldWinner getInstance(String athleteName) {

		if(goldAthlete == null) {
			
			goldAthlete = new GoldWinner(athleteName);
		}
		return goldAthlete;
	}
}

class Silverwinner extends TestMedalWinner2{
	
	private static Silverwinner silverAthlete = null;
	private Silverwinner(String athleteName) {
		setAthleteName(athleteName);
	}
	
	public static Silverwinner getInstance(String athleteName) {

		if(silverAthlete == null) {
			
			silverAthlete= new Silverwinner(athleteName);
		}
		return silverAthlete;
	}
}

class BronzeWinner extends TestMedalWinner2{
	
	private static BronzeWinner bronzeAthlete = null;
	private BronzeWinner(String athleteName) {
		setAthleteName(athleteName);
	}
	
	public static BronzeWinner getInstance(String athleteName) {

		if(bronzeAthlete == null) {
			
			bronzeAthlete = new BronzeWinner(athleteName);
		}
		return bronzeAthlete;
	}
}

//factory class
class MedalFactory{
	public TestMedalWinner2 getMetal(String medalType,String athleteName) {
	    try {
	        // 1. Find the static "getInstance" method inside the dynamic medalType class.
	        // It expects a single String parameter.
	        Method getInstanceMethod = Class.forName(medalType).getMethod("getInstance", String.class);
	        
	        // 2. Invoke the static method. Pass 'null' for static, followed by the runtime variable.
	        // Cast the returned Object directly to the expected 'Athlete' type.
	        TestMedalWinner2 result = (TestMedalWinner2) getInstanceMethod.invoke(null, athleteName);
	        
	        // 3. Return the created Athlete object
	        return result;

	    } catch (Exception e) {
	        // Catches ClassNotFoundException, NoSuchMethodException, IllegalAccessException, etc.
	        throw new IllegalArgumentException("Invalid Athlete Type", e);
	    }

}


class TestMedalWinner{
	public static void main(String[] args) {
		MedalFactory medalFactory = new MedalFactory();
		
		TestMedalWinner2 goldWinner = medalFactory.getMetal("GoldWinner", "Mircea Ion");
		TestMedalWinner2 SilverWinner = medalFactory.getMetal("silverWinner", "Tandara Luca");
		TestMedalWinner2 BronzeWinner = medalFactory.getMetal("Bronzeinner", "Marian Vintila");
		
		
		System.out.println("GoldWinner: " + goldWinner.getAthleteName());
		System.out.println("SilverWinner: " + SilverWinner.getAthleteName());
		System.out.println("BronzeWinner: " + BronzeWinner.getAthleteName());
		
	}

	private String athleteName ="";
	
	public String getAthleteName() {
		return athleteName;
	}
}
}

