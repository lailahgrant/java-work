/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//program demo using final 
package com.lailah.classes;

/**
 *
 * @author Fretty
 */
public class Finaldemo {
    public static void main(String[] args) {
       final int n1 = 10; //read only value
        System.out.println("n1 = "+n1);
       /* n1 *=2; //n1=n1*2
        //error shows that n1 cant be changed since its final(constant)
        System.out.println("n1 = "+n1); errors are commented to avoid problems on ececution*/
    }
}
