package Core_Java_in28minutes;

public class MultiplicationTable {
	
	/*
	 * void print() { for(int i =1; i<=10; i++) {
	 * System.out.printf(" %d * %d = %d ",5,i,5*i).println(); }
	 * 
	 * }
	 * 
	 * void print(int n) { System.out.println("\n"); for(int i=1; i<=10; i++) {
	 * System.out.printf("%d * %d = %d ",n,i,n*i).println();; }
	 * 
	 * }
	 */
	
	void print(int n, int from, int to)
	{
		System.out.println("\n");
		for(int i = from; i<=to; i++)
		{
			System.out.printf("%d * %d = %d ",n,i,n*i).println();
		}
	}

	// Now we can see we have three different for loops for doing the same thing. so
	// we can do something

	void print() {
		print(5, 1, 10);
		print(6, 10, 20);
	}
}
