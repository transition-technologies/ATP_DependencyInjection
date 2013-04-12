package pl.com.tt.di.system.implementation;

import pl.com.tt.di.system.NumeralSystem;

public class HexadecimalNumeralSystem implements NumeralSystem {
	@Override
	public String add(final String first, final String second) {
		return Long.toHexString(Long.parseLong(first, 16) + Long.parseLong(second, 16));
	}
	
	@Override
	public String subtract(final String first, final String second) {
		return Long.toHexString(Long.parseLong(first, 16) - Long.parseLong(second, 16));
	}
	
	@Override
	public String multiply(final String first, final String second) {
		return Long.toHexString(Long.parseLong(first, 16) * Long.parseLong(second, 16));
	}
	
	@Override
	public String divide(final String first, final String second) {
		return Long.toHexString(Long.parseLong(first, 16) / Long.parseLong(second, 16));
	}
	
}
