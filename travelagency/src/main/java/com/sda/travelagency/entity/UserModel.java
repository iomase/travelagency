package com.sda.travelagency.entity;

import com.sda.travelagency.dto.UserDTO;
import org.springframework.data.annotation.Id;
import org.springframework.ui.Model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class UserModel {

    @Id
    @Column(length = 64)
    private String username;
    private String password;
    private String email;
    private String role;
    @javax.persistence.Id
    private String id;

    public UserModel() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getRole() {
        return role;
    }


}
