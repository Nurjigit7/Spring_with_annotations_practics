package org.peaksoft.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Phone extends Electronics {
    public Phone(@Value("${phone.name}") String name,
                 @Value("${phone.price}") int price,
                 @Value("${phone.country}") String country) {
        super(name, price, country);
    }
}
