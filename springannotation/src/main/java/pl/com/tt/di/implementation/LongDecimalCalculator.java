package pl.com.tt.di.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import pl.com.tt.di.AbstractCalculator;
import pl.com.tt.di.system.NumeralSystem;

@Component
public class LongDecimalCalculator extends AbstractCalculator {
	@Autowired
	public LongDecimalCalculator(@Qualifier("longDecimalNumeralSystem") final NumeralSystem system) {
		this.system = system;
	}
}
