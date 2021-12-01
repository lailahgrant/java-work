/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lailah.trialswork;
import java.io.*;

/**
 *
 * @author Lailah
 */
public class Filesio2 {
//reading bytes from a file
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create an input file straem
        FileInputStream infile = null;
        
        int b;
        try{
            //connect infile stream to the required file
            infile = new FileInputStream("D:\\class notes\\NetBeansProjects\\Classwork\\src\\com\\lailah\\trialswork\\city.txt");
            
            //read and display data
            while((b=infile.read()) != -1){
                System.out.println((char)b);
            }
            infile.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
