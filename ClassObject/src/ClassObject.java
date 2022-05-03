import java.util.Scanner;
public class ClassObject {
	public static void main(String args[]) {
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		
		s1.a=10;
		s1.b=20;
		
		s2.a=2;
		s2.b=4;
		
		System.out.println(s1.a);
		System.out.println(s1.b);
		System.out.println(s2.a);
		System.out.println(s2.b);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values:")
		
		int eg1A=sc.nextInt();
		int eg1B=sc.nextInt();
		int eg2A=sc.nextInt();
		int eg2B=sc.nextInt();
		
		Sample s3 = new Sample();
		Sample s4 = new Sample();
		
		s3.a =eg1A;
		s3.b =eg1B;
		s4.a =eg2A;
		s4.b =eg2B;
		
		System.out.println(s3.a);
		System.out.println(s3.b);
		System.out.println(s4.a);
		System.out.println(s4.b);
	}
}

class Sample{
	int a;
	int b;
}
