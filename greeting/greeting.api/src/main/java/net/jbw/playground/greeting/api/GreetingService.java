package net.jbw.playground.greeting.api;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface GreetingService  {
    public String sayHello(String name);
}
