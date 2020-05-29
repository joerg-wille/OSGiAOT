package net.jbw.playground.greeting.client.command;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Deactivate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class GreetingCommand {

	private final static Logger log = LoggerFactory.getLogger(GreetingCommand.class);

	@Activate
    void activate() {
    	log.info("Activated: " + this.getClass().getCanonicalName());
    }
    
    @Deactivate
    void deactivate() {
    	log.info("Deactivated: " + this.getClass().getCanonicalName());
    }
    
}
