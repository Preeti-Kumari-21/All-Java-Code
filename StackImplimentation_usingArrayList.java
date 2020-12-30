package DataStructure_SortAlgorithms;

public class StackImplimentation_usingArrayList {
	
	int arr[];
	int top;
	int size;
	public StackImplimentation_usingArrayList(int size) {
		super();
		this.arr = new int[size];
		this.size = size;
		this.top = -1;
	}
	
	public int peek()
	{
		return arr[top];
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else {
			int val = arr[top];
			top = top-1;
			return val;
			
		}
	}
	
	public boolean isEmpty()
	{
		return (top == -1);
	}
	
	public void push(int item)
	{
		if(isFull())
		{
			System.out.println("Stack full");
		}
		else {
			top = top+1;
			arr[top] = item;
		}
	}
	
	public boolean isFull()
	{
		return (size-1 == top);
	}
	
	
	public static void main(String[] args) {
		
		StackImplimentation_usingArrayList stack = new StackImplimentation_usingArrayList(5);
		stack.push(5);
		stack.push(10);
		stack.push(20);
		stack.push(50);
		stack.push(100);
		stack.push(200);
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
	}
	
	
}