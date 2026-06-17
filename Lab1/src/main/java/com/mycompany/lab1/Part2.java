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
public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number 1: ");
        float num1 = sc.nextFloat();
        System.out.println("Input the number 2: ");
        float num2 = sc.nextFloat();
        System.out.println("Input the operator: ");
        sc.nextLine();
        String op = sc.nextLine();
        
        switch (op) {
            case "+":
                System.out.println("the result of " + num1 + op + num2 + " = " + (num1 + num2) );
                break;
            case "-":
                System.out.println("the result of " + num1 + op + num2 + " = " + (num1 - num2) );
                break;
            case "*":
                System.out.println("the result of " + num1 + op + num2 + " = " + (num1 * num2) );
                break;
            case "/":
                if(num2 == 0) {
                    System.out.println("Khong chia het cho 0!");
                    break;
                }
                System.out.println("the result of " + num1 + op + num2 + " = " + (num1 / num2) );
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}
