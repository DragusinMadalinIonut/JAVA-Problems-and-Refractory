package Refractoring;
import java.util.ArrayList;

import Refractoring.FootballPlayer2; 


		// double avg100mTime = 0.0;
		// we call printTItles directly to ease probles
		public class dash100 {

			public static class Player { 
		        String name;
		        int score;
		    }
			
			public void printPlayerInfo() {
			    printTitles();
			    printPlayersWith100Avg();
			}
			public void addFootballPlayer(FootballPlayer2 player) {
				players.add(player);
			}
			
		//this print ttittle bar
		//System.out.printf("%-15 %15", "Name", "Avg 100 Time\n");
		
		//Print dashes under titles
		//for(int i = 0 ; i < 30; i++) {System.out.println("_");}		
	//System.out.println();
	//section bellow prints players
		
	//for(FootballPlayer2 player : players) {
	//	System.out.printf("%-19s", player.getName());
	//	double total100MDashTimes = 0.0;
	//	double[] hundredMetersDash = player.get100MDashTimes();
	//}
	//for(int i=0; i< player.get100MDashTimes().length;i++) {
		//total100MDashTimes += hundredMetersDashTimes[i];
	//}
	
//	avg100MTime = total100MDashTimes / player.get100MDashTimes().length;
	
//	System.out.printf("%1$.2f", avg100MdTime);
//	System.out.println();
	
//,make everyhting simpler bty combining methods
			
			public void printTitles() {
			    System.out.printf("%-15s %15s%n", "Name", "Avg 100 Time");
			}
	ArrayList<FootballPlayer2> players = new ArrayList<FootballPlayer2>();

	
	public void printPlayersWith100Avg() {

		for (FootballPlayer2 player : players) {

	        System.out.printf("%-19s", player.getName());

	        double total100MDashTimes = 0.0;
	        double[] hundredMetersDash = player.get100MDashTimes();

	        for (int i = 0; i < hundredMetersDash.length; i++) {
	            total100MDashTimes += hundredMetersDash[i];
	        }

	        double avg100MTime = total100MDashTimes / hundredMetersDash.length;

	        System.out.printf("%1$.2f", avg100MTime);
	        System.out.println();
	    }
	}


	public void printChatMultTimes(char charToPrint, int howManyTimes) {
		//Prints dashes under titles
		for(int i = 0; i < howManyTimes; i++ ) {System.out.print(charToPrint); 
		System.out.println();
		}
	}
		
	
	public static void main(String[] args) {


	    double MihaiV100MDashTimes[] = {4.32, 4.29, 4.27};
	    FootballPlayer2 mihaiViteazu = new FootballPlayer2("Mihai Viteazu", MihaiV100MDashTimes);   
	    dash100 fb100Dash = new dash100();
	    fb100Dash.addFootballPlayer(mihaiViteazu);
	    fb100Dash.printPlayerInfo();
	}
		
	
double average = 0.0;
double[] dashTimes={4.36, 4.39,4.14};
for(int i = 0; i < dashTimes.length; i++) {
	totalDashTimes += dashTimes;
}
average = totalDashTimes / dashTimes.length;

//----- Extracting methods
double[] dashTimes{4.36,4.39, 4.41};
double average = getAvgDashTime(dashTimes);

public static double getAvgDashTime(double[] dashTimes) {
	double totalDashTimes = 0.0;
	for (int i = 0; i< dashTimes.length;i++) {
		totalDashTimes +=dashTimes;
	}
	return totalDashTimes / dashTimes.length;
}}


