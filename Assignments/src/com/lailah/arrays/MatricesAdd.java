/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.arrays;

/**
 *
 * @author Fretty
 */
public class MatricesAdd {
    public static void main(String[] args) {
        //create two matrices ie 2 rows, 3 columns
        int a[][] = {{1,2,3},{4,5,6}};
        int b[][] = {{1,2,3},{4,5,6}};
        
        //create a matrix to store the sum of 2 matrices
        int c[][] = new int[2][3]; //rows by columns
        
        //adding & printing addition of 2 matrices
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println(); //new line
        }
        
    }
}
