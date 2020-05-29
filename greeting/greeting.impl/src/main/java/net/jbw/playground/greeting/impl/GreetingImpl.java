package net.jbw.playground.greeting.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Deactivate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class GreetingImpl {

	private final static Logger log = LoggerFactory.getLogger(GreetingImpl.class);

	@Activate
	void activate() {
		log.info("Activated: " + this.getClass().getCanonicalName());
	}

	@Deactivate
	void deactivate() {
		log.info("Deactivated: " + this.getClass().getCanonicalName());
	}

}
