/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Part3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] list = new String[10];
        
        for(int i = 0; i < 10; i++) {
            System.out.printf("Enter student %d name: ", i+1);
            list[i] = sc.nextLine().toUpperCase();
        }
        
        System.out.println("Name student inputted:");
        for(String x : list) {
            System.out.println(x);
        }
    }
}
