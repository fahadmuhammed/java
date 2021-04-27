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
    assertEquals("Hello Fahad",person.hello("Fahad"));
  }
  @Test
  public void returnNumberOfPersons(){
    Person person1 = new Person();
    Person person2 = new Person();
    Person person3 = new Person();
    Person person4 = new Person();
    assertEquals(4,Person.numberOfPersons());
  }
}