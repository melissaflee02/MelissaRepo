import java.util.Scanner;

public class calculations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		 int a;
		 int b;
		 int c; 
		 
		 System.out.println("type in a value for a");
		 a = keyboard.nextInt();
		 
		 System.out.println("type in a value for b");
		 b = keyboard.nextInt();
		 
		 System.out.println("type in a value for c");
		 c = keyboard.nextInt();
		 
		 double d = (b*b -4*a*c); 
		 
		 if (d < 0 ) {
			 d = -1*d;
			 double total1 = ((-1*b + Math.sqrt(d)) / 2*a );
			 String total = total1 + "i";
			 System.out.println("Answer one is " + total);
			 
		 }
		 else if (d == 0 ) {
			
			 double total1 = ((-1*b + Math.sqrt(d)) / 2*a );
			 System.out.println("Answer one is " + total1);
			 
		 }
		 else {
		 double total1 = ((-1*b + Math.sqrt(b*b -4*a*c)) / 2*a );
		 double total2 = ((-1*b - Math.sqrt(b*b -4*a*c)) / 2*a );
		 
		 System.out.println("The first answer is " + total1);
		 System.out.println("The second answer is " + total2);
		 }
	}

}
