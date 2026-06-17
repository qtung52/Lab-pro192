/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */

public class StudentList extends ArrayList<Student> {
    public StudentList() {
        super();
    }
    
    public Student search(String code) {
        code = code.trim().toUpperCase();
        for(int i = 0; i < this.size(); i++) {
            if(this.get(i).getCode().equals(code)) return this.get(i);
        }
        return null;
    }
    
    private boolean isCodeDupplicated(String code) {
        code = code.trim().toUpperCase();
        return search(code) != null;
    }
    
    public void addStudent() {
        String newCode, newName;
        int newMark;
        boolean codeDuplicated = false;
        
        do {
            newCode = Inputter.inputPattern("St. code S000:", "[sS][\\d]{3}");
            newCode = newCode.trim().toUpperCase();
            codeDuplicated = isCodeDupplicated(newCode);
            if(codeDuplicated) System.out.println("Code is duplicated!");
        } while(codeDuplicated == true);
        
        newName = Inputter.inputNonBlankStr("Enter name of new student: ");
        newName = newName.toUpperCase();
        newMark = Inputter.inputInt("Enter mark: ", 0, 10);
        
        Student s = new Student(newCode, newName, newMark);
        
        this.add(s);
        System.out.println("Student " + newCode + " has been added");
    }
    
    public void searchStudent() {
        if(this.isEmpty()) {
            System.out.println("Empty list. No search can be performed!");
        } else {
            String sCode = Inputter.inputString("Enter student code for search: ");
            Student s = this.search(sCode);
            if(s == null) {
                System.out.println("Student " + sCode + " doesn't existed!");
            } else {
                System.out.println("Found: " + s);
            }
        }
    }
    
    public void updateStudent() {
        if(this.isEmpty()) {
            System.out.println("Empty list. No update can be performed!");
        } else {
            String uCode = Inputter.inputString("Enter code for update student: ");
            Student s = this.search(uCode);
            if(s == null) {
                System.out.println("Student " + uCode + " doesn't existed!");
            } else {
                String oldName = s.getName();
                String msg = "Old name: "  + oldName + ". Enter new name: ";
                String newName = Inputter.inputNonBlankStr(msg);
                s.setName(newName);
                
                int oldMark = s.getMark();
                msg = "Old mark: " + oldMark + ". Enter new mark: ";
                int newMark = Inputter.inputInt(msg, 0, 10);
                s.setMark(newMark);
                System.out.println("Student " + uCode + " has been updated");
            }
        }
    }
    
    public void removeStudent() {
        if(this.isEmpty()) {
            System.out.println("Empty list. No remove can be performed!");
        } else {
            String rCode = Inputter.inputString("Enter code for remove student: ");
            Student s = this.search(rCode);
            if(s == null) {
                System.out.println("Student " + rCode + " doesn't existed!");
            } else {
                this.remove(s);
                System.out.println("Student " + rCode + " has been remove");
            }
        }    
    }
    
    public void displayAll() {
        if(this.isEmpty()) {
            System.out.println("Empty list!");
        } else {
            System.out.println("Student list:");
            for(Student x : this) {
                System.out.println(x);
            }
            System.out.println("Total: " + this.size() + " students");
        }
    }
}
