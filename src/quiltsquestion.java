import java.util.Scanner;

public class quiltsquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		
		double shipping;
		int numQuilts;
		double sellprice;
		double totalprofit;
		
		System.out.println("How many quilts do you have");
		numQuilts = keyboard.nextInt();
		
		System.out.println("How much is shipping?");
		shipping = keyboard.nextDouble();
		
		// System.out.println("The cost for all of that is " + (11*numQuilts + shipping + 250));
		
		System.out.println("How much would you sell the quilts for");
		sellprice = keyboard.nextDouble();
		
		System.out.println("The total profit is " + ( (sellprice * numQuilts ) - (11*numQuilts + shipping + 250)));
		
		
		
	}

}
