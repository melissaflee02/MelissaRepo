import java.util.Scanner;

public class Game {
	public static void main(String[] Args) {
		Scanner keyboard = new Scanner(System.in);
		int response;

		do {

			System.out.println("What To Build: Enter 1, 2, or 3\n1: Pyramid\n2: Checkerboard\n3: Quit and Play Game");
			response = keyboard.nextInt();

			if (response == 1) {
				pyramid();
			} else if (response == 2) {
				checkerboard();
			}
		} while (response != 3);

		System.out.println("What Game To Play: Enter 1\n1: Tic Tac Toe");
		response = keyboard.nextInt();

		if (response == 1) {
			ticTacToe();
		}

	}

	public static void pyramid() {
		int k = 0;
		for (int j = 21; j > 0; j--) {
			for (int i = j; i >= 0; i--) {
				System.out.print(" ");
			}
			for (int m = 0; m < 2; m++) {
				for (int i = 0; i <= k; i++) {
					System.out.print("*");
				}
			}
			System.out.print("\n");
			k++;
		}
	}

	public static void checkerboard() {
		for (int j = 0; j < 3; j++) {
			System.out.println("\t*******************************");
			for (int i = 0; i < 3; i++) {
				System.out.println("\t*         *         *         *");
			}
		}
		System.out.println("\t*******************************");

	}

	// | |
	// X | X | X
	// -------------
	// X | X | X
	// -------------
	// X | X | X
	// | |
	public static void ticTacToe() {
		int playerOne;
		int playerTwo;
		String[] array = initial();
		String winner;

		do {
			playerOne = getPlayerOne();
			array = boardCreationOne(playerOne, array);
			winner = check(array, "ONE");
			if (winner != null) {
				break;
			}
			playerTwo = getPlayerTwo();
			array = boardCreationTwo(playerTwo, array);
			winner = check(array, "TWO");
			if (winner != null) {
				break;
			}
		} while (true);

		System.out.println(winner + " is the winner!");

	}

	public static String[] boardCreationOne(int choice, String[] array) {

		System.out.println("    |   |");
		array[choice - 1] = "X";
		int j = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("  " + array[j] + " | " + array[j + 1] + " | " + array[j + 2]);
			j += 3;
			if (i != 2) {
				System.out.println("-------------");
			}
		}
		System.out.println("    |   |");

		return array;

	}

	public static int getPlayerOne() {
		int response;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Player One is X.  P1, Choose the box number you would like to mark.");
		response = keyboard.nextInt();

		return response;
	}

	public static String[] initial() {
		int j = 1;
		String[] array = new String[9];

		for (int k = 0; k < array.length; k++) {
			array[k] = Integer.toString(j);
			j++;
		}

		System.out.println("    |   |");
		j = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("  " + array[j] + " | " + array[j + 1] + " | " + array[j + 2]);
			j += 3;
			if (i != 2) {
				System.out.println("-------------");
			}
		}
		System.out.println("    |   |");

		return array;
	}

	public static int getPlayerTwo() {
		int response;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Player Two is O.  P1, Choose the box number you would like to mark.");
		response = keyboard.nextInt();

		return response;
	}

	public static String[] boardCreationTwo(int choice, String[] array) {

		System.out.println("    |   |");
		array[choice - 1] = "O";
		int j = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("  " + array[j] + " | " + array[j + 1] + " | " + array[j + 2]);
			j += 3;
			if (i != 2) {
				System.out.println("-------------");
			}
		}
		System.out.println("    |   |");

		return array;

	}

	public static String check(String[] array, String number) {
		String winner = null;
		for (int k = 0; k < 9; k = k + 3) {
			if (array[k].equals(array[k + 1]) && (array[k + 1].equals(array[k + 2]))) {
				winner = "PLAYER " + number;
			}
		}
		for (int i = 0; i < 3; i++) {
			if (array[i].equals(array[i + 3]) && (array[i + 3].equals(array[i + 6]))) {
				winner = "PLAYER " + number;
			}
		}
		int j = 0;
		if (array[j].equals(array[j + 4]) && (array[j + 4].equals(array[j + 8]))) {
			winner = "PLAYER " + number;
		} else {
			j = j + 2;
			if (array[j].equals(array[j + 2]) && (array[j + 2].equals(array[j + 4]))) {
				winner = "PLAYER " + number;
			}
		}
		
		if (winner == null) {
			for (String element : array) {
				if (element.equals("X") || (element.equals("O"))) {
					winner = "NO ONE";
				} else {
					winner = null;
					break;
				}
			}
		}
		return winner;
	}
}
