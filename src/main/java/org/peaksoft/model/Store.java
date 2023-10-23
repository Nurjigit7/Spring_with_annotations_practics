package org.peaksoft.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
@NoArgsConstructor
@Getter
@ToString
public class Store {
    @Value("${store.storeName}")
    private String storeName;
    @Value("${store.location}")
    private String location;
    private Electronics electronics;
    private Laptop laptop;


    @Autowired
    public Store(@Qualifier("phone") Electronics electronics, Laptop laptop) {
        this.electronics = electronics;
        this.laptop = laptop;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

}
