/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author DELL
 */

public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWaterColour;
    private boolean isFramed;
    
    public Painting() {};
    
    public Painting(int height, int width, boolean isWaterColour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWaterColour = isWaterColour;
        this.isFramed = isFramed;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public void setIsWaterColour(boolean isWaterColour) {
        this.isWaterColour = isWaterColour;
    }
    
    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getWidth() {
        return width;
    }
    
    public boolean getIsWaterColour() {
        return isWaterColour;
    }
    
    public boolean getIsFramed() {
        return isFramed;
    }
    
    public void outputPainting() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Is Water Colour: " + isWaterColour);
        System.out.println("Is Framed: " + isFramed);
    }
    
    public void inputPainting() {
        input();
        int h;
        int w;
        boolean water;
        boolean frame;
        do {
            System.out.print("Enter Height: ");
            h = sc.nextInt();
            System.out.print("Enter Width: ");
            w = sc.nextInt();
            System.out.print("Enter Is Water Colour: ");
            water = sc.nextBoolean();
            System.out.print("Enter Is Frame: ");
            frame = sc.nextBoolean();
            
            if(h <= 0) System.out.println("Nhap sai height (height > 0)! Vui long nhap lai!");
            if(w <= 0) System.out.println("Nhap sai width (width > 0)! Vui long nhap lai!");
        } while(h <= 0 || w <= 0);
        setHeight(h);
        setWidth(w);
        setIsWaterColour(water);
        setIsFramed(frame);
    }
}
