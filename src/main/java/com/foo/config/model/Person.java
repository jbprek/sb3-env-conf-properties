package com.foo.config.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;

/**
 * Example nested class for  use in Configuration Properties
 */
@Data
public class Person {
    @Data
    public static class BirthData {
        @NotBlank
        private String country;
        @Past
        private LocalDate date;
    }

    @NotBlank
    private String name;

    @NotNull
    private BirthData birth;

}
