package radovan;

import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Timer t1 = new Timer();
		Timer t2 = new Timer ();
		double x = 12345.6789;
		t1.start();
	    for (int i = 0; i < 100; i++) {
	    	 Math.sqrt(x);
			Thread.sleep(100);
		} 
		t1.end();
		System.out.println(Math.sqrt(x));
		t1.printDuration();
		
	    t2.start();
		for (int i = 0; i < 100; i++) {
			Math.pow(x,2);
			Thread.sleep(100);
		}
		t2.end(); 
	    System.out.println(Math.pow(x,2));
		t2.printDuration();

	}

}
