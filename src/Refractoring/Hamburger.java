package Refractoring;

/*
 * Template method is used to transform specific code
 * into general purpose code.
 * When objects perform similar steps in the same order
 * we implement similar code in a template method and allow
 * subclasses to override the varieties in the behaviour
 */

public class Hamburger {

	public Hamburger() {
		// TODO Auto-generated constructor stub
		//series of different types of sandwhiches
		//creating a bunch of bolleans as a startin implmentations
		/*
		 * We need to make a constructor that would have a lot of the booleans 
		 * inside of it
		 */
		private boolean customerWantsCondiments = true;
		Hamburger(boolean wantsCondiments){
			customerWantsCondiments = wantsCondiments;
			
		}
		private makeSandwich() {
			//going thorugh the necessarya ctons to creat a sandwich
			cutBun();
			
			addMeat();
			
			addVegetables();
			
			if(customerWantsContiments);
		}
		wrapSandwich();
	}
}



}
