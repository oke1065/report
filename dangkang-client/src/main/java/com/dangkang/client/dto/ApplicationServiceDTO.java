package com.dangkang.client.dto;

import javax.validation.constraints.NotNull;

public class ApplicationServiceDTO {

    @NotNull
    private String email;
    private String phoneNumber;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
