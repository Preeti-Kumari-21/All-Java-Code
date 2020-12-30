package Multithreading;

public class ThreadDemo_Yield {

	public static void main(String[] args) {
		
		Mythread_yield t = new Mythread_yield();
		Thread t1 = new Thread(t);
		t1.setPriority(2);
		t1.start();
		
		System.out.println("%%%%%% "+Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		System.out.println("&&&&&&&&&& "+t1.getName());
		System.out.println(t1.getPriority());
		
		for(int i = 0;i<50;i++)
		{
			System.out.println("Main thread");
		}

	}

}
