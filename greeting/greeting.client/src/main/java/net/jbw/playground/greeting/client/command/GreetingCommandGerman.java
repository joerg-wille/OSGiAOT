package net.jbw.playground.greeting.client.command;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import net.jbw.playground.greeting.api.GreetingService;

@Component(
	service = GreetingCommandGerman.class,
	property = {
		"osgi.command.scope=greeting",
		"osgi.command.function=hallo"
	},
	name = "hallo.command"
)
public class GreetingCommandGerman extends GreetingCommand {
	
	private GreetingService target;

	public String hallo(String name) {
		return target.sayHello(name);
	}

	@Reference(target = "(language=de*)")
	void setHallo(GreetingService service) {
		this.target = service;
	}

}
