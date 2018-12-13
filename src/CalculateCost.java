
public class CalculateCost {
	
	
	
	private float cost;
	
	public void calculation(float cost) {
		
		this.cost = cost;
		
		if (cost < 0) {
			
			System.out.println("Error: Cost can't be less than zero");
			
		} else if (cost > 0) {
			
			
			System.out.println();
			change();
			
		}
		
		
	}
	
	
	//getter for product cost
	public float getCost() {
		return cost;
	}

	
	public void change() {
		
		//Counters for bills
		
		int counterFiveHundred = 0;
		int counterTwoHundred = 0;
		int counterOneHundred = 0;
		int counterFifty = 0;
		int counterTwenty = 0;
		int counterTen = 0;
		int counterFive = 0;
		
		// Counter for coins
		int counterTwo = 0;
		int counterOne = 0;
		
		// Counter for cents 
		
		float counterFiftyCents = 0;
		float counterTwentyCents = 0;
		float counterTenCents = 0;
		float counterFiveCents = 0;
		float counterTwoCents = 0;
		float counterOneCent = 0;
		
		
		
		//Multiplied number variables
		
		int multipliedFiveHundred = 0;
		int multipliedTwoHundred = 0;
		int multipliedOneHundred = 0;
		int multipliedFifty = 0;
		int multipliedTwenty = 0;
		int multipliedTen = 0;
		int multipliedFive = 0;
		float multipliedTwo = 0;
		float multipliedOne = 0;
		float multipliedFiftyCents = 0;
		float multipliedTwentyCents = 0;
		float multipliedTenCents = 0;
		float multipliedFiveCents = 0;
		float multipliedTwoCents = 0;
		float multipliedOneCent = 0;

		
		
		//CHECKING FOR 500 BILLS
		for (int i = 0; i <= getCost(); i++) {
			
			if (i % 500 == 0) {
				
				counterFiveHundred++;
				multipliedFiveHundred = counterFiveHundred * 500 - 500;
				
			} 
			
			
		}
		
		
		System.out.println("Number of 500 euro bill you get is " + (counterFiveHundred-1));
		System.out.println("Rest of your money is " + (getCost() - multipliedFiveHundred) + "\n");
		
		//CHECKING TO FIND 200 EURO BILLS 
		for (int i = 0; i <= getCost() - multipliedFiveHundred; i++) {
			
			
			if (i % 200 == 0) {
				
				counterTwoHundred++;
				multipliedTwoHundred = counterTwoHundred * 200 - 200;
				
				
			
			}
			
		}
		
		//Variable to keep track for the rest of the money
		
		float restOfTheMoney = getCost() - multipliedTwoHundred - multipliedFiveHundred;
		System.out.println("Number of 200 euro bills you get is " + (counterTwoHundred-1));
		System.out.println("Rest of your money is " + restOfTheMoney + "\n");
		
		//CHECKING TWO FIND 100 BILLS
		for (int i = 0; i <= restOfTheMoney; i++) {
			
			if (i % 100 == 0) {
				
				counterOneHundred++;
				multipliedOneHundred = counterOneHundred * 100 - 100;
				
			}
			
		}
		
		restOfTheMoney = restOfTheMoney - multipliedOneHundred;
		System.out.println("Number of 100 euro bills you get is " + (counterOneHundred-1));
		System.out.println("Rest of your money is " + restOfTheMoney + "\n");
		
		//CHECKING TO FIND 50 EURO BILLS
		for (int i = 0; i <= restOfTheMoney; i++) {
					
			if (i % 50 == 0) {
						
				counterFifty++;
				multipliedFifty  = counterFifty * 50 - 50;
						
			}
					
		}
		
		
		restOfTheMoney = restOfTheMoney - multipliedFifty;
		System.out.println("Number of 50 euro bills you get is " + (counterFifty - 1 ));
		System.out.println("Rest of your money is " + restOfTheMoney + "\n");
		
		//CHECKING TO FIND 20 EURO BILLS
		for (int i = 0; i <= restOfTheMoney; i++) {
			
			if (i % 20 == 0) {
						
				counterTwenty++;
				multipliedTwenty  = counterTwenty  * 20 - 20;
						
			}
					
		}
		
		
		restOfTheMoney = restOfTheMoney - multipliedTwenty;
		System.out.println("Number of 20 euro bills you get is " + (counterTwenty - 1 ));
		System.out.println("Rest of your money is " + restOfTheMoney + "\n");
		
		//CHECKING TO FIND 10 EURO BILLS
		for (int i = 0; i <= restOfTheMoney; i++) {
			
			if (i % 10 == 0) {
						
				counterTen++;
				multipliedTen  = counterTen * 10 - 10;
						
			}
					
		}
		
		
		restOfTheMoney = restOfTheMoney - multipliedTen;
		System.out.println("Number of 10 euro bills you get is " + (counterTen - 1 ));
		System.out.println("Rest of your money is " + restOfTheMoney + "\n");
		
		
		//CHECKING TO FIND 5 EURO BILLS
		for (int i = 0; i <= restOfTheMoney; i++) {
			
			if (i % 5 == 0) {
						
				counterFive++;
				multipliedFive  = counterFive * 5 - 5;
						
			}
					
		}
		
		
		restOfTheMoney = restOfTheMoney - multipliedFive;
		System.out.println("Number of 5 euro bills you get is " + (counterFive - 1 ));
		System.out.println("Rest of your money is " + restOfTheMoney + "\n");
		
		
		//CHECKING TO FIND 2 EURO COINS
		for (int i = 0; i <= restOfTheMoney; i++) {
			
			if (i % 2 == 0) {
						
				counterTwo++;
				multipliedTwo  = counterTwo * 2 - 2;
						
			}
					
		}
		
		
		restOfTheMoney = restOfTheMoney - multipliedTwo;
		System.out.println("Number of 2 euro coins you get is " + (counterTwo - 1 ));
		System.out.println("Rest of your money is " + restOfTheMoney + "\n");
		
		
		//CHECKING TO FIND 1 EURO COINS
		for (int i = 0; i <= restOfTheMoney; i++) {
			
			if (i % 1 == 0) {
						
				counterOne++;
				multipliedOne  = counterOne * 1 - 1;
						
			}
					
		}
		
		
		restOfTheMoney = restOfTheMoney - multipliedOne;
		System.out.println("Number of 1 euro coins you get is " + (counterOne - 1 ));
		System.out.println("Rest of your money is " + restOfTheMoney + "\n");
		
		//CHECKING TO FIND 50 CENT COINS
		for (float i = 0; i <= restOfTheMoney; i = (float) (i + 0.5)) {
			
			if (i % 0.5 == 0) {
						
				counterFiftyCents++;
				multipliedFiftyCents  = (float) (counterFiftyCents * 0.5 - 0.5);
						
			}
					
		}
		
		
		restOfTheMoney = restOfTheMoney - multipliedFiftyCents;
		if (restOfTheMoney < 0.009) {
			
			restOfTheMoney = 0;
			
		}
		System.out.println("Number of 0.50 cent coins you get is " + (counterFiftyCents - 1 ));
		System.out.println("Rest of your money is " + restOfTheMoney + "\n");
		
		
		//CHECKING TO FIND 20 CENT COINS
		for (double i = 0; i <= restOfTheMoney; i = (double) (i + 0.2)) {
			
			if (i % 0.2 == 0) {
						
				counterTwentyCents++;
				multipliedTwentyCents  = (float) (counterTwentyCents * 0.2 - 0.2);
						
			}
					
		}
		
		
		restOfTheMoney = restOfTheMoney - multipliedTwentyCents;
		if (restOfTheMoney < 0.009) {
			
			restOfTheMoney = 0;
			
		}
		System.out.println("Number of 0.20 cent coins you get is " + (counterTwentyCents - 1 ));
		System.out.println("Rest of your money is " + restOfTheMoney + "\n");
		
		//CHECKING TO FIND 10 CENT COINS
		for (double i = 0; i <= restOfTheMoney; i = (double) (i + 0.1)) {
			
			if (i % 0.1 == 0) {
						
				counterTenCents++;
				multipliedTenCents  = (float) (counterTenCents * 0.1 - 0.1);
						
			}
					
		}
		
		
		restOfTheMoney = restOfTheMoney - multipliedTenCents;
		if (restOfTheMoney < 0.009) {
			
			restOfTheMoney = 0;
			
		}
		System.out.println("Number of 0.10 cent coins you get is " + (counterTenCents - 1 ));
		System.out.println("Rest of your money is " + restOfTheMoney + "\n");
		
		//CHECKING TO FIND 5 CENT COINS
		for (float i = 0; i <= restOfTheMoney; i = (float) (i + 0.05)) {
			
			if (i % 0.05 == 0) {
						
				counterFiveCents++;
				multipliedFiveCents  = (float) (counterFiveCents * 0.05 - 0.05);
						
			}
					
		}
		
		
		restOfTheMoney = restOfTheMoney - multipliedFiveCents;
		if (restOfTheMoney < 0.009) {
			
			restOfTheMoney = 0;
			
		}
		System.out.println("Number of 0.5 cent coins you get is " + (counterFiveCents - 1 ));
		System.out.println("Rest of your money is " + restOfTheMoney + "\n");
		
		//CHECKING TO FIND 2 CENT COINS
		for (double i = 0; i <= restOfTheMoney; i = (double) (i + 0.02)) {
			
			if (i % 0.02 == 0) {
						
				counterTwoCents++;
				multipliedTwoCents  = (float) (counterTwoCents * 0.02 - 0.02);
						
			}
					
		}
		
		
		restOfTheMoney = restOfTheMoney - multipliedTwoCents;
		if (restOfTheMoney < 0.009) {
			
			restOfTheMoney = 0;
			
		}
		System.out.println("Number of 0.02 cent coins you get is " + (counterTwoCents - 1 ));
		System.out.println("Rest of your money is " + restOfTheMoney + "\n");
		
		//CHECKING TO FIND 1 CENT COINS
		for (double i = 0; i <= restOfTheMoney; i = (double) (i + 0.01)) {
			
			if (i % 0.01 == 0) {
						
				counterOneCent++;
				multipliedOneCent  = (float) (counterOneCent * 0.01 - 0.01);
						
			}
					
		}
		
		
		restOfTheMoney = restOfTheMoney - multipliedOneCent;
		if (restOfTheMoney < 0.0099999) {
			
			restOfTheMoney = 0;
			
		}
		System.out.println("Number of 0.01 cent coins you get is " + (counterOneCent - 1 ));
		System.out.println("Rest of your money is " + restOfTheMoney + "\n");
		
		
		
		
		

		
		
		
	}
	
	
	
	
	
	
	

}
