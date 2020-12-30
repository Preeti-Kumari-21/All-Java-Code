package Core_Java_in28minutes;

public class MotorBike_Main {

	public static void main(String[] args) {

		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(200);
		MotorBike suzuki = new MotorBike();

		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(suzuki.getSpeed());

		// ducati.start();
		// honda.start();

		/*
		 * its not a good practice to access variables of other class directly.
		 * 
		 * ducati.speed = 50; honda.speed = 100;
		 * 
		 * ducati.speed = 20; honda.speed = 10;
		 */
		// ducati.setSpeed(100);
		
		// honda.setSpeed(20);

		/*
		 * System.out.println(ducati.getSpeed()); System.out.println(honda.getSpeed());
		 */

		// System.out.println("honda speed initial " + honda.getSpeed());// 0
		
		/*
		 * Now I want to increase the speed of ducati by 100. ways to do it -
		 */
		
		// we can remove this code duplucation like -
		/*
		 * int initialDucatiSpeed = ducati.getSpeed(); int newDucatiSpeed =
		 * initialDucatiSpeed + 100; ducati.setSpeed(newDucatiSpeed);
		 * 
		 * System.out.println("New speed of ducati is " + ducati.getSpeed());
		 * 
		 * int initialHondaSpeed = honda.getSpeed(); int newHondaSpeed =
		 * initialHondaSpeed + 100; honda.setSpeed(newHondaSpeed);
		 * 
		 * System.out.println("New speed of ducati is " + honda.getSpeed());
		 */

		/*
		 * System.out.println("***************increasing speed****************"); //
		 * System.out.println(ducati.getSpeed()); ducati.increaseSpeed(100); //
		 * System.out.println("new speed of ducati is " + ducati.getSpeed());
		 * 
		 * // System.out.println(honda.getSpeed()); honda.increaseSpeed(100); //
		 * System.out.println("new speed of honda is " + honda.getSpeed());
		 * System.out.println("************************************************");
		 * 
		 * System.out.println("%%%%%%%%% Decreasing the speed%%%%%%%%%%%");
		 * System.out.println(ducati.getSpeed()); ducati.decreaseSpeed(100); //
		 * System.out.println("new speed of ducati is " + ducati.getSpeed());
		 * 
		 * // System.out.println(honda.getSpeed()); // honda.decreaseSpeed(100); //
		 * System.out.println("new speed of honda is " + honda.getSpeed());
		 */
		// ducati.setSpeed(100);


		// ducati.decreaseSpeed(500);
		// System.out.println(ducati.getSpeed());


	}

}
