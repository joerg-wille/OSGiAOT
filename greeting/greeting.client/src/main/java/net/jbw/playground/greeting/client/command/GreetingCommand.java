package net.jbw.playground.greeting.client.command;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Deactivate;

public abstract class GreetingCommand {

	@Activate
	void activate() {
		System.out.println("Activated: " + this.getClass().getCanonicalName());
	}

	@Deactivate
	void deactivate() {
		System.out.println("Deactivated: " + this.getClass().getCanonicalName());
	}

}
