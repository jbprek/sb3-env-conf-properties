package com.foo.config.model;

import java.time.LocalDate;

/*
  this class is used to demonstrate how to use a Converter for ConfigProperties
 */
public class LocalDateFormatddMMyyyy {
    private final LocalDate localDate;

    public LocalDateFormatddMMyyyy(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }


    @Override
    public String toString() {
        return localDate.toString();
    }

}
