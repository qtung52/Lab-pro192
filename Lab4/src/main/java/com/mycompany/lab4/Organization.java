/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab4;

/**
 *
 * @author DELL
 */
abstract public class Organization {
    protected int size;
    
    public Organization(){};
    
    public Organization(int size) {
        this.size = size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    public int getSize() {
        return size;
    }
    
    abstract void communicateByTool();
    
    @Override
    public String toString() {
        return "Size: " + size;
    }
}
