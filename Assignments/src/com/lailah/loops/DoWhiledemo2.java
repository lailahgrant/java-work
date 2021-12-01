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
public class DoWhiledemo2 {
    public static void main(String[] args) {
        int i=1, sum=0;
        do{
            System.out.println(i);
             sum=sum+i;
            i++;
        }while(i<=10);
        System.out.println("sum of 1st 10 nos is = "+sum);
    }
}
