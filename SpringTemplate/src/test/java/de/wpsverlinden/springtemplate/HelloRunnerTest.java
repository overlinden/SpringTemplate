package de.wpsverlinden.springtemplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;
import org.mockito.InjectMocks;
import org.slf4j.Logger;
import org.springframework.boot.test.mock.mockito.MockBean;

/**
 *
 * @author Oliver Verlinden
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {HelloRunner.class})
public class HelloRunnerTest {
    
    @MockBean
    private Logger LOG;
    
    @InjectMocks
    private HelloRunner helloRunner;
    
    @Test
    public void testOutput() {
        assertThat(helloRunner.getMessage()).isEqualTo("Hello application");
    }
}