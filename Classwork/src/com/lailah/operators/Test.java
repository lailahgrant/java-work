/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.operators;
import java.util.Scanner;
/**
 *
 * @author Lailah
 */
public class Test {
    public static void main(String[] args) {
        int sum=0;
        for(int i=0; i<=10; i=i+1){
            System.out.println("i = "+i);
            sum=sum+i;   
        }
        System.out.println("Sum of 1st 10 numbers is  = "+sum);
        int age;
        Scanner obj = new Scanner(System.in);
        try{
            System.out.println("Enter your age");
            age=obj.nextInt();
            if(age>18 && age<80){
                System.out.println("Your eligible to vote");
            }else{
                System.out.println("Your are not eligible to vote");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
