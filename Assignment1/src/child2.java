import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * Alexander Philavong
 * ICS 462 Operating Systems 
 * Assignment 1
 * Due: Feb 7th
 * Description: [See child1]
 */
public class child2 {
	public static void main(String args[]) throws FileNotFoundException {
		
		PrintStream out = new PrintStream(new
				FileOutputStream("datafile.txt"));
		System.setOut(out);
		
		child1 child1 = new child1();
		
		try {
			while(child1.isAlive()) {
				System.out.println("Child 2");
				Thread.sleep(2000);
			}
		}
		catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
		System.out.println("Child 2 thread dead");
	}
}
