package Core_Java_in28minutes;

public class Book {

	private int noOfCopies;

	public Book(int noOfCopies) {
		super();
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	public void increaseNoOfCopies(int howmuch) {
		setNoOfCopies(this.noOfCopies + howmuch);
	}

	public void decreaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}


}
