package net.jbw.playground.greeting.impl;

import org.osgi.service.component.annotations.Component;

import net.jbw.playground.greeting.api.GreetingService;

@Component(property = "language=de_DE")
public class GreetingImplGerman extends GreetingImpl implements GreetingService {

    @Override
    public String sayHello(String name) {
        return "Hallo, " + name + "!";
    }
    
}
