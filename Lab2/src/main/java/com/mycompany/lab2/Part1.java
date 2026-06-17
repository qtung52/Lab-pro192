/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

/**
 *
 * @author DELL
 */

class Car {
    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;
    
    public Car(){};
    
    public Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }
    
    public void setColour(String colour) {
        this.colour = colour;
    }
    
    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }
    
    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
    
    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }
    
    public String getColour() {
        return colour;
    }
    
    public int getEnginePower() {
        return enginePower;
    }
    
    public boolean getConvertible() {
        return convertible;
    }
    
    public boolean getParkingbrake() {
        return parkingBrake;
    }
    
    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }
    
    public void pressAccleratorButton() {
        System.out.println("You have pressed the acclerator button");
    }
    
    public void output() {
        System.out.println("Colour: " + colour);
        System.out.println("Engine power: " + enginePower);
        System.out.println("Convertible: " + convertible);
        System.out.println("Parking Brake: " + parkingBrake);
    }
}

public class Part1 {

    public static void main(String[] args) {
        Car c = new Car();
        c.pressStartButton();
        c.pressAccleratorButton();
        c.output();
        
        Car c2 = new Car("Red", 100, true, true);
        c2.pressStartButton();
        c2.pressAccleratorButton();
        System.out.println("Colour of c2: " + c2.getColour());
        c2.output();
    }
}
