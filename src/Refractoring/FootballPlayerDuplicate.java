package Refractoring;

public class FootballPlayerDuplicate {
	
	private String PlayerName="";
	private String Club ="";
	private double HundredDash = 0.0;
	private int RepsLegBench =0;
	private double KMRAN= 0.0;
	
	public String getPlayerName() {return PlayerName;}
	public String getClub() {return Club;}
	public double getHundredDash() {return HundredDash;}
	public int getRepsLengBench() {return RepsLegBench;}
	public double getKMRAN() {return KMRAN;}

public FootballPlayerDuplicate(String PlayerName, String Club,
	double HundredDash,int RepsLegBench, double KMRAN) {
this.PlayerName = PlayerName;
this.Club = Club;
this.HundredDash = HundredDash;
this.RepsLegBench = RepsLegBench;
this.KMRAN = KMRAN;
}


//	public FootballPlayerDuplicate(String PlayerName, String Club,
//			double HundredDash,int RepsLegBench) {
//		this.PlayerName = PlayerName;
//		this.Club = Club;
//		this.HundredDash = HundredDash;
//		this.RepsLegBench = RepsLegBench;
//	}
	
//	public FootballPlayerDuplicate(String PlayerName, String Club,
//			double HundredDash, double KMRAN) {
//		this.PlayerName = PlayerName;
//		this.Club = Club;
//		this.HundredDash = HundredDash;
//		this.KMRAN = KMRAN;
//	}
			 
//Chaining constructors is the answer for when construcotr names repeat
//Make a single Constructor fix the problem	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FootballPlayerDuplicate Ionel = new FootballPlayerDuplicate("Ionel Marian", "Juventus", 2.5 ,400 , 10 );
		System.out.println(Ionel.getPlayerName());
	}

}
