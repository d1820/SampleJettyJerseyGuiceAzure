package startup;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

import infrastructure.Configuration;
import infrastructure.IConfiguration;
import infrastructure.Factories.IKafkaPropertyFactory;
import infrastructure.Factories.KafkaPropertyFactory;
import infrastructure.Proxies.IProducerProxy;
import infrastructure.Proxies.KafkaProxy;
import infrastructure.Services.ILoggingService;
import infrastructure.Services.LoggingService;

public class RegistrationsModule extends AbstractModule {
	  @Override
	  protected void configure() {
	    bind(ILoggingService.class).to(LoggingService.class);
	    bind(IConfiguration.class).to(Configuration.class).in(Singleton.class);
	  }
	}
