/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*program demo using multidimensional arrays*/
package com.lailah.arrays;

/**
 *
 * @author Fretty
 */
public class Multidimen_arrays {
    public static void main(String[] args) {
        //declaring and initializing 2D arrays
        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        //printing 2D arrays
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
