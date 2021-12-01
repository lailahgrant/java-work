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
public class Vectoradd {
    public static void main(String[] args) {
        Vector item = new Vector();
        int size = args.length;
        for(int i=0; i<size; i++)
        {
            item.addElement(args[i]);
        }
        //delete item
        item.insertElementAt("Novels",3);
        int length = item.size();
        
        String a[] = new String[length];
        item.copyInto(a);
        
        System.out.println("The items are :-");
        for(String i:a)
            System.out.println(i);
    }
}
