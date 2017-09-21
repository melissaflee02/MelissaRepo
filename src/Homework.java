// Melissa's Code

import javax.swing.JOptionPane;

public class Homework {
	public static void main (String[] Args) {
		String response;
		int userNum, secret;
		int money = 10;
		
		do {
			secret = (int)(Math.random()*11);
			response = JOptionPane.showInputDialog("Guess a number");
			userNum = Integer.parseInt(response);
			
			System.out.println("You guessed " + userNum + " and the number was " + secret);
			if (userNum != secret) {
				money = money - 1;
				System.out.println("You guessed incorrectly, you have $" + money + " left!");
			} else {
				money = money + 3;
				System.out.println("You guessed correctly, you have $" + money + " left!");
			}
		} while(money>0);
		System.out.println("Sorry, you have run out of money.");
	}

}
