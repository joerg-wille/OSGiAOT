package net.jbw.playground.greeting.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Deactivate;

public abstract class GreetingImpl {

	@Activate
	void activate() {
		System.out.println("Activated: " + this.getClass().getCanonicalName());
	}

	@Deactivate
	void deactivate() {
		System.out.println("Deactivated: " + this.getClass().getCanonicalName());
	}

}
