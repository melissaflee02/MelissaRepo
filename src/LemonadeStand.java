import java.util.Scanner;
import java.util.Random;

public class LemonadeStand {
	public static void main(String[] Args) {
		Scanner keyboard = new Scanner(System.in);
		Random generator = new Random();
		double lemonMoney = 0.0;
		double lemonPrice = 0.0;
		double sugarPrice = 0.0;
		double sugarMoney = 0.0;
		double lsQuality = 0.0;
		double lwQuality = 0.0;
		double swQuality = 0.0;
		double profit = 0.0;
		double totalMoney = 100;
		double moneySpent = 0;
		double waterPrice = 0.0;
		int lemonade = 0;
		double price = 0.0;
		int sugarRatio = 0;
		int lemonRatio = 0;
		int waterRatio = 0;
		int random = 0;
		int customerHigh = 0;
		int customerMinus = 0;
		double angriness = 0;
		int totalCustomers = 0;
		String response = null;
		String quality = null;
		String weather = null;
		String reaction = null;
			
		do {
			System.out.format("Welcome to your lemonade stand!\nCurrent Bank Account: $%.2f\n", totalMoney);
			System.out.print("\nHere are some tips: \n1 lemon per 1 cup of lemonade\n1 cup of sugar per 1 cup "
					+ "of lemonade\n1 cup of water per 1 cup of lemonade\nReminder: 1 cup of water costs 50 cents");
			lemonPrice = Math.random();
			sugarPrice = Math.random();

			System.out.println("\n\nHow much money would you like to spend per lemon?");
			lemonMoney = keyboard.nextDouble();

			System.out.println("How much money would you like to spend per cup of sugar?");
			sugarMoney = keyboard.nextDouble();
			
			System.out.println("Enter the sugar/lemon/water ratio.  Please put a space between each number");
			sugarRatio = keyboard.nextInt();
			lemonRatio = keyboard.nextInt();
			waterRatio = keyboard.nextInt();
			
			System.out.println("How many cups of lemonade would you like to make?");
			lemonade = keyboard.nextInt();
			
			System.out.println("At what price do you want to sell the lemonade?");
			price = keyboard.nextDouble();
			
			moneySpent = (lemonMoney * lemonade) + (sugarMoney * lemonade);
			waterPrice = lemonade * 0.5;
			
			System.out.format("\nYou have spent a total of $%.2f on sugar and lemonade, plus $%.2f on "
					+ "water\n", moneySpent,waterPrice);
			
			moneySpent += waterPrice;
			
			System.out.format("Total money spent(including all materials): $%.2f\n", moneySpent);
			
			random = generator.nextInt(3) + 1;
			
			if (random == 1) {
				weather = "SUNNY";
				customerHigh = 100;
			} else if (random == 2) {
				weather = "CLOUDY";
				customerHigh = 75;
			} else {
				weather = "RAINING";
				customerHigh = 50;
			}
			
			System.out.println("The weather is " + weather + ", there will be at most " + customerHigh + " costomers.");
			
			
			lsQuality = Math.abs(sugarRatio - lemonRatio);
			lwQuality = Math.abs(lemonRatio - waterRatio);
			swQuality = Math.abs(sugarRatio - waterRatio);
			
			if ((lsQuality == lwQuality) && (lwQuality == swQuality) && (swQuality == lsQuality)) {
				quality = "PERFECT";
				customerMinus = 0;
			} else {
				quality = "NOT PERFECT";
				customerMinus = (int) (Math.abs(lwQuality - swQuality)*5);
			}
			
			System.out.println("Your sugar/lemon/water ratio is " + quality + ", the customer count has decreased by " + customerMinus);
			
			if (price > 2) {
				reaction = "TOO EXPENSIVE";
				angriness = (price/2)*10;
				angriness = (int)angriness;
			} else {
				reaction = "NOT TOO EXPENSIVE";
				angriness = 0;
			}
			
			totalCustomers = (int)((int)customerHigh - customerMinus - angriness);
			profit = totalCustomers * price;
			
			System.out.format("The price of your lemonade is " + reaction + ", the customer count has decreased by " + angriness
					+ "\nThere are a total of " + totalCustomers + " customers. \nYour profit is $%.2f", profit);
			totalMoney = totalMoney + profit - moneySpent;
			System.out.format("\nYou have a total of $%.2f", totalMoney);
			System.out.println("\n\n________________________________________________________________\n\n");
			
		} while(totalMoney > 0);
			
	}

}
