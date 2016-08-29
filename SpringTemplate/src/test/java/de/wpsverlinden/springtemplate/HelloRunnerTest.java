package de.wpsverlinden.springtemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

/**
 *
 * @author Oliver Verlinden
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloRunnerTest {
    
    @Autowired
    private HelloRunner helloRunner;
    
    @Test
    public void testOutput() {
        assertThat(helloRunner.getMessage()).isEqualTo("Hello application");
    }
}
