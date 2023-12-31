package org.peaksoft.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.peaksoft.model")
@PropertySource("classpath:application.properties")
public class Config {
    @Bean
    public Phone getPhone() {
        Phone phone = new Phone("Mi", 25000, "China");
        return phone;
    }
}
