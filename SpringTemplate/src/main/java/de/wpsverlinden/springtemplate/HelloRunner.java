package de.wpsverlinden.springtemplate;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Oliver Verlinden
 */

@Component
public class HelloRunner implements CommandLineRunner {

    private static final Logger LOG = Logger.getLogger(HelloRunner.class.getName());
    
    @Override
    public void run(String... strings) throws Exception {
        LOG.log(Level.INFO, "Running application");
    }
    
}
