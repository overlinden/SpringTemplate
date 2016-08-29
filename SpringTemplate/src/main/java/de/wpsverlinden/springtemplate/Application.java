package de.wpsverlinden.springtemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author Oliver Verlinden
 */
@EnableAutoConfiguration
@ComponentScan
@SpringBootConfiguration
public class Application {
    
    public static void main(String... args) {   
        SpringApplication.run(Application.class, args);
    }
}
