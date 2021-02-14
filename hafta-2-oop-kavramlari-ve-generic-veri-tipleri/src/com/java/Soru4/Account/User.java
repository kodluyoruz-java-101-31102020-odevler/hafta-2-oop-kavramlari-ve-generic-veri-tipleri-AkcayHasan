package com.java.Soru4.Account;

import java.util.Date;
import java.util.List;

import com.java.Soru4.Addresses.Address;

public class User {
	
	String name;
    String lastname;
    String email;
    String password;
    String job;
    int age;
    List<Address> addressList;
    Date lastDate;

    public User(String name, String lastname, String email, String password, String job, int age, List<Address> addressList, Date lastDate) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.addressList = addressList;
        this.lastDate = lastDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

}
