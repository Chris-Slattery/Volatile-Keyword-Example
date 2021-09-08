/**
 * @(#)VolatileData.java
 *
 *
 * @author
 * @version 1.00 2021/5/25
 */

//Program illustrating how the volatile keyword is used.
//The program has a defined class which increases counter value.
//Volatile keyword is used in multithreading. It is used when 2 threads are writing
//the same variable at the same time.
//Volatile keyword flushes changes to main memory and not the CPU cache.
//Can be used with static and final keywords.


public class VolatileData {
	private volatile int counter = 0;    //Declare volatile variable, counter.

	public int getCounter(){
		return counter;

	}//end getCounter


	public void increaseCounter(){
		++counter;                  //Increases the value of counter by 1

	}//end increaseCounter method

}//end class