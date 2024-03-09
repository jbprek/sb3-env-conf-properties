package com.foo.config;

import com.foo.config.model.DeliveryEnum;
import com.foo.config.model.ItemPrice;
import com.foo.config.model.LocalDateFormatddMMyyyy;
import com.foo.config.model.Person;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

// Class populated from application.properties using @ConfigurationProperties
@Validated
@Data
@ConfigurationProperties(prefix="config.demo")
public class ConfigDemoProperties {

    /**
     * Simple value
     */
    @NotBlank
    private String product;

    /**
     * java-time example
     */
    @Past
    private LocalDate releaseDate;

    /**
     * Example of enum in the configuration
     */
    @NotNull
    private DeliveryEnum delivery;

    /**
     * Simple Class
     */
    @Valid
    private ItemPrice item;

    /**
     * Nested Class
     */
    @Valid
    private Person person;


    /**
     * Simple List Example
     */
    @NotEmpty
    private List<String> products;

    /**
     * List
     */
    @NotEmpty
    private List<LocalDate> deadlines;

    /**
     * Simple map
     */
    @NotEmpty
    private Map<String, String> countryCodes;

    /**
    * Converter use example
     */
    @NotNull
    private LocalDateFormatddMMyyyy ddMMyyDate;


}
