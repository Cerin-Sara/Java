
public class Hello {
	int a=10;
	static int b=20;
	public static void main(String args[]) {
		//System.out.println(a); a is not static
		System.out.println("Static var out of func"+b);
		Hello h = new Hello();
		Hello h1= new Hello();
		h.nonStatic();
		yesStatic();
		b=30;
		
		h.a=39;
		h.b=40;
		System.out.println(h.a);
		System.out.println(b);
		
		h.a=49;
		h.b=50;
		System.out.println(h.a);
		System.out.println(b);
		
		h1.b=60;
		System.out.println(b);	
	}
	
	void nonStatic() {
		System.out.println("Non static");
	}
	
	static void yesStatic() {
		System.out.println("Static");
	}
}
