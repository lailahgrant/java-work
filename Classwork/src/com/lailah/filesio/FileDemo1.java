/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * program demo to read from the file
 */
package com.lailah.filesio;
import java.io.*;
/**
 * @author Fretty
 */
public class FileDemo1 {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("D:\\class notes\\NetBeansProjects\\Classwork\\src\\com\\lailah\\filesio\\abc.txt");
            int  i=0;
            //use while loop
            while((i=fin.read()) != -1) //!= -1 read till end of file
            {
                System.out.println((char) i);
            }
            System.out.println();
            fin.close();
        }catch(Exception ex){
            System.out.println(ex);
        } 
    }
}
