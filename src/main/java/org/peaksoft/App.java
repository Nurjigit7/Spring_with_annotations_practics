package org.peaksoft;

import org.peaksoft.model.Config;
import org.peaksoft.model.Store;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(Config.class);
        Store store=context.getBean("store", Store.class);
        System.out.println(store);
    }
}
