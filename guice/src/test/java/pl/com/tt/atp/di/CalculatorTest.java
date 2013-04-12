package pl.com.tt.atp.di;

import org.junit.Assert;
import org.junit.Test;

import pl.com.tt.di.Calculator;
import pl.com.tt.di.module.BinaryCalculatorModule;
import pl.com.tt.di.module.HexadecimalCalculatorModule;
import pl.com.tt.di.module.LongDecimalCalculatorModule;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class CalculatorTest {
	private final static Injector binaryModuleInjector = Guice.createInjector(new BinaryCalculatorModule());
	private final static Calculator binaryCalculator = binaryModuleInjector.getInstance(Calculator.class);
	private final static Injector hexadecimalModuleInjector = Guice.createInjector(new HexadecimalCalculatorModule());
	private final static Calculator hexadecimalCalculator = hexadecimalModuleInjector.getInstance(Calculator.class);
	private final static Injector longDecimalModuleInjector = Guice.createInjector(new LongDecimalCalculatorModule());
	private final static Calculator longDecimalCalculator = longDecimalModuleInjector.getInstance(Calculator.class);
	
	@Test
	public void shouldAddLong1With2AndPrint3() {
		Assert.assertEquals("3", longDecimalCalculator.add("1", "2"));
	}
	
	@Test
	public void shouldSubtractLong2From4AndPrint2() {
		Assert.assertEquals("2", longDecimalCalculator.subtract("4", "2"));
	}
	
	@Test
	public void shouldMultiplyLong2By3AndPrint6() {
		Assert.assertEquals("6", longDecimalCalculator.multiply("2", "3"));
	}
	
	@Test
	public void shouldDivideLong9By3AndPrint3() {
		Assert.assertEquals("3", longDecimalCalculator.divide("9", "3"));
	}
	
	@Test
	public void shouldAddBinary01With10AndPrint11() {
		Assert.assertEquals("11", binaryCalculator.add("01", "10"));
	}
	
	@Test
	public void shouldSubtractBinary001From100AndPrint011() {
		Assert.assertEquals("11", binaryCalculator.subtract("100", "1"));
	}
	
	@Test
	public void shouldMultiplyBinary10By11AndPrint110() {
		Assert.assertEquals("110", binaryCalculator.multiply("10", "11"));
	}
	
	@Test
	public void shouldDivideBinary1001By11AndPrint11() {
		Assert.assertEquals("11", binaryCalculator.divide("1001", "11"));
	}
	
	@Test
	public void shouldAddHexEWith10AndPrint18() {
		Assert.assertTrue("1E".equalsIgnoreCase(hexadecimalCalculator.add("E", "10")));
	}
	
	@Test
	public void shouldSubtractHex10AFrom37AndPrintD03() {
		Assert.assertTrue("D3".equalsIgnoreCase(hexadecimalCalculator.subtract("10A", "37")));
	}
	
	@Test
	public void shouldMultiplyHex57By6AndPrint20A() {
		Assert.assertTrue("20A".equalsIgnoreCase(hexadecimalCalculator.multiply("57", "6")));
	}
	
	@Test
	public void shouldDivideHexB4By1EAndPrint11() {
		Assert.assertEquals("6", hexadecimalCalculator.divide("B4", "1E"));
	}
}
