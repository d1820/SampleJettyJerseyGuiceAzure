package infrastructure;

import java.io.IOException;
import java.util.Properties;

import com.google.inject.Singleton;


public class Configuration implements IConfiguration {
	private Properties _topologyConfig;

	public Configuration() {}
	
	@Override
	public Properties getProperties() throws IOException {
		if (_topologyConfig == null) {
			_topologyConfig = new Properties();
			_topologyConfig.load(getClass().getClassLoader().getResourceAsStream("configuration.properties"));
		}
		return _topologyConfig;
	}
}
