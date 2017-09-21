import java.util.Scanner;

public class Melissa {
	public static void main (String[] Args) {
		Scanner keyboard = new Scanner(System.in);
		String buffer;
		double x1;
		double y1;
		double x2;
		double y2;
		double slope;
		double yint;
		String slope1;
		
		
		System.out.println("Please enter the x-coordinate of the first point:");
		buffer = keyboard.nextLine();
		x1 = Integer.parseInt(buffer);
		
		System.out.println("Please enter the y-coordinate of the first point:");
		buffer = keyboard.nextLine();
		y1 = Integer.parseInt(buffer);
		
		System.out.println("Please enter the x-coordinate of the second point:");
		buffer = keyboard.nextLine();
		x2 = Integer.parseInt(buffer);
		
		System.out.println("Please enter the y-coordinate of the second point:");
		buffer = keyboard.nextLine();
		y2 = Integer.parseInt(buffer);
		
		slope = (y1 - y2)/(x1 - x2);		
		yint = y1/(slope*x1);
		
		System.out.println("The line y = " + slope + "x + " + yint + " goes through the points (" + x1 + ", "
				+ y1 + ") and (" + x2 + ", " + y2 + ")");
		
		
	}

}
