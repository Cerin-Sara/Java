import java.util.Scanner;
public class FunctionSample {
	public static void main(String args[]) {
		System.out.println("Enter 2 numbers");
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int result;
		result= sum(a,b);
		System.out.println("Sum is:"+result);
	}
	
	static int sum(int a, int b) {
		int c=a+b;
		return c;
	}
}
