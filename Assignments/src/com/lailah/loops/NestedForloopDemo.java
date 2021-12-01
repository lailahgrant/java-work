/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.loops;
import java.util.Scanner;
/**
 *
 * @author Fretty
 */
public class NestedForloopDemo {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        try{
            System.out.println("Enter number of times");
            int n = obj.nextInt();
            for(int i=1; i<=n; i++)
            {
                for(int j=1; j<=10; j++)
                {
                    System.out.println(i+" * "+j+" is ="+(i*j));
                }
                System.out.println("\n");
            }
    }catch(Exception ex){
        ex.printStackTrace();
    }
}
}