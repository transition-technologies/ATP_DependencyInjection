package pl.com.tt.di.system;

public class LongDecimalNumeralSystem {
	public String add(final String first, final String second) {
		return Long.toString(Long.parseLong(first) + Long.parseLong(second));
	}
	
	public String subtract(final String first, final String second) {
		return Long.toString(Long.parseLong(first) - Long.parseLong(second));
	}
	
	public String multiply(final String first, final String second) {
		return Long.toString(Long.parseLong(first) * Long.parseLong(second));
	}
	
	public String divide(final String first, final String second) {
		return Long.toString(Long.parseLong(first) / Long.parseLong(second));
	}
}
