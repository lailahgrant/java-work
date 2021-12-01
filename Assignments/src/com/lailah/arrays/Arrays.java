/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*program demo to find minimum number in an array*/
package com.lailah.arrays;

/**
 *
 * @author Fretty
 */

public class Arrays {
    
    
    static void min(int arr[])
{
int min = arr[0];
for(int i=1 ; i<arr.length; i++)
if(min>arr[i])
min=arr[i];
System.out.println(min);
}
    
    public static void main(String[] args) {
        int a[]={2,1,5,8,9};
        min(a);
    }
}
