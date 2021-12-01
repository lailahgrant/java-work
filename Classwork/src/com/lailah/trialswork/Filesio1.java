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

//writing bytes to a file
public class Filesio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declare and initialize a byte array
        byte city[] = {'K','A','M','P','A','L','A','\n','B','U','K','O','M','A','N','S','I','M','B','I','\n','K','A','L','E','R','W','E'};
        
        //create an output file stream
        FileOutputStream outfile = null;
        try{
            //connect the output stream to city.txt
            outfile = new FileOutputStream("D:\\class notes\\NetBeansProjects\\Classwork\\src\\com\\lailah\\trialswork\\city.txt");
            
            //write data to the stream
            outfile.write(city);
            outfile.close();
        }catch(IOException e){
            System.out.println(e);
            System.exit(-1);
        }
        
        
    }
    
}
