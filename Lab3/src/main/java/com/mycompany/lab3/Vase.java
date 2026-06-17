/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author DELL
 */

public class Vase extends Item {    
    private int height;
    private String meterial;
    
    public Vase() {};
    
    public Vase(int value, String creator, int height, String meterial) {
        super(value, creator);
        this.height = height;
        this.meterial = meterial;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public void setMeterial(String meterial) {
        this.meterial = meterial;
    }
    
    public int getHeight() {
        return height;
    }
    
    public String getMeterial() {
        return meterial;
    }
    
    public void outputVase() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Meterial: " + meterial);
    }
    
    public void inputVase() {
        input();
        int h;
        String m;
        do {
            System.out.print("Enter Height: ");
            h = sc.nextInt();
            System.out.print("Enter Meterial: ");
            sc.nextLine();
            m = sc.nextLine();
            
            if(h <= 0) System.out.println("Nhap sai height (height > 0)! Vui long nhap lai!");
            if(m.isBlank()) System.out.println("KO dc de trong meterial! Vui long nhap lai!");
        } while(h <= 0 || m.isBlank());
        setHeight(h);
        setMeterial(m);
    }
}
