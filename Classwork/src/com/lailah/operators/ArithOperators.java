/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *program demo for arithmetic operators 
 * */
 
package com.lailah.operators;

/**
 *
 * @author Fretty
 */
public class ArithOperators {
    public static void main(String[] args) {
        float a=15.5f, b=11.2f; //f - used since decimals are regerded as double. if f not used,, use double type
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("a+b = "+(a+b));
        System.out.println("a-b = "+(a-b));
        System.out.println("a*b = "+(a*b));
        System.out.println("a/b = "+(a/b));
        System.out.println("a%b = "+(int)(a%b)); //(int) typecasting - changing datatype of a variable @ runtime
    }
}
