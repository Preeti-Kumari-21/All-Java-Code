package Core_Java_in28minutes;

public class MotorBike {

	// state - variables are called as the state of given class
	private int speed;// member variable


	// Behavior - methods inside the class is called its behavior

	public MotorBike() {
		this(5);
	}

	public MotorBike(int speed) {
		this.speed = speed;
	}

	void start() {
		System.out.println("The bike is started");
	}

	public int getSpeed() {
		return speed;
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	/*
	 * public void decreaseSpeed(int howMuch) { if (this.speed - howMuch >= 0) {
	 * this.speed = this.speed - howMuch; }
	 * 
	 * }
	 */

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}


	public void setSpeed(int speed) {
		if (speed >= 0)
		{
			// System.out.println(speed); // 100
			// System.out.println(this.speed); // initial value of int
			this.speed = speed;
			// System.out.println(this.speed);// 100
		}
		
	}


}
