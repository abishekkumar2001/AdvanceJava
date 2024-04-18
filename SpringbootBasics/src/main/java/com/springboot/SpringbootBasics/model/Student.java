package com.springboot.SpringbootBasics.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //Denotes that it is a spring bean... An object in spring container....
@Scope("prototype") //Default scope is singleton
public class Student {
    private int id;
    private String name;
    private String dept;

    @Autowired
    private Equipment equipment; //To get an instance of Equipment class... Will create an object

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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Student() {
        System.out.println("Object created");
    }

    public Student(String name, int id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dept='" + dept + '\'' +
                '}';
    }

    public void displayHello(){
        System.out.println("Hello Student!");
        equipment.showEquipment(); //function defined in Equipment class
    }

}
