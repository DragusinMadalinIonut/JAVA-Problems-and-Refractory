package Refractoring;

//Replacing Conditionals with Polynomials.
/*
 * Conditionals change behavior depending on the type 
 * of objects the interact with
 * If you know you'll do different things on different objects
 * polymorphism should play a role.
 */
public class ReplaceConditionalWithPoly {

	
	public static void main(String[] args) {
		String doggy = "Dog";
		String kitty = "Cat";
	
		makeSound(doggy);
	}
	static void makeSound(String animal) {

	//eliminate swithc statment
		/*
		switch(animal) {
		
		case"Dog":
			System.out.println("woof");
		
	case"Cat":
		System.out.println("Meow");
		break;
		
		default:
		THROW NEW RuntimeException("I don't know that animal!")
	}
	
*/
		Animal rex = new Dog("woof");
		Animal sophie = new Cat("Meow");
		
		System.out.println(sophie.getSound());
		System.out.println(rex.getSound());
	}
	}


	//Create class instead
	class Animal {
	private String sound ="";
	public String getSound() {
		return sound;
		
	}
	public void setSound(String sound) {
		this.sound=sound;
	}
	public Animal(String sound) {
		super();
		this.sound = sound;
	}
}
	class Dog extends Animal{
		public Dog(String sound) {
			super(sound);
		}
	}
	class Cat extends Animal{
		public Cat(String sound) {
			super(sound);
		}
	}


