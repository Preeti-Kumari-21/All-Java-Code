package Multithreading;

public class ThreadPrioritiesDemo {

	public static void main(String[] args) {
		
		/*
		 * Thread.currentThread().setPriority(10); ThreadPriorities t = new
		 * ThreadPriorities();
		 * 
		 * System.out.println("The current thread is "+Thread.currentThread().getName()
		 * +" and its priority is "+Thread.currentThread().getPriority());
		 * 
		 * System.out.println(t.getName()); t.start(); t.setPriority(8);
		 * System.out.println(t.getPriority());
		 */
		
		//System.out.println(Thread.currentThread().getName());
		ThreadPriorities t = new ThreadPriorities();
		//System.out.println(Thread.currentThread().getPriority());
		//t.setPriority(10);
		//System.out.println(t.getPriority());
	
		//System.out.println(t.getName());
		t.setPriority(10);
		t.start();
		
		for (int  i= 0; i < 10; i++) {
			System.out.println("Main Thread");
			
		}
		

		
	}

}
