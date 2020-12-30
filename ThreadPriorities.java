package Multithreading;

public class ThreadPriorities extends Thread {
	
	public void run()
	{
		/*
		 * Thread.currentThread().setPriority(6);
		 * System.out.println("Child thread is "+Thread.currentThread().getName()
		 * +" and its priority is "+Thread.currentThread().getPriority());
		 */
		
		System.out.println("In run method = "+Thread.currentThread().getPriority());
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
			
		}
	}
}
