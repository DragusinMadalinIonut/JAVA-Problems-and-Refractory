package Refractoring;

//part 1 of extracting methods
public class FootballPlayer2 {
	
	private String name = "";
	private double[] hundredMetersDash = {4.32, 4.29, 4.27};;

	public FootballPlayer2(String name, double[] mihaiV100MDashTimes) {
		this.name = name;
		this.hundredMetersDash = mihaiV100MDashTimes;
	}

	public String getName() { return name;}
	

	public double[] get100MDashTimes() {
		// TODO Auto-generated method stub
		return hundredMetersDash;
	}



}
