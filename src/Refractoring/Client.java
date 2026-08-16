package com.speechify;

public class Client {
    /*id and name declared in the upper class. Which is good*/
    private String id;
    private String name;

 public Client() {
    }

   
    //calling the get functions directly. Since we already have them. Instead of using this. everytime
    public Client(String id, String name) {
        getId();
        getName();   
    }
//good separation for getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
} 


