package Multithreading;

public class MyThread extends Thread {
	
	
	public void run()
	{
		this.currentThread().setName("Kumar Prashant");
		System.out.println("The child thread is - "+this.currentThread().getName());
	}

}
