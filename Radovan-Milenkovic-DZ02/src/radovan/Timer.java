package radovan;

import java.time.temporal.ChronoUnit;

public class Timer {

	
	private long startTime;
	private long endTime;
	
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	public void end ()  {
		endTime = System.currentTimeMillis();
	}
	
	public long duration () {
		return endTime - startTime;
	}
	
    public void printDuration ()  {
    	System.out.println("It is " + duration());
    }


}