//Meera and Melissa's code
import java.util.Scanner;

public class UserInput2 {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int pennies;
		int nickels;
		int dimes;
		System.out.println("Enter x y and z");
		pennies = keyboard.nextInt();
		nickels = keyboard.nextInt();
		dimes = keyboard.nextInt();
		
		System.out.println("pennies: " + pennies + ", nickes: " + nickels + ", dimes: " + dimes);
	}

}
