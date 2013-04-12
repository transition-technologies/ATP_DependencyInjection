package pl.com.tt.di.implementation;

import pl.com.tt.di.Calculate;
import pl.com.tt.di.system.NumeralSystem;

public class Calculator implements Calculate {
	private final NumeralSystem system;
	
	public Calculator(final NumeralSystem system) {
		this.system = system;
	}
	
	@Override
	public String add(final String first, final String second) {
		final String result = system.add(first, second);
		System.out.println(result);
		return result;
	}
	
	@Override
	public String subtract(final String first, final String second) {
		final String result = system.subtract(first, second);
		System.out.println(result);
		return result;
	}
	
	@Override
	public String multiply(final String first, final String second) {
		final String result = system.multiply(first, second);
		System.out.println(result);
		return result;
	}
	
	@Override
	public String divide(final String first, final String second) {
		final String result = system.divide(first, second);
		System.out.println(result);
		return result;
	}
}
