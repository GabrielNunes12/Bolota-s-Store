package com.artesdabolota.ArtesDaBolota.DTOs;

import com.artesdabolota.ArtesDaBolota.Models.PersonModel;

import java.io.Serializable;

public class PersonDTO implements Serializable {
    private static long serialVersionUID = 1L;

    private Long id;
    private String email;
    private String password;
    private String name;

    public PersonDTO() {
    }



    public PersonDTO(PersonModel entity) {
        this.id = entity.getId();
        this.email = entity.getEmail();
        this.password = entity.getPassword();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
