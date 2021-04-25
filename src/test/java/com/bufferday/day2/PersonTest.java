package com.bufferday.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

  @Test
  public void returnHelloWorld(){

    Person fahad = new Person();
    assertEquals("Hello World",fahad.helloWorld());
  }

  @Test
  public void returnHelloFahad(){
    Person person = new Person();
    Person person2 = new Person();
    assertEquals("Hello Fahad",person.hello("Fahad"));
  }
}