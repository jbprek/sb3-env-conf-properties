package com.foo.config;

import lombok.Data;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:/europe-capitals.conf")

@Data
public class EuropeCapitalPropertiesRaw {
//    @Value("$europe-capitals")
//    private Map<String, String> europeCapitals;
}
