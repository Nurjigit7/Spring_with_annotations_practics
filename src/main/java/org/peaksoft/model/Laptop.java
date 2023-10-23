package org.peaksoft.model;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString

public class Laptop {
    @Value("${laptop.name}")
    private String name;
    @Value("${laptop.price}")
    private int price;
    @Value("${laptop.country}")
    private String country;

}
