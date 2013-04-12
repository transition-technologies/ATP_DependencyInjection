package pl.com.tt.di.system.implementation;

import pl.com.tt.di.system.NumeralSystem;

public class LongDecimalNumeralSystem implements NumeralSystem {
	@Override
	public String add(final String first, final String second) {
		return Long.toString(Long.parseLong(first) + Long.parseLong(second));
	}
	
	@Override
	public String subtract(final String first, final String second) {
		return Long.toString(Long.parseLong(first) - Long.parseLong(second));
	}
	
	@Override
	public String multiply(final String first, final String second) {
		return Long.toString(Long.parseLong(first) * Long.parseLong(second));
	}
	
	@Override
	public String divide(final String first, final String second) {
		return Long.toString(Long.parseLong(first) / Long.parseLong(second));
	}
}
