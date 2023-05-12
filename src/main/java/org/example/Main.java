package org.example;

import org.example.patterns.builder.AdvancePerson;
import org.example.patterns.builder.Person;
import org.example.patterns.builder.Person.Builder;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public static void builderPattern() {
    Person.Builder builder = new Builder();

    Person person = new Person.Builder()
        .setAddress("testAddress")
        .setFirstName("Yura")
        .setPhoneNumber("123321")
        .build();

    AdvancePerson advancePerson = new AdvancePerson.AdvanceBuilder().with($ -> {
      $.address = "das";
      $.carName = "dsadsa";
      $.firstName = "yura";
      $.phoneNumber = "12321";
    }).createPerson();
  }
}