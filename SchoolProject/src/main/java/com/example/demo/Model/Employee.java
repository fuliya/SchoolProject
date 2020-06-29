package com.example.demo.Model;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Component
public class Employee {
    @Id
    private int empID;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private String gender;
    public String email;
    private String phoneNumber;


    public Employee() {
    }

    public int getEmpID() {
        return empID;
    }

    public Employee(int empID, String firstName, String lastName, Date birthDate, String gender, String email, String phoneNumber) {
        this.empID = empID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

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
