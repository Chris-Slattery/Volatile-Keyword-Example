/**
 * @(#)VolatileThread.java
 *
 *
 * @author
 * @version 1.00 2021/5/25
 */


public class VolatileThread extends Thread {
	private final VolatileData data;


    public VolatileThread(VolatileData data) {
    	this.data = data;

    }//end constructor

    @Override
    public void run(){
    	int oldValue = data.getCounter();
    	System.out.println("[Thread " + Thread.currentThread().getId() + "]: Old value = " + oldValue);
    	data.increaseCounter();
    	int newValue = data.getCounter();
    	System.out.println("[Thread " + Thread.currentThread().getId() + "]: New value = " + newValue);
    }//end run method


}