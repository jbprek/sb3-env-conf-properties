package com.foo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@PropertySource("classpath:/europe-capitals.properties")

@Data
public class EuropeCapitalPropertiesRaw {
//    @Value("$europe-capitals")
//    private Map<String, String> europeCapitals;
}
