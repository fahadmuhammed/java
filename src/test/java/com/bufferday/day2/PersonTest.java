package com.bufferday.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
  @Test
  public void shouldReturnName(){

    Person fahad = new Person();
    fahad.name = "Fahad Muhammed";
    fahad.age = 19;
    assertEquals("Fahad Muhammed",fahad.getName());
    assertEquals(19,fahad.getAge());
  }
}