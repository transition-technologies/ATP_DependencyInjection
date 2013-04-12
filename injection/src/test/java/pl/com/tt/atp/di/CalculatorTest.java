package pl.com.tt.atp.di;

import org.junit.Assert;
import org.junit.Test;

import pl.com.tt.di.Calculator;
import pl.com.tt.di.system.NumeralSystem;
import pl.com.tt.di.system.implementation.BinaryNumeralSystem;
import pl.com.tt.di.system.implementation.HexadecimalNumeralSystem;
import pl.com.tt.di.system.implementation.LongDecimalNumeralSystem;

public class CalculatorTest {
	@Test
	public void shouldAddLong1With2AndPrint3() {
		final NumeralSystem longDecimalNumeralSystem = new LongDecimalNumeralSystem();
		final Calculator calculator = new Calculator(longDecimalNumeralSystem);
		Assert.assertEquals("3", calculator.add("1", "2"));
	}
	
	@Test
	public void shouldSubtractLong2From4AndPrint2() {
		final NumeralSystem longDecimalNumeralSystem = new LongDecimalNumeralSystem();
		final Calculator calculator = new Calculator(longDecimalNumeralSystem);
		Assert.assertEquals("2", calculator.subtract("4", "2"));
	}
	
	@Test
	public void shouldMultiplyLong2By3AndPrint6() {
		final NumeralSystem longDecimalNumeralSystem = new LongDecimalNumeralSystem();
		final Calculator calculator = new Calculator(longDecimalNumeralSystem);
		Assert.assertEquals("6", calculator.multiply("2", "3"));
	}
	
	@Test
	public void shouldDivideLong9By3AndPrint3() {
		final NumeralSystem longDecimalNumeralSystem = new LongDecimalNumeralSystem();
		final Calculator calculator = new Calculator(longDecimalNumeralSystem);
		Assert.assertEquals("3", calculator.divide("9", "3"));
	}
	
	@Test
	public void shouldAddBinary01With10AndPrint11() {
		final NumeralSystem binaryNumeralSystem = new BinaryNumeralSystem();
		final Calculator calculator = new Calculator(binaryNumeralSystem);
		Assert.assertEquals("11", calculator.add("01", "10"));
	}
	
	@Test
	public void shouldSubtractBinary001From100AndPrint011() {
		final NumeralSystem binaryNumeralSystem = new BinaryNumeralSystem();
		final Calculator calculator = new Calculator(binaryNumeralSystem);
		Assert.assertEquals("11", calculator.subtract("100", "1"));
	}
	
	@Test
	public void shouldMultiplyBinary10By11AndPrint110() {
		final NumeralSystem binaryNumeralSystem = new BinaryNumeralSystem();
		final Calculator calculator = new Calculator(binaryNumeralSystem);
		Assert.assertEquals("110", calculator.multiply("10", "11"));
	}
	
	@Test
	public void shouldDivideBinary1001By11AndPrint11() {
		final NumeralSystem binaryNumeralSystem = new BinaryNumeralSystem();
		final Calculator calculator = new Calculator(binaryNumeralSystem);
		Assert.assertEquals("11", calculator.divide("1001", "11"));
	}
	
	@Test
	public void shouldAddHexEWith10AndPrint18() {
		final NumeralSystem hexadecimalNumeralSystem = new HexadecimalNumeralSystem();
		final Calculator calculator = new Calculator(hexadecimalNumeralSystem);
		Assert.assertTrue("1E".equalsIgnoreCase(calculator.add("E", "10")));
	}
	
	@Test
	public void shouldSubtractHex10AFrom37AndPrintD03() {
		final NumeralSystem hexadecimalNumeralSystem = new HexadecimalNumeralSystem();
		final Calculator calculator = new Calculator(hexadecimalNumeralSystem);
		Assert.assertTrue("D3".equalsIgnoreCase(calculator.subtract("10A", "37")));
	}
	
	@Test
	public void shouldMultiplyHex57By6AndPrint20A() {
		final NumeralSystem hexadecimalNumeralSystem = new HexadecimalNumeralSystem();
		final Calculator calculator = new Calculator(hexadecimalNumeralSystem);
		Assert.assertTrue("20A".equalsIgnoreCase(calculator.multiply("57", "6")));
	}
	
	@Test
	public void shouldDivideHexB4By1EAndPrint11() {
		final NumeralSystem hexadecimalNumeralSystem = new HexadecimalNumeralSystem();
		final Calculator calculator = new Calculator(hexadecimalNumeralSystem);
		Assert.assertEquals("6", calculator.divide("B4", "1E"));
	}
}
