package com.foo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

import java.util.Map;

//@Component
@PropertySource("classpath:/europe-capitals.conf")
@ConfigurationProperties
@Data
public class EuropeCapitalProperties {

    private Map<String, String> europeCapitals;
}
