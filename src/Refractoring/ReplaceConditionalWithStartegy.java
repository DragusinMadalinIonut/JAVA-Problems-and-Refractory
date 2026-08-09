package Refractoring;


//create subclasses for each algorithm we encounter
//
public class ReplaceConditionalWithStartegy {

	public ReplaceConditionalWithStartegy() {
		// TODO Auto-generated constructor stub
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee salesman = new Salesman(15000.00);
		Employee secretary = new Secretary(15000.00);
		System.out.println("Salesman" + salesman.getPay());
		System.out.println("Secrrtary" + secretary.getPay());
	
		salesman.setBonusOption(new GetBonus());
		System.out.println("Salesman" + salesman.getPay());
	
	}

}

class Employee{
	protected double salary = 0.0;
	public Pay paytype = new NoBonus();
	
	Employee(double salary){
		this.salary= salary;
		}
	
	Employee(double salary, Pay payType){
		this.salary = salary;
		this.paytype = payType;
	}
	public void setBonusOption(Pay newPayType) {
		paytype = newPayType;
	}
	public double getPay() 
	{
		return paytype.getPay(this.salary);
	}
}

interface Pay{
	//amazing only one line
	double getPay(double salary);
}

class GetBonus implements Pay{
	public double getPay(double salary) {
		return salary + (salary *.15);
	}
}


class NoBonus implements Pay{
	public double getPay(double salary) {
		return salary;
	}
}

class Bonus20 implements Pay{
	public double getPay(double salary) {
		return salary + salary * .20;
	}
}
class Salesman extends Employee{
	Salesman(double salary){
		super(salary);
	}
	Salesman(double salary, Pay payType){
		super(salary);
		setBonusOption(payType);
		}
}

class Secretary  extends Employee{
	Secretary (double salary){
		super(salary);
	}
	Secretary (double salary, Pay payType){
		super(salary);
		setBonusOption(payType);
		}
}
