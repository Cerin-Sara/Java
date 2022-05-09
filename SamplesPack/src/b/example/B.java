package b.example;
import a.example.*;
import java.util.Scanner;

public class B {
	B(){
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int c= sc.nextInt();
		A a = new A(c);
	}
}
