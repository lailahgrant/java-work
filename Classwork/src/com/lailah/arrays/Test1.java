/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.arrays;
import java.util.Scanner;
import java.util.Arrays; //to sort arrays
/**
 *
 * @author Lailah
 */
public class Test1 {
    public static void main(String[] args) {
        int a[];
        a=new int[5];
        Scanner obj = new Scanner(System.in);
        try{
            System.out.println("Enter any integer numbers");
            for(int i=0; i<a.length; i++)
                a[i]=obj.nextInt();
            
            //sort arrays
            Arrays.sort(a);
            System.out.println("Array numbers entered are ");
            for(int i:a)
                System.out.println(i);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
