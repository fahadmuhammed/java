package com.bufferday.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
  @Test
  public void shouldReturnHelloWorld(){

    Person fahad = new Person();
    assertEquals("Hello World",fahad.helloworld());
  }
}