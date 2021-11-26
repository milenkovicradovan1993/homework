package radovan;

import java.util.concurrent.TimeUnit;

public class Timer {

	
	private long startTime;
	private long endTime;
	
	public void run()
    {
  
        for (TimeUnit unit : TimeUnit.values()) {
            try {
               
                // pause for 1 second
                TimeUnit.SECONDS.sleep(1);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
 
            System.out.println(unit + " : "  + unit.convert(24, TimeUnit.HOURS));
        }
    }
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