
public class B extends A {
	int a;
	B(){
		System.out.println("ConstructorB");
	}
	B(int a){
		super(10);
		System.out.println("ArgB");
	}
	void display() {
		System.out.println("This is B");
		super.display();
		a=20;
		super.a=30;
		int c= a+super.a;
		System.out.println("The sum: " +c);
		System.out.println("In B: "+a);
		System.out.println("In A: "+super.a);
	}
	
	void superDisplay() {
		super.display();
	}
}