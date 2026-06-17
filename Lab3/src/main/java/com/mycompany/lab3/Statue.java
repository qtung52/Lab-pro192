/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author DELL
 */

public class Statue extends Item {
    private int weight;
    private String colour;
    
    public Statue() {};
    
    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public String getColour() {
        return colour;
    }
    
    public void outputStatue() {
        output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }
    
    public void inputStatue() {
        input();
        int w;
        String c;
        do {
            System.out.print("Enter Weight: ");
            w = sc.nextInt();
            System.out.print("Enter Colour: ");
            sc.nextLine();
            c = sc.nextLine();
            
            if(w <= 0) System.out.println("Nhap sai weight (weight > 0)! Vui long nhap lai!");
            if(c.isBlank()) System.out.println("KO dc de trong colour! Vui long nhap lai!");
        } while(w <= 0 || c.isBlank());
        setWeight(w);
        setColour(c);
    }
}
