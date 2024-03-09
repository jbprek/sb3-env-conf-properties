package com.foo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Map;

//@Component
@PropertySource("classpath:/europe-capitals.properties")
@ConfigurationProperties
@Data
public class EuropeCapitalProperties {

    private Map<String, String> europeCapitals;
}
