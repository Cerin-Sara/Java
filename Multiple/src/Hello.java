
public class Hello {
	public static void main(String args[]) {
		First f = new First();
		Hello h = new Hello();
		h.display();
		f.display();
		h.display();
	}
	void display() {
		System.out.println("This is inside Main");
	}
}
