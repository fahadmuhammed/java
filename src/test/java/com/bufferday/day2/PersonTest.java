package com.bufferday.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

  @Test
  public void returnHelloWorld() {

    Person fahad = new Person();
    assertEquals("Hello World", fahad.helloWorld());
  }

  @Test
  public void returnHelloFahad() {
    Person person = new Person();
    assertEquals("Hello Fahad", person.hello("Fahad"));
  }

  @Test
  public void returnNumberOfPersons() {
    Person person1 = new Person();
    Person person2 = new Person();
    Person person3 = new Person();
    Person person4 = new Person();
    assertEquals(4, Person.numberOfPersons());
  }

  @Test
  public void returnNumberOfPersonsInLoop() {
    Person person1;
    int i;

    for (i=0; i<4; i++){
      person1 = new Person();
    }

    i=0;
    while (i<4){
      person1 = new Person();
      i++;
    }

      i = 0;
    do {
      person1 = new Person();
      i++;
    } while (i < 4);
    assertEquals(12, Person.numberOfPersons());
  }

  @Test
  public void demonstrateBoolean() {
    Person person1 = new Person();
    person1.age = 20;
    assertEquals("Yes",person1.eligibleToVote());
  }
  @Test
  public void CheckEligibility(){
    Person person1 = new Person();
    person1.meritEligible = false;
    person1.lowIncomeFamily = true;
    assertEquals(false,person1.meritCumMeans());
  }
  @Test
  public void demonstrateArrays() {
    Person persons [] = new Person[4];
    persons[0] = new Person();
    persons[1] = new Person();
    persons[2] = new Person();
    persons[3] = new Person();
    for(int i=0; i<persons.length; i++){
      persons[i] = new Person();
    }
    for (Person person : persons) {
      person.helloWorld();
    }

  }
}




