/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.looping;

/**
 *
 * @author Fretty
 */
public class EnhancedForLoopDemo {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        //print normal arrays
        for(int i=0; i<a.length; i++)
            System.out.println("a["+i+"] = "+a[i]);
            System.out.println("\n");
        //using enhanced for loop
        for(int i : a) //i : a - elements in a are placed in variable i
            System.out.println(i);
        
    }
}
