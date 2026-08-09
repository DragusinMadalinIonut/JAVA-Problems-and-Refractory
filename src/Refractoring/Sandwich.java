package Refractoring;

//abstract acts as a skeletal framework for derived subclasses 
//must implement specific missing steps of an algorithm while the base class controls the fixed overall execution order
public abstract class Sandwich {

	//constructor is far less charged and we don't need to make mroe
	//final means no other class can ask to make a sandwich
	final void makeSandwich() {
		System.out.println("\n----NEW ORDER---\n");
	
		cutBun();
	
		if(customerWantsMeat()) {
			addMeat();
		}
		addVegetables();
		if(customerWantsCondiments()) {
			addCondiments();
		}
		warpSandwich();
	}

	//creating the classes to be overwitten
	abstract void addMeat();
	abstract void addCondiments();
	
	public void cutBun() {
		System.out.println("The Bun was Cut");
	}
	public void addVegetables() {
		System.out.println("lettuce, Onions & Tomatoes");
	}
	public void warpSandwich() {
		System.out.println("The Sandwich was Wrapped");
		
	}
	boolean customerWantsMeat() {return true;}
	boolean customerWantsCondiments() {return true;}
	

}
