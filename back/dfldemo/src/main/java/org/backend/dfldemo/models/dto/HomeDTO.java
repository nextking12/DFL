package org.backend.dfldemo.models.dto;

public class HomeDTO {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String phoneNumber;

    public HomeDTO(String firstName, String lastName, String emailAddress, String phoneNumber) {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
