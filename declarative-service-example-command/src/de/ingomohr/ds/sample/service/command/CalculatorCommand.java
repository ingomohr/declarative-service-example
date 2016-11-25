package de.ingomohr.ds.sample.service.command;

import java.util.ArrayList;
import java.util.List;

import org.apache.felix.service.command.CommandProcessor;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import de.ingomohr.ds.sample.service.ICalculatorService;

@Component(property = {
		CommandProcessor.COMMAND_SCOPE + ":String=calculator",
		CommandProcessor.COMMAND_FUNCTION + ":String=calc"
	},
	service=CalculatorCommand.class
)
public class CalculatorCommand {
	
	private final List<ICalculatorService> services = new ArrayList<>();

	@Reference
	void bindCalculator(ICalculatorService pService) {
		services.add(pService);
	}

	/**
	 * This is required because of {@link #bindCalculator(ICalculatorService)}
	 * being registered as reference.
	 */
	void unbindCalculator(ICalculatorService pService) {
		services.remove(pService);
	}

	public void calc(int a, int b) {
		services.forEach(s -> System.out.println(s.getResult(a, b)));
	}

}
