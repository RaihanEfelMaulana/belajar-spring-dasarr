package raihanefelmaulana.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import raihanefelmaulana.spring.core.configuration.BarConfiguration;
import raihanefelmaulana.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
}
