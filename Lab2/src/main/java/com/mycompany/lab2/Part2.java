/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author DELL
 */

class Guitar {
    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;
    
    public Guitar(){};
    
    public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public void setBuilder(String builder) {
        this.builder = builder;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setBackWood(String backWood) {
        this.backWood =  backWood;
    }
    
    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }
    
    public String getSerialNumber() {
        return serialNumber;
    }
    
    public int getPrice() {
        return price;
    }
    
    public String getBuilder() {
        return builder;
    }
    
    public String getModel() {
        return model;
    }
    
    public String getBackWood() {
        return backWood;
    }
    
    public String getTopWood() {
        return topWood;
    }
    
    public void createSound() {
        System.out.println("Serial Number: " + getSerialNumber());
        System.out.println("Price: " + getPrice());
        System.out.println("Builder: " + getBuilder());
        System.out.println("Model: " + getModel());
        System.out.println("Back Wood: " + getBackWood());
        System.out.println("Top Wood: " + getTopWood());
    }
}

public class Part2 {
    public static void main(String[] args) {
        Guitar g1 = new Guitar();
        Guitar g2 = new Guitar("G123", 2000, "Sony", "Model123", "Hard Wood", "Soft Wood");
        
        System.out.println("State of g1:");
        g1.createSound();
        
        System.out.println("State of g2:");
        g2.createSound();
        
        System.out.println("Set price = 3000 of g1");
        g1.setPrice(3000);
        System.out.println("Get price of g1: " + g1.getPrice());
    }
}
