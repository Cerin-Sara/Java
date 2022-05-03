
public class ObjFunction {
	public static void main(String arg[]) {
		SampleObj s1= new SampleObj();
		SampleObj s2= new SampleObj();
		
		s1.a=10;
		s1.b=20;
		
		s2.a=3;
		s2.b=6;
		
		System.out.print("S1-A:" + s1.a);
		System.out.print(" S1-B:" + s1.b);
		System.out.print(" S2-A:" + s2.a);
		System.out.println(" S2-B:" + s2.b);
		
		s1.display();
		
		s2.display();
	}
}
