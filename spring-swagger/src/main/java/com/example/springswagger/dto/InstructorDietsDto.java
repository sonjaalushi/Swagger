package com.example.springswagger.dto;

public class InstructorDietsDto {


    private String user_name;
    private String name;
    private String diet_id;
    private String type;

    public InstructorDietsDto(String user_name, String name, String diet_id, String type) {
        this.user_name = user_name;
        this.name = name;
        this.diet_id = diet_id;
        this.type = type;
    }

    public InstructorDietsDto(){}

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiet_id() {
        return diet_id;
    }

    public void setDiet_id(String diet_id) {
        this.diet_id = diet_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "InstructorDietsDto{" +
                "user_name='" + user_name + '\'' +
                ", name='" + name + '\'' +
                ", diet_id='" + diet_id + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}