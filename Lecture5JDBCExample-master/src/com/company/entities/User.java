package com.company.entities;

public class    User {
    private int id;
    private String name;
    private String surname;
    private boolean gender;
    private String profession;
    private int salary;
    public User() {

    }

    public User(String name, String surname, boolean gender, String profession, int salary) {
        setName(name);
        setSurname(surname);
        setGender(gender);
        setProfession(profession);
        setSalary(salary);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isGender() {
        return gender;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + (gender ? "Male" : "Female") + ", profession= " + profession + ", salary= " + salary +
                '}';

    }
}
