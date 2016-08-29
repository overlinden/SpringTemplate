package de.wpsverlinden.springtemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Oliver Verlinden
 */
@EnableAutoConfiguration
@ComponentScan
@Configuration
public class Application {
    
    public static void main(String... args) {   
        SpringApplication.run(Application.class, args);
    }
}
