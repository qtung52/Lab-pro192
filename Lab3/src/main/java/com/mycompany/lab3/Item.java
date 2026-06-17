/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */

public class Item {
    Scanner sc = new Scanner(System.in);
    
    protected int value;
    protected String creator;
    
    public Item() {};
    
    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public int getValue() {
        return value;
    }
    
    public String getCreator() {
        return creator;
    }
    
    public void output() {
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }
    
    public void input() {
        int v;
        String c;
        do {
            System.out.print("Enter Value: ");
            v = sc.nextInt();
            System.out.print("Enter Creator: ");
            sc.nextLine();
            c = sc.nextLine();
            
            if(v <= 0) System.out.println("Nhap sai value (value > 0)! Vui long nhap lai!");
            if(c.isBlank()) System.out.println("KO dc de trong creator! Vui long nhap lai!");
        } while(v <= 0 || c.isBlank());
        setValue(v);
        setCreator(c);
    }
}