package raihanefelmaulana.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "raihanefelmaulana.spring.core.configuration"
})
public class ScanConfiguration {
}
