package pl.com.tt.di.module;

import pl.com.tt.di.system.NumeralSystem;
import pl.com.tt.di.system.implementation.LongDecimalNumeralSystem;

import com.google.inject.Binder;
import com.google.inject.Module;

public class LongDecimalCalculatorModule implements Module {
	@Override
	public void configure(final Binder binder) {
		binder.bind(NumeralSystem.class).to(LongDecimalNumeralSystem.class);
	}
}
