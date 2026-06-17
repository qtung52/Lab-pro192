/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab6;

import java.util.Scanner;

/**
 *
 * @author DELL
 */

public class Part2_2 {
    
    public String inputString() throws Exception {
        String pattern = "[S][E]\\d{3}";
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        s = sc.nextLine();
        if(!s.matches(pattern)) {
            throw new Exception();
        }
        return s;
    }
    
    public static void main(String[] args) {
        Part2_2 obj = new Part2_2();
        boolean cont = false;
        do{
            try{
                String s = obj.inputString();
                System.out.println("The string is " + s);
                cont = false;
            }catch(Exception e) {
                System.out.println("The string is invalid");
                cont = true;
            }
        }while(cont);
    }
}
