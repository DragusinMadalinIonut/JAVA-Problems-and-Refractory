package Refractoring;

public interface Enemy {
	public void moveShip();
	public void makeShipAttaack();

}

class Galax implements Enemy{
//bellow is the obvious way to use the interface
	private int attackPower = 5;
	private int spacesMovedPerTurn = 2;
	
	
	@Override
	public void moveShip() {
		System.out.println("Galax moves" + spacesMovedPerTurn + "spaces");
		
	}

	@Override
	public void makeShipAttaack() {
		System.out.println("Galax does" + attackPower + "damage");
		
	}
	
}

//now the creation of the adaptee. A class that does not follow the rules
//set up in the interface. It does not implement the interface.

class GalaxPrime{
	protected String name = "Galaxian Prime";
	private int attackP =15;
	protected int spacesMovedPerTurn =4;
	
	
	public void turnOnForceField(){
		System.out.println(name + "turns on force field");
	}
	public void warpToSpace() {
		System.out.println(name + "warps" + spacesMovedPerTurn + "spaces moved");
	}
	
	public void chargePhasers() {
		System.out.println(name + "charges phasers");
		
	}
	public void firePhasers() {
		System.out.println(name + "fires phasers for" + attackP);
		
	}
	
}


//adapter provides different option for the methods defined in the interface
//adapter contains object adaptee
class EnemyAdapter implements Enemy{

	GalaxPrime galaxPrime;
	
	public EnemyAdapter(GalaxPrime galaxPrime) {
		super();
		this.galaxPrime = galaxPrime;
	}

	
	@Override
	public void moveShip() {
		galaxPrime.turnOnForceField();
		galaxPrime.warpToSpace();
		
	}

	@Override
	public void makeShipAttaack() {
		
		galaxPrime.chargePhasers();
		galaxPrime.firePhasers();
	}
	
}

class TestEnemyAdapter{
	
	public static void main(String[] args) {
		
		Enemy galax = new Galax();
		
		GalaxPrime galaxPrimeAdaptee = new GalaxPrime();
		Enemy galaxPrime = new EnemyAdapter(galaxPrimeAdaptee);
		
		galax.moveShip();
		galax.makeShipAttaack();
		
		System.out.println();
		
		galaxPrime.moveShip();
		galaxPrime.makeShipAttaack();
	}
}