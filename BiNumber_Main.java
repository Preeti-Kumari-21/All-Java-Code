package Core_Java_in28minutes;

public class BiNumber_Main {

	public static void main(String[] args) {

		BiNumber bi = new BiNumber(21, 3);
		System.out.println(bi.add());
		System.out.println(bi.multiply());
		bi.doubleValue();
		System.out.println(bi.getA());
		System.out.println(bi.getB());

	}

}
