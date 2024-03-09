package com.foo.config.converter;

import com.foo.config.model.LocalDateFormatddMMyyyy;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
@ConfigurationPropertiesBinding
public class LocalDateFormatddMMyyyyConverter
        implements Converter<String, LocalDateFormatddMMyyyy> {

    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("ddMMyyyy");

    @Override
    public LocalDateFormatddMMyyyy convert(String in) {
       return new LocalDateFormatddMMyyyy(FMT.parse(in, LocalDate::from));
    }
}
