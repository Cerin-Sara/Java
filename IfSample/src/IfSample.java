import java.util.Scanner;
public class IfSample {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter a number: ");
		 int n= scan.nextInt();
		 if(n<0) {
			 System.out.println("Negative number");
		 }
		 else if (n>0) {
			 System.out.println("Positive number");
		 }
		 else {
			 System.out.println("The number is zero");
		 }
	}
}
