/*
 * Create a class named Athlete with subclasses for medals(Gold , Silver, Bronze)
 * Once an Athlete receives a medal no other Athletes can be assigned to that subclass
 * The program isn't allowed to contain conditional statements
 */

package Refractoring;

import java.lang.reflect.Method;


public class Athlete{
	private String athleteName ="";
	
	public String getAthleteName() {
		return athleteName;
		
	}
	public void setAthleteName(String athleteName) {
		this.athleteName = athleteName;
}
	public static Athlete getInstance() {
		return null;
}
}
class GoldWinner extends Athlete {

    private static GoldWinner goldAthlete = null;

    GoldWinner(String athleteName) {
        setAthleteName(athleteName);
    }

    public static GoldWinner getInstance(String athleteName) {
        if (goldAthlete == null) {
            goldAthlete = new GoldWinner(athleteName);
        }
        return goldAthlete;
    }
}

class SilverWinner extends Athlete {

    private static SilverWinner silverAthlete = null;

    SilverWinner(String athleteName) {
        setAthleteName(athleteName);
    }

    public static SilverWinner getInstance(String athleteName) {
        if (silverAthlete == null) {
        	silverAthlete = new SilverWinner(athleteName);
        }
        return silverAthlete;
    }
}

class BronzeWinner extends Athlete {

    private static BronzeWinner bronzeAthlete = null;

    BronzeWinner(String athleteName) {
        setAthleteName(athleteName);
    }

    public static BronzeWinner getInstance(String athleteName) {
        if (bronzeAthlete == null) {
        	bronzeAthlete = new BronzeWinner(athleteName);
        }
        return bronzeAthlete;
    }
}


//factory class
/*class MedalFactory{
	public Athlete getMetal(String medalType,String athleteName) {
	    try {
	        // 1. Find the static "getInstance" method inside the dynamic medalType class.
	        // It expects a single String parameter.
	        Method getInstanceMethod = Class.forName(medalType).getMethod("getInstance", String.class);
	        Object[] params = new Object[] {new String(athleteName)};
	        // 2. Invoke the static method. Pass 'null' for static, followed by the runtime variable.
	        // Cast the returned Object directly to the expected 'Athlete' type.
	     // 3. Return the created Athlete object
	        return (Athlete) getInstanceMethod.invoke(null, params);
	        


	    } catch (Exception e) {
	        // Catches ClassNotFoundException, NoSuchMethodException, IllegalAccessException, etc.
	        throw new IllegalArgumentException("Invalid Athlete Type", e);
	    }

}
}
*/class MedalFactory {
    public Athlete getMetal(String type, String name) {
        if (type == null) {
            return null;
        }
        
        // Normalize the input string
        switch (type.trim().toLowerCase()) {
            case "goldwinner":
            case "gold":
                return new GoldWinner(name);
            case "silverwinner":
            case "silver":
                return new SilverWinner(name);
            case "bronzewinner":
            case "bronze":
                return new BronzeWinner(name);
            default:
                throw new IllegalArgumentException("Winner type not found: " + type);
        }
    }
}

 class TestMedalWinner {

	    public static void main(String[] args) {
	        MedalFactory medalFactory = new MedalFactory();
	        
	        // Instantiate athletes using the factory
	        Athlete goldWinner = medalFactory.getMetal("GoldWinner", "Mircea Ion");
	        Athlete silverWinner = medalFactory.getMetal("silverWinner", "Tandara Luca");
	        Athlete bronzeWinner = medalFactory.getMetal("BronzeWinner", "Marian Vintila");
	        
	        // Print athlete names
	        System.out.println("Gold Winner: " + goldWinner.getAthleteName());
	        System.out.println("Silver Winner: " + silverWinner.getAthleteName());
	        System.out.println("Bronze Winner: " + bronzeWinner.getAthleteName());
	    }
	}






