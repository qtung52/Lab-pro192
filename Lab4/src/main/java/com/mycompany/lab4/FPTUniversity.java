/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab4;

/**
 *
 * @author DELL
 */
public class FPTUniversity extends University implements Role {
    String address;
    
    public FPTUniversity(){};
    
    public FPTUniversity(int size, String name, String address) {
        super(size, name);
        this.address = address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getAddress() {
        return address;
    }
    
    @Override
    public void createWorker() {
        System.out.println("Providing human resources");
    }
    
    @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }
}
