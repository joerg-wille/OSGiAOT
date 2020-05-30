module net.jbw.playground.greeting.client {
	requires transitive net.jbw.playground.greeting.api;
	requires atomos.osgi.framework;
	requires static org.osgi.service.component.annotations;
}