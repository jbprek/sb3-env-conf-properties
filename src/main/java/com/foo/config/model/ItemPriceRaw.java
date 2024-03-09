package com.foo.config.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class ItemPriceRaw {
    @Value("${config.demo.item.name}")
    private String itemName;
    @Value("${config.demo.item.price}")
    private double price;
}
