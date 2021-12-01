/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*program demo using assignment operator*/
package com.lailah.operators;

/**
 *
 * @author Fretty
 */
public class AssignmentOp {
    public static void main(String[] args) {
        int a=5; //= assignment operator
        System.out.println("a = "+a); //a=5
        a=a+2; //shorthand assignment operator
        System.out.println("a = "+a); //a =7
       a+=5;
        System.out.println("a = "+a); //a = 12
    }
}
