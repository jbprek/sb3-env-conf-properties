package com.foo.config;

import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Example of use of a Converter for ConfigProperties
 * Note that java.time.LocalDate does not need a converter
 */
//@Component
//@ConfigurationPropertiesBinding
public class LocalDateConverter {}
//        implements Converter<String, LocalDate> {
//
//    @Override
//    public LocalDate convert(String s) {
//        return LocalDate.parse(s);
//    }
//}
