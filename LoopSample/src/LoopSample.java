import java.util.Scanner;
public class LoopSample {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number");
		int n= s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("The sum is: " + sum);
	}
}
