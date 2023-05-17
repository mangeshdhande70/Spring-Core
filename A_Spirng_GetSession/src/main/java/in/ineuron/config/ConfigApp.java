package in.ineuron.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import in.ineuron.util.DataSourceConfig;

@Configuration()
@ComponentScan(basePackages = {"in.ineuron"})
@Import(value =  DataSourceConfig.class)
public class ConfigApp {
	
	static {
		System.out.println("ConfigApp .class file is loading........");
	}

	public ConfigApp() {
		System.out.println("ConfigApp object is created using zero param constructor");
	}

	
}
