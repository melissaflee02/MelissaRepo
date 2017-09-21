// Melissa's Code
import java.util.Scanner;
public class AdditionQuiz {
	public static void main (String[] Args) {
		Scanner keyboard = new Scanner(System.in);
		int randomA;
		int randomB;
		double correct = 0.0;
		double wrong = 0.0;
		int answer;
		double percentCorrect;
		String response;
		
		do {
		randomA = (int)(Math.random()*100);
		randomB = (int)(Math.random()*100);
		
		System.out.println("What is " + randomA + " + " + randomB + "?");
		response = keyboard.nextLine();
		answer = Integer.parseInt(response);
		
		if (answer == (randomA + randomB)) {
			System.out.println("Correct!");
			correct++;
		} else {
			System.out.println("Wrong!");
			wrong++;
		}
		
		System.out.println("correct is " + correct + ", wrong is " + wrong);
		percentCorrect = ((correct / (correct + wrong))*100);
		
		
		} while (correct < 3);
		
	}

}
