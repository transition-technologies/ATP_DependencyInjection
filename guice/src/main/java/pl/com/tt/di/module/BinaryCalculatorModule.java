package pl.com.tt.di.module;

import pl.com.tt.di.system.NumeralSystem;
import pl.com.tt.di.system.implementation.BinaryNumeralSystem;

import com.google.inject.Binder;
import com.google.inject.Module;

public class BinaryCalculatorModule implements Module {
	@Override
	public void configure(final Binder binder) {
		binder.bind(NumeralSystem.class).to(BinaryNumeralSystem.class);
	}
}
