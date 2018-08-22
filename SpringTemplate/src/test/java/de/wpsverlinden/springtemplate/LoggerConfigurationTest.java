package de.wpsverlinden.springtemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;
import org.slf4j.Logger;

/**
 *
 * @author Oliver Verlinden
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LoggerConfiguration.class)
public class LoggerConfigurationTest {
    
    @Autowired
    private Logger LOG;
    
    @Test
    public void testLoggerInjection() {
        assertThat(LOG.getName()).isEqualTo(this.getClass().getName());
    }
}