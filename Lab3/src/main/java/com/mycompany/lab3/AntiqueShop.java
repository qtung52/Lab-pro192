/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */

public class AntiqueShop {
    public static void main(String[] args) {
/*
        Scanner sc = new Scanner(System.in);
        Item item = null;
        int choice;
        do {
            System.out.println("====================");
            System.out.println("1. Create a Vase");
            System.out.println("2. Create a Statue");
            System.out.println("3. Create a Painting");
            System.out.println("4. Display the item");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.println("====================");
                    item = new Vase();
                    ((Vase)item).inputVase();
                    break;
                
                case 2:
                    System.out.println("====================");
                    item = new Statue();
                    ((Statue)item).inputStatue();
                    break;
                
                case 3:
                    System.out.println("====================");
                    item = new Painting();
                    ((Painting)item).inputPainting();
                    break;
                
                
                case 4:
                    System.out.println("====================");
                    if(item != null) {
                        if(item instanceof Vase vase) {
                            vase.outputVase();
                        } else if(item instanceof Statue statue) {
                            statue.outputStatue();
                        } else if(!(item instanceof Painting)) {
                            ((Painting)item).outputPainting();
                        }
                    } else {
                        System.out.println("You need to create an object");
                    }
                    break;
            }
        } while(choice <= 4);
*/
//                                      ***UPDATE***
        String[] options = {"Create a Vase", "Create a Statue", "Create a Painting", "Display the item"};
        Item item = null;
        int choice = 0;
        do {
            System.out.println("========Menu========");
            
            choice = Menu.getChoice(options);
            
            switch(choice) {
                case 1:
                    System.out.println("====================");
                    item = new Vase();
                    ((Vase)item).inputVase();
                    break;
                
                case 2:
                    System.out.println("====================");
                    item = new Statue();
                    ((Statue)item).inputStatue();
                    break;
                
                case 3:
                    System.out.println("====================");
                    item = new Painting();
                    ((Painting)item).inputPainting();
                    break;
                
                case 4:
                    System.out.println("====================");
                    if(item != null) {
                        if(item instanceof Vase) {
                            ((Vase)item).outputVase();
                        } else if(item instanceof Statue) {
                            ((Statue)item).outputStatue();
                        } else if(item instanceof Painting) {
                            ((Painting)item).outputPainting();
                        }
                    } else {
                        System.out.println("You need to create an object");
                    }
                    break;
            }
        } while(choice <= 4);
    }
}
