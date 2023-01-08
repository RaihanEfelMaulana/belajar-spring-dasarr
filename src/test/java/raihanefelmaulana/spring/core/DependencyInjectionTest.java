package raihanefelmaulana.spring.core;

import raihanefelmaulana.spring.core.DependencyInjectionConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import raihanefelmaulana.spring.core.dataa.Bar;
import raihanefelmaulana.spring.core.dataa.Foo;
import raihanefelmaulana.spring.core.dataa.FooBar;

public class DependencyInjectionTest {

  private ApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
  }

  @Test
  void testDI() {

    Foo foo = applicationContext.getBean("fooFirst", Foo.class);
    Bar bar = applicationContext.getBean(Bar.class);
    FooBar fooBar = applicationContext.getBean(FooBar.class);

    Assertions.assertSame(foo, fooBar.getFoo());
    Assertions.assertSame(bar, fooBar.getBar());

  }

  @Test
  void testNoDI() {

    Foo foo = new Foo();
    Bar bar = new Bar();

    FooBar fooBar = new FooBar(foo, bar);

    Assertions.assertSame(foo, fooBar.getFoo());
    Assertions.assertSame(bar, fooBar.getBar());

  }
}
