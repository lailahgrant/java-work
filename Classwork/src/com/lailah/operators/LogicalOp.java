/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.operators;
import java.util.Scanner;
/**
 *
 * @author Fretty
 */
public class LogicalOp {
    public static void main(String[] args) {
        int age;
        Scanner obj = new Scanner(System.in);
        try{
            System.out.println("Enter your age: ");
            age=obj.nextInt();
            if(age>=18 && age<75)
                System.out.println("You are eligible for Presidency");
            else
                System.out.println("Your are not  eligible");
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
