package de.ingomohr.ds.sample.service.impl;

import org.osgi.service.component.annotations.Component;

import de.ingomohr.ds.sample.service.ICalculatorService;

@Component
public class CalculatorServiceImpl implements ICalculatorService {

	@Override
	public String getResult(int a, int b) {
		return a + " + " + b + " = " + (a + b);
	}

}
