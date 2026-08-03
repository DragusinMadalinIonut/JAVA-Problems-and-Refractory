package Refractoring;


//We will make it much more readable by using methods
//instead of conditionals
public class TurnConditionalIntoMethods {


	static int bagOver70lbs(){
		return 200;
	}
	
	//mrethods make things easier
	static int bagUnder50lbs(int bagNumber) {
		return(bagNumber < 1)?25:35;
	}

	static int bag50To70lbs(int bagNumber){
		return(bagNumber < 2)?100:150;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]bagWeight = new int[] {25,55,75};
		int numberOfBags = bagWeight.length;
		int bagFees = 0;
		
		/*	
		
		//for a bag weight < 50 lbs and only one bag we charge $25
		//a bag weight < 50 lbs and 2 bags we charge $35
		
		for(int i = 0; i < numberOfBags; i++) {
			if( i<= 1) {
				if(bagWeight[i] < 50) {
					if(i == 0) {bagFees+=25;}
					else {bagFees+= 35;}
				}else if(bagWeight[i]<70) {
					bagFees +=100;
				}
			}else if(i > 1 && bagWeight[i] < 70){
				bagFees +=100;
			}
			//if bag is between 50 to 70 lbs charge $100 if first bag and $150 for each additional bag
		else if(i>1 && bagWeight[i] <70) {
			bagFees+= 100;
		}else if(i >1 && bagWeight[i] < 70) {
			bagFees += 150;
			//bag over 70 lbs charge $200
		}else{
			bagFees +=200;
		}

	}*/
		System.out.println("Bag Fees: $"+ bagFees);
		////
		bagFees = 0;
		for(int theBag = 0; theBag < numberOfBags; theBag++) {
			if(bagWeight[theBag] <50) {
				bagFees += bagUnder50lbs(theBag);
			}
			else 
				if(bagWeight[theBag] < 70) {
					bagFees += bag50To70lbs(theBag);
				}else {
					bagFees +=200;
				}
			}
	}
}

