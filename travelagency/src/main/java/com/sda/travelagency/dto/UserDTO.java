package com.sda.travelagency.dto;

public class UserDTO {

    private Long isoCode;
    private String userName;
    private String password;
    private String role;

    public UserDTO(Long isoCode, String userName, String password, String role) {
        this.isoCode = isoCode;
        this.userName = userName;
        this.password = password;
        this.role = role;
    }


    public Long getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(Long isoCode) {
        this.isoCode = isoCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
