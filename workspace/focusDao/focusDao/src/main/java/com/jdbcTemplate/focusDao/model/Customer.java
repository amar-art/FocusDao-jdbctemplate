package com.jdbcTemplate.focusDao.model;



public class Customer {

    private  String firstName;
    private int Age;

    public Customer(String firstName, int age) {
        this.firstName = firstName;
        Age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public Customer() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = Age;
    }
}
