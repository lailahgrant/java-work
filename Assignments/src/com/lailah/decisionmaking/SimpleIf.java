/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.decisionmaking;
import java.util.Scanner;
/**
 *
 * @author Fretty
 */

public class SimpleIf {
    public static void main(String[] args) {
        int age;
        Scanner obj = new Scanner(System.in);
        try{
                System.out.println("Ebter your age : ");
                        age=obj.nextInt();
            if(age>=18)
                System.out.println("Your are eligible to vote since you are "+age);
        }catch(Exception ex)
            {
        ex.printStackTrace();
    }
    }
    
}
