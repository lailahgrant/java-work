/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.arrays;

/**
 *
 * @author Lailah
 */
public class Test {
    public static void main(String[] args) {
        int x[],sum=0;
        x=new int[5];
        x[0]=1; x[1]=2; x[2]=3; x[3]=4; x[4]=5;
        for(int i:x)
            System.out.println(i);
        
        for(int j=0; j<5; j++)
            sum=sum+x[j];
        System.out.println("Sum of elements in array is "+sum);
    }
}
