package org.example.patterns.builder;

import java.util.function.Consumer;

public class AdvancePerson {
  private String firstName;
  private String lastName;
  private String address;
  private String carName;
  private String phoneNumber;

  private AdvancePerson(String firstName, String lastName, String address, String carName,
      String phoneNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.carName = carName;
    this.phoneNumber = phoneNumber;
  }

  public static class AdvanceBuilder{
    public String firstName;
    public String lastName;
    public String address;
    public String carName;
    public String phoneNumber;

   public AdvanceBuilder with(Consumer<AdvanceBuilder> builderConsumer){
     builderConsumer.accept(this);
     return this;
   }

    public AdvancePerson createPerson() {
      return new AdvancePerson(firstName,lastName,address,carName,phoneNumber);
    }
  }
}
