package net.jbw.playground.greeting.client.command;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.launch.Framework;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GreetingCommandsHelp implements BundleActivator {

	private final static Logger log = LoggerFactory.getLogger(GreetingCommandsHelp.class);

	@Override
	public void start(BundleContext context) throws Exception {
		
		log.info("Type \'hello [name]\' or \'hallo [name]\' or \'stop 0\' to quit.");

		Thread hook = new Thread() {
			@Override
			public void run() {
				log.info("Shutdown hook invoked, stopping OSGi Framework.");
				try {
					Framework systemBundle = context.getBundle(0).adapt(Framework.class);
					systemBundle.stop();
					log.info("Waiting up to 2s for OSGi shutdown to complete...");
					systemBundle.waitForStop(2000);
				} catch (Exception e) {
					log.error("Failed to cleanly shutdown OSGi Framework: " + e.getMessage());
					e.printStackTrace();
				}
			}
		};
		Runtime.getRuntime().addShutdownHook(hook);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		log.info("Goodbye!");
	}

}
