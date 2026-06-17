/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

/**
 *
 * @author DELL
 */

public class StudentManager {
    public static void main(String[] args) {
        String[] options = {"Add new student", "Sreach a student",
                            "Update name and mark", "Remove a student",
                            "Display all", "Quit"};
        int choice = 0;
        StudentList list = new StudentList();
        
        do {
            System.out.println("**Student Managing Program**");
            choice = Menu.getChoice(options);
            
            switch(choice) {
                case 1:
                    System.out.println("============================");
                    list.addStudent();
                    break;
                case 2:
                    System.out.println("============================");
                    list.searchStudent();
                    break;
                case 3:
                    System.out.println("============================");
                    list.updateStudent();
                    break;
                case 4:
                    System.out.println("============================");
                    list.removeStudent();
                    break;
                case 5:
                    System.out.println("============================");
                    list.displayAll();
                    break;
                default:
                    System.out.println("Bye bye!");
            }
        } while(choice > 0 && choice < 6);
    }
}
