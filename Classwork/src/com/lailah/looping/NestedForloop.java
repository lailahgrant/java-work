/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*program demo fro nested for loop to make a calculation table*/
package com.lailah.looping;

/**
 *
 * @author Fretty
 */
public class NestedForloop {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++)
        {
            for(int j=1; j<=10; j++)
            {
                System.out.println(i+" * "+j+" = "+(i*j));
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
