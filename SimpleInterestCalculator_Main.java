package Core_Java_in28minutes;

import java.math.BigDecimal;

public class SimpleInterestCalculator_Main {

	public static void main(String[] args) {

		BigDecimal principal = new BigDecimal("4500.00");
		BigDecimal interest = new BigDecimal("7.5");
		SimpleInterestCalculator calculator = new SimpleInterestCalculator(principal, interest);
		System.out.println(calculator.calculateTotalValue(5));

	}

}
