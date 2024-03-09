package com.foo.config;

import com.foo.config.model.DeliveryEnum;
import com.foo.config.model.ItemPrice;
import com.foo.config.model.Person;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

// Class populated from application.properties using @Value
@Component
@Data
public class RawDemoProperties {

    /**
     *  Intermediate bean, needed to map the configuration into a ItemPrice object
     */
    @Component
    public static class ItemPriceReader {
        @Value("${config.demo.item.name}")
        private String itemName;
        @Value("${config.demo.item.price}")
        private double price;

        public ItemPrice getItemPrice() {
            ItemPrice itemPrice = new ItemPrice();
            itemPrice.setItemName(itemName);
            itemPrice.setPrice(price);
            return itemPrice;

        }
    }

    /**
     *  Intermediate bean, needed to map the configuration into a ItemPrice object
     */
    @Component
    public static class PersonReader {
        @Value("${config.demo.person.name}")
        private String Name;
        @Value("${config.demo.person.birth.country}")
        private String cob;
        @Value("${config.demo.person.birth.date}")
        private String dob;

        public Person getPerson() {
            var birthData = new Person.BirthData();
            birthData.setCountry("FRA");
            birthData.setDate(LocalDate.of(1961, 12, 15));
            var person = new Person();
            person.setName("Jean Michel");
            person.setBirth(birthData);
            return person;
        }
    }

    @Autowired
    private ItemPriceReader itemPriceReader;

    @Autowired
    private PersonReader personReader;


    /**
     * Simple value
     */
    @Value("${config.demo.product}")
    private String product;

    /**
     * java-time example
     */
    @Value("${config.demo.releaseDate}")
    private LocalDate releaseDate;

    /**
     * Example of enum in the configuration
     */
    @Value("${config.demo.delivery}")
    private DeliveryEnum delivery;


    // Simple class is mapped with intermediate bean reading the configuration
    public ItemPrice getItemPrice() {
        return itemPriceReader.getItemPrice();
    }

    // Nested class is mapped with intermediate bean reading the configuration
    public Person getPerson() {
        return personReader.getPerson();
    }

    /**
     * List of Strings
     */
    @Value("${config.demo.products}")
    private List<String> products;

    /**
     * List of Objects
     */
    @Value("${config.demo.deadlines}")
    private List<LocalDate> deadlines;


//    NOTE Maps Cannot be mapped directly
//    @Value("${config.demo.simplepairs}")
//    Map<String,String> simplePairs;


//    NOTE Maps Cannot be mapped directly
//    @Value("${config.demo.countryCodes}")
//    private Map<String, String> countryCodes;


}
