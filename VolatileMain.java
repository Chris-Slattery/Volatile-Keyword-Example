/**
 * @(#)VolatileMain.java
 *
 *
 * @author
 * @version 1.00 2021/5/25
 */


public class VolatileMain {
	private final static int noOfThreads = 2;

    public static void main(String args[]) throws InterruptedException{
    	VolatileData volatileData = new VolatileData();     //Object of volatile data class
    	Thread[] threads = new Thread[noOfThreads];         //Create array of threads

    	for(int i = 0; i<noOfThreads; ++i)
    		threads[i] = new VolatileThread(volatileData);


    	for(int i = 0; i < noOfThreads; ++i)
    		threads[i].start();     //Starts all reader threads


    	for(int i = 0; i<noOfThreads; ++i)
    		threads[i].join();      //Wait for all threads
    }//end main methoid


}//end class