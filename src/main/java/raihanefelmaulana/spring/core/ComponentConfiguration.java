package raihanefelmaulana.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import raihanefelmaulana.spring.core.dataa.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
    "raihanefelmaulana.spring.core.repository",
    "raihanefelmaulana.spring.core.service",
    "raihanefelmaulana.spring.core.configuration",
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
