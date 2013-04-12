package pl.com.tt.di;

import pl.com.tt.di.system.NumeralSystem;

import com.google.inject.Inject;

public class Calculator {
	private final NumeralSystem system;
	
	@Inject
	public Calculator(final NumeralSystem system) {
		this.system = system;
	}
	
	public String add(final String first, final String second) {
		final String result = system.add(first, second);
		System.out.println(result);
		return result;
	}
	
	public String subtract(final String first, final String second) {
		final String result = system.subtract(first, second);
		System.out.println(result);
		return result;
	}
	
	public String multiply(final String first, final String second) {
		final String result = system.multiply(first, second);
		System.out.println(result);
		return result;
	}
	
	public String divide(final String first, final String second) {
		final String result = system.divide(first, second);
		System.out.println(result);
		return result;
	}
}
