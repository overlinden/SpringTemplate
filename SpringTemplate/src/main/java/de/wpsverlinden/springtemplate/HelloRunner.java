package de.wpsverlinden.springtemplate;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Oliver Verlinden
 */

@Component
public class HelloRunner implements CommandLineRunner {

    @Autowired
    private Logger LOG;
    
    @Override
    public void run(String... strings) throws Exception {
        LOG.info(getMessage());
    }

    public String getMessage() {
         return "Hello application";
    }
}
