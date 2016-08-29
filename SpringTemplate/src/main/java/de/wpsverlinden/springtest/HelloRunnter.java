package de.wpsverlinden.springtest;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Oliver Verlinden
 */

@Component
public class HelloRunnter implements CommandLineRunner {

    private static final Logger LOG = Logger.getLogger(HelloRunnter.class.getName());
    
    @Override
    public void run(String... strings) throws Exception {
        LOG.log(Level.INFO, "Running application");
    }
    
}
