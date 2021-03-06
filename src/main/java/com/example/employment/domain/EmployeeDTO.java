package com.example.employment.domain;

import java.time.LocalDate;

public class EmployeeDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String pesel;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Long id, String firstName, String lastName, LocalDate birthDate, String pesel) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.pesel = pesel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
}
//todo if used on any list ore map provide hashcode and equals
