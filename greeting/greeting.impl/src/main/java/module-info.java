module net.jbw.playground.greeting.impl {
	exports net.jbw.playground.greeting.impl;

	requires transitive net.jbw.playground.greeting.api;
	requires static org.osgi.service.component.annotations;
}