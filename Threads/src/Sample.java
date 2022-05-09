
public class Sample {
		public static void main(String a[]) {
			SampleThread st1 = new SampleThread(1);
			st1.start();
			SampleThread st2 = new SampleThread(2);
			st2.start();
			SampleThread st3 = new SampleThread(3);
			st3.start();
		}
}
