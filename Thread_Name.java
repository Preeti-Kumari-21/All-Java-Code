package Multithreading;

public class Thread_Name {

	public static void main(String[] args) {
		System.out.println("Name of Current Thread is "+Thread.currentThread().getName());
		
		Thread.currentThread().setName("Preeti Kumari");
		System.out.println("Now my name is "+Thread.currentThread().getName());
		
		MyThread t = new MyThread();
		t.start();
		System.out.println(" thread here is "+t.getName());
		System.out.println(10/0);

	}

}
