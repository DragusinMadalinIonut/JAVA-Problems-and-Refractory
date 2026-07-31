package Refractoring;

public class FootballPlayer {

    private double strikerRating;
    private int runnedMeters;
    private int passesReceived;
    private int shotsTaken;
    private int goals;
    private int avgPoints;
    private int interceptions;
//good constructors
    public FootballPlayer(double strikerRating,
                          int runnedMeters,
                          int passesReceived,
                          int shotsTaken,
                          int goals,
                          int avgPoints,
                          int interceptions) {

        this.strikerRating = strikerRating;
        this.runnedMeters = runnedMeters;
        this.passesReceived = passesReceived;
        this.shotsTaken = shotsTaken;
        this.goals = goals;
        this.avgPoints = avgPoints;
        this.interceptions = interceptions;
    }
    
    public double getstrikerRating() {
    	return strikerRating;
    }

    //Creation method
    public static FootballPlayer createS(double strikerRating, int goals) {
    	return new FootballPlayer(strikerRating, goals, 0, 0, 0, 0, 0);
    }
  
    public static void main(String[] args) {
    	FootballPlayer Marcel = FootballPlayer.createS(9.4, 16);
    	System.out.println("Marcel Striker Rating " + Marcel.getstrikerRating());
    }
}
//bad constructors . Too many constructors that part the attributes into too many parameters.
	// TODO Auto-generated method stub
//	FootballPlayer(int ShotsTaken, int interceptions){
//		this.ShotsTaken = ShotsTaken;
//		this.interceptions = interceptions;
//	};
//	FootballPlayer(int runnedMeters){
//		this.runnedMeters = runnedMeters;
//	};
//}
