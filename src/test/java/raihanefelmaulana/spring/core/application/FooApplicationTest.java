/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package raihanefelmaulana.spring.core.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import raihanefelmaulana.spring.core.dataa.Foo;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author asus
 */
@SpringBootTest(classes = FooApplication.class)
public class FooApplicationTest {
     @Autowired
  Foo foo;

  @Test
  void testSpringBoot() {
    Assertions.assertNotNull(foo);
  }
}
