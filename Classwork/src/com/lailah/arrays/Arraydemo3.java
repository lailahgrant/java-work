/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Reading array elements @ runtime*/
package com.lailah.arrays;
import java.util.Scanner;

/**
 *
 * @author Fretty
 */
public class Arraydemo3 {
    public static void main(String[] args) {
        int a[];
        a = new int[5];
        Scanner obj = new Scanner(System.in);
        try{
            System.out.println("Enter array elements: ");
            for(int i=0; i<a.length; i++)
                a[i]=obj.nextInt();
            System.out.println("The array elements are ");
            for(int i : a)
                System.out.println(i);
    }catch(Exception ex)
    {
        ex.printStackTrace();
    }
}
}