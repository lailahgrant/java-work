/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.decisionmaking;

/**
 *
 * @author Fretty
 */
public class sum_and_divisible {
    public static void main(String[] args) {
        int sum=0;
        for(int i=101; i<200; i++){
            if(i%7==0)
                System.out.println(i);
            sum=sum+i;
        }
            System.out.println("their sum is = "+sum);
    }    
}
