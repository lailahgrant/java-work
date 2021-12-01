/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*program to find dum of arrays*/
package com.lailah.arrays;

/**
 *
 * @author Fretty
 */
public class Arraydemo2 {
    public static void main(String[] args) {
        int x[], sum=0;
        x = new int[6];
        x[0]=1;
        x[1]=2;
        x[2]=3;
        x[3]=4;
        x[4]=5;
        x[5]=6;
        //sum=sum+x[];
        for(int i : x) //i : a - elements in x are placed in variable i
            System.out.println(i);
        //sum of arrays
        for(int j=0; j<6; j++)
            sum=sum+x[j];
        System.out.println("The sum of elements in arrays is = "+sum);
    }
}
