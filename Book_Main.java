package Core_Java_in28minutes;

public class Book_Main {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(10);
		Book effectiveJava = new Book(20);
		Book cleanCode = new Book(30);

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		/*
		 * System.out.println(effectiveJava.getNoOfCopies());
		 * System.out.println(cleanCode.getNoOfCopies());
		 */

		artOfComputerProgramming.decreaseNoOfCopies(1);
		System.out.println(artOfComputerProgramming.getNoOfCopies());

		/*
		 * artOfComputerProgramming.noOfCopies = 100; effectiveJava.noOfCopies = 50;
		 * cleanCode.noOfCopies = 10;
		 * 
		 * artOfComputerProgramming.noOfCopies = 200; effectiveJava.noOfCopies = 57;
		 * cleanCode.noOfCopies = 100;
		 */

		// artOfComputerProgramming.setNoOfCopies(100);
		/*
		 * effectiveJava.setNoOfCopies(50); cleanCode.setNoOfCopies(200);
		 * 
		 * System.out.println(artOfComputerProgramming.getNoOfCopies());
		 * System.out.println(effectiveJava.getNoOfCopies());
		 * System.out.println(cleanCode.getNoOfCopies());
		 */

		/*
		 * artOfComputerProgramming.increaseNoOfCopies(200);
		 * 
		 * 
		 * artOfComputerProgramming.decreaseNoOfCopies(1000);
		 * System.out.println(artOfComputerProgramming.getNoOfCopies());
		 */

	}

}
