package org.backend.dfldemo.models.dto;

public class HomeDTO {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private Number phoneNumber;

    public HomeDTO(String firstName, String lastName, String emailAddress, Number phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Number getPhoneNumber() {
        return phoneNumber;
    }
}
