package com.springboot.SpringbootBasics.model;

import org.springframework.stereotype.Component;

@Component
public class Equipment {
    private int id;
    private String equipment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", equipment='" + equipment + '\'' +
                '}';
    }

    public void showEquipment(){
        System.out.println("Equipment received...");
    }

}
