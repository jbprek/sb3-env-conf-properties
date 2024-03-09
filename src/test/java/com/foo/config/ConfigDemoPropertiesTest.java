package com.foo.config;

import com.foo.config.model.DeliveryEnum;
import com.foo.config.model.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ConfigDemoPropertiesTest {

    @Autowired
    private ConfigDemoProperties props;

    @Test
    void testCountryProperties() {
        assertEquals("Marvelous", props.getProduct());

        assertEquals(DeliveryEnum.DEV, props.getDelivery());

        assertEquals(LocalDate.of(2020, 2, 16), props.getReleaseDate());


        var birth = new Person.BirthData();
        birth.setCountry("FRA");
        birth.setDate(LocalDate.of(1961, 12, 15));
        var person = new Person();
        person.setName("Jean Michel");
        person.setBirth(birth);
        assertEquals(person, props.getPerson());

        assertEquals(3, props.getProducts().size());
        assertEquals("tomatos", props.getProducts().get(0));
        assertEquals("cucumber", props.getProducts().get(1));
        assertEquals("other", props.getProducts().get(2));

        assertEquals(2, props.getDeadlines().size());
        assertEquals(LocalDate.of(2020, 2, 16), props.getDeadlines().get(0));
        assertEquals(LocalDate.of(2020, 2, 17), props.getDeadlines().get(1));

        assertNotNull(props.getSimplePairs());
        assertEquals(2, props.getSimplePairs().size());
        assertEquals("value1", props.getSimplePairs().get("key1"));
        assertEquals("value2", props.getSimplePairs().get("key2"));



        assertNotNull(props.getCountryCodes());
        assertEquals(3, props.getCountryCodes().size());
        assertEquals("GR", props.getCountryCodes().get("Greece"));
        assertEquals("IL", props.getCountryCodes().get("Ireland"));
        assertEquals("USA", props.getCountryCodes().get("United_States"));
    }

}