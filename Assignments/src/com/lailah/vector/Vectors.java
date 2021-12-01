/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.vector;
import java.util.Vector;
/**
 *
 * @author Fretty
 */
public class Vectors {
    public static void main(String[] args) {
        Vector item = new Vector();
        int size = args.length;
        for(int i=0; i<size; i++)
        {
            item.addElement(args[i]);
        }
        
        String a[] = new String[size];
        item.copyInto(a);
        
        System.out.println("The items are :-");
        for(String i:a)
            System.out.println(i);
    }
}
