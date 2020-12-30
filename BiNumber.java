package Core_Java_in28minutes;

public class BiNumber {
	int a;
	int b;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public BiNumber(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int add() {
		return (this.a + this.b);
	}

	public int multiply() {
		return (this.a * this.b);
	}
	
	public void doubleValue() {
		this.a += this.a * 2;
		this.b += this.b * 2;
	}

}
