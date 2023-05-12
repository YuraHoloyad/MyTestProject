package org.example.patterns.builder;

public class Person {

  private final String firstName;
  private final String lastName;
  private final String address;
  private final String carName;
  private final String phoneNumber;


  private Person(String firstName, String lastName, String address, String carName,
      String phoneNumber) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.carName = carName;
    this.phoneNumber = phoneNumber;
  }

  public static class Builder {

    private String firstName;
    private String lastName;
    private String address;
    private String carName;
    private String phoneNumber;

    public Builder setFirstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public Builder setLastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public Builder setAddress(String address) {
      this.address = address;
      return this;
    }

    public Builder setCarName(String carName) {
      this.carName = carName;
      return this;
    }

    public Builder setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
      return this;
    }

    public Person build() {
      return new Person(firstName, lastName, address, carName, phoneNumber);
    }
  }
}
