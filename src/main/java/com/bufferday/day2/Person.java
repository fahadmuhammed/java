package com.bufferday.day2;
import com.bufferday.day3.Name;

public class Person {
private Name personName;
private static int personCounter;
public Person(Name personName){
    this.personName = personName;
}
public Person (){
    personCounter++;
    /*empty on purpose - default constructor*/

}
public String helloWorld(){
    return "Hello World";
}
    public String hello(String name) {

        return "Hello "+name;
    }

    public static int numberOfPersons() {
        return personCounter;
    }
}
