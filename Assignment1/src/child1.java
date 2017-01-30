/*
 * Alexander Philavong
 * ICS 462 Operating Systems 
 * Assignment 1
 * Due: Feb 7th
 * Description: This program creates two threads and prints out
 * when each thread is live. The data output is located in 
 * datafile.txt.
 */
public class child1 extends Thread{

	child1(){
		System.out.println("Threads Created");
		start();
	}
	
	public void run() {
		try {
			for (int i=0; i<10; i++){
				System.out.println("Child 1");
				Thread.sleep(1500);
			}
		}
		catch (InterruptedException e) {
			System.out.println("Child 1 thread interrupted");
		}
		System.out.println("Child 1 thread dead");
	}
}
