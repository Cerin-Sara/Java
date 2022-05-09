
public class SampleThread extends Thread{
	public SampleThread(int i) {
		// TODO Auto-generated constructor stub
	}

	@override
	public void run() {
		super.run();
		int i;
		for(i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptException e){
				e.printStackTrace();
			}
		}
	}
}
