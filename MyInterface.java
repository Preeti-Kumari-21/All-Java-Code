package Core_Java_Examples;

public interface MyInterface {
	
	public abstract void shape();
	public abstract void rectangle();

	default void shape_second()
	{
		System.out.println("I am shape second");
	}

}
