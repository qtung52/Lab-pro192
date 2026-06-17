/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Part1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter number of columns");
        int col = sc.nextInt();
        
        int[][] m = new int[row][col];
        System.out.println("Enter the matrix:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("m[%d][%d]= ", i, j);
                m[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Matrix inputted:");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.format("%3d", m[i][j]);
            }
            System.out.println();
        }
        
        int sum = 0;
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                sum += m[i][j];
            }
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (float)sum/(row*col));
    }
}
