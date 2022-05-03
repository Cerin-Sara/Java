import java.util.Scanner;
public class ObjectOperation {
	public static void main(String args[]) {
		Obj obj1 = new Obj();
		
		System.out.println("Enter 2 numbers:");
		
		Scanner sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		int b= sc.nextInt();
		obj1.a=a;
		obj1.b=b;
		obj1.CalcSum();
		obj1.PrintSum();
	}
}
