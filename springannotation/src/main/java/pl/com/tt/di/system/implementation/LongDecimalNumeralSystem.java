package pl.com.tt.di.system.implementation;

import org.springframework.stereotype.Component;

import pl.com.tt.di.system.NumeralSystem;

@Component
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
