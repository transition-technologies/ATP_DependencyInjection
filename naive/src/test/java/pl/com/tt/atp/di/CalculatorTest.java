package pl.com.tt.atp.di;

import org.junit.Assert;
import org.junit.Test;

import pl.com.tt.di.LongDecimalCalculator;

public class CalculatorTest {
	@Test
	public void shouldAddLong1With2AndPrint3() {
		final LongDecimalCalculator calculator = new LongDecimalCalculator();
		Assert.assertEquals("3", calculator.add("1", "2"));
	}
	
	@Test
	public void shouldSubtractLong2From4AndPrint2() {
		final LongDecimalCalculator calculator = new LongDecimalCalculator();
		Assert.assertEquals("2", calculator.subtract("4", "2"));
	}
	
	@Test
	public void shouldMultiplyLong2By3AndPrint6() {
		final LongDecimalCalculator calculator = new LongDecimalCalculator();
		Assert.assertEquals("6", calculator.multiply("2", "3"));
	}
	
	@Test
	public void shouldDivideLong9By3AndPrint3() {
		final LongDecimalCalculator calculator = new LongDecimalCalculator();
		Assert.assertEquals("3", calculator.divide("9", "3"));
	}
}
