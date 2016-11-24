package de.ingomohr.ds.sample.service.command;

import org.apache.felix.service.command.CommandProcessor;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.ingomohr.ds.sample.service.ICalculatorService;

@Component(property = {
		CommandProcessor.COMMAND_SCOPE + ":String=ingomohr",
		CommandProcessor.COMMAND_FUNCTION + ":String=calc"
	},
	service=CalculatorCommand.class
)
public class CalculatorCommand {
	
	private ICalculatorService service;
	
	@Reference
	void bindCalculator(ICalculatorService pService) {
		service = pService;
	}

	/**
	 * This is required because of {@link #bindCalculator(ICalculatorService)}
	 * being registered as reference.
	 */
	void unbindCalculator(ICalculatorService pService) {
	}

	public void calc(int a, int b) {
		System.out.println(service.getResult(a, b));
	}	

}
