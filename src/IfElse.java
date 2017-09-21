import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] Args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("type a number"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("type another number"));

		if (a == b) {
			System.out.println("Numbers are the same");
		} else {
			System.out.println("Number are not the same");
			if (a > b) {
				System.out.println("a is larger!");
			} else {
				System.out.println("b is larger!");
			}
		}

		if ((a + b) < 5) {
			System.out.println("a + b is small");
		} else if ((a + b) < 10) {
			System.out.println("a + b is med");
		} else if ((a + b) < 15) {
			System.out.println("a + b is large");
		} else {
			System.out.println("a + b is largest");
		}
		
		for (int i = 0; i < 21; i ++) {
			for (int k = 20-i; k > 0; k--) { 
				System.out.print(" ");
			}
			for (int j = 0; j < 21-i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
