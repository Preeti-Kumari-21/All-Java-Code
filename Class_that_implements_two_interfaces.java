package Core_Java_Examples;

public class Class_that_implements_two_interfaces implements MyInterface, MyInterface2 {

	@Override
	public void shape() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rectangle() {
		// TODO Auto-generated method stub

	}

	@Override
	public void shape_second() {
		// TODO Auto-generated method stub
		MyInterface.super.shape_second();
	}

}
