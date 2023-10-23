package org.peaksoft.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HeadPhones extends Electronics {
    public HeadPhones(
            @Value("${headPhones.name}") String name
            , @Value("${headPhones.price}") int price,
            @Value("${headPhones.country}") String country) {
        super(name, price, country);
    }
}
