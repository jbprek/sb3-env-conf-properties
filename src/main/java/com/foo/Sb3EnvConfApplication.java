package com.foo;

import com.foo.config.ConfigDemoProperties;
import com.foo.config.EuropeCapitalProperties;
import com.foo.config.EuropeCapitalPropertiesRaw;
import com.foo.config.RawDemoProperties;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
@AllArgsConstructor
@Slf4j
public class Sb3EnvConfApplication implements CommandLineRunner {

    private final ConfigDemoProperties configDemoProperties;
    private final RawDemoProperties rawDemoProperties;

    private final EuropeCapitalProperties europeCapitalProperties;
    private final EuropeCapitalPropertiesRaw europeCapitalPropertiesraw;
//    private final SomeComponent someComponent;

    public static void main(String[] args) {
        SpringApplication.run(Sb3EnvConfApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("config properties={}", configDemoProperties.toString());
        log.info("raw properties={}", rawDemoProperties.toString());
        log.info("raw properties itemPrice={}", rawDemoProperties.getItemPrice());

        log.info("Europe Capitals={}", europeCapitalProperties.toString());
        log.info("Europe Capitals Raw={}", europeCapitalPropertiesraw.toString());

//        log.info("Injected @Value(s) into SomeComponent  aValue: {},  bValue: {}", someComponent.getAValue(), someComponent.getBValue());
//        log.info("EP @Value(s) into SomeComponent  random: {}", someComponent.getRandomNumber());

    }
}
