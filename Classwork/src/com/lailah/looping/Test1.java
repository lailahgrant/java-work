/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.looping;

/**
 *
 * @author Lailah
 */
public class Test1 {
    public static void main(String[] args) {
        for(int i=1; i<=12; i++){
            for(int j=1;j<=12;j++){
                System.out.println(i+" * "+j+" = "+(i*j));
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
