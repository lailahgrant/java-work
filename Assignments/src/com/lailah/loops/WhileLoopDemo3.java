/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.loops;

/**
 *
 * @author Fretty
 */
public class WhileLoopDemo3 {
    public static void main(String[] args) {
        int i=1, sum=0;
    while(i<=10)
    {
        System.out.println(i);
        sum=sum+i;
        i++; //i=i+1;
     }
    System.out.println("sum of the ist 10 nos is = "+sum);
    }
}
