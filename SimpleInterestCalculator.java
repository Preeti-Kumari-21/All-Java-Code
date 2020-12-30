package Core_Java_in28minutes;

import java.math.BigDecimal;

public class SimpleInterestCalculator {

	private BigDecimal principal;
	private BigDecimal interest;

	public SimpleInterestCalculator(BigDecimal principal, BigDecimal interest) {
		super();
		this.principal = principal;
		this.interest = interest;
	}

	public BigDecimal calculateTotalValue(int noOfYears)
	{
		BigDecimal TotalAmount = this.principal.add(this.principal).multiply(this.interest)
				.multiply(new BigDecimal(noOfYears));
		return TotalAmount;
	}


}
