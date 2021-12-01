/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*program demo using arrays*/
package com.lailah.arrays;

/**
 *
 * @author Fretty
 */
public class Arraydemo {
    public static void main(String[] args) {
        //step 1 DECLARATION
        int a[];
        //step 2 CREATIoN
        a = new int[5];
        //step 3 INITILAIZATION
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        //display array using Enhanced for loop 
        System.out.println("The aray elements are ");
        for(int i : a) //i : a - elements in a are placed in variable i
            System.out.println(i);
        
    }
}
