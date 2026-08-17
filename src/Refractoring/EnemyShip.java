package Refractoring;

public class EnemyShip {

	//without adapter pattern
	
	protected String name;
	private int attackPower;
	protected int spacesMovedPerTurn;

	public EnemyShip(int currentLevel) {
		if(currentLevel <=5) {
			name = "Galax";
			this.attackPower = 5;
			this.spacesMovedPerTurn=3;
			
		}else if(currentLevel > 5 || currentLevel < 10) {
			name = "Galaxian";
			this.attackPower = 10;
			this.spacesMovedPerTurn =3;
		} else if(currentLevel > 10) {
			name = "Galaxian Prime";
			this.attackPower =15;
			this.spacesMovedPerTurn =4;
		}
	}
	public void moveShip() {
		System.out.println(name + "does" + spacesMovedPerTurn+ "damage");
	}
	
	public void makeShipAttack() {
		System.out.println(name + "does" + attackPower + "damage");
	}
	
	public static void main(String[] args) {
		EnemyShip level1Ship = new EnemyShip(6);
		level1Ship.moveShip();
		level1Ship.makeShipAttack();
		
		GalaxianPrime primeTime = new GalaxianPrime(15);
		
		primeTime.moveShip();
		primeTime.makeShipAttack();
	}
}
