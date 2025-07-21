package com.abutua.product_backend.models;

public class Category {
    // Atributes
    private int id;
    private String name;

    // Constructors
    public Category(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println("Construindo uma categoria");
    }

    public Category(){

    }

    // Methods
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

}
