package net.jbw.playground.greeting.impl;

import org.osgi.service.component.annotations.Component;

import net.jbw.playground.greeting.api.GreetingService;

@Component(property = "language=en_GB")
public class GreetingImplEnglish extends GreetingImpl implements GreetingService {

	@Override
	public String sayHello(String name) {
		return "Hello, " + name + "!";
	}

}
