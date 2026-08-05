package Refractoring;

//Replacing Conditionals with Strategy Pattern
public class CalculateSalary {

	/*
	 * Calculating salary depends on rates or conditions for bonus
	 * this means a lot of conditionals.
	 * A strategy pattern should eliminate most of these prboles.
	 */
	
	/*
	 * Strategy pattern allows us to not make new changes in the code. We will just make a new class
	 * which an be integrated at the necessary time
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//As long as nothing changes the code should work
		
		employees salesman = new employees(true,15000.00);
		employees secretary= new employees(true,20000.00);
	
		System.out.println("Salesman" + salesman.getSalary());
		System.out.println("Secrrtary" + secretary.getSalary());
	}

}

class employees{
	private boolean bonus = false;
	private double salary = 0.0;
	
	private double bonusAmount= .15;
	
	public employees(boolean bonus, double salary) {
		super();
		this.bonus = bonus;
		this.salary = salary;
	}
	//for bonus ammount there needeed to be made another constructor
	public employees(boolean bonus, double salary, double bonusAmount) {
		super();
		this.bonus = bonus;
		this.salary = salary;
		this.bonusAmount=bonusAmount;
	}
	public employees() {}
	public double getSalary() {
		if(bonus) {
			return salary + (salary * bonusAmount);
		}
		return salary;
		
	}
	public void getSalary(double salary) {
		this.salary = salary;
	}
}
