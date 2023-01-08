package raihanefelmaulana.spring.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import raihanefelmaulana.spring.core.dataa.Bar;
import raihanefelmaulana.spring.core.dataa.Foo;

@Slf4j
@Configuration
public class DependsOnConfiguration {

  @Lazy
  @Bean
  @DependsOn({
      "bar"
  })
  public Foo foo(){
    log.info("Create new Foo");
    return new Foo();
  }

  @Bean
  public Bar bar(){
    log.info("Create new Bar");
    return new Bar();
  }

}
