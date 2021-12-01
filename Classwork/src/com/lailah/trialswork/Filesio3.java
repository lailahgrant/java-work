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
public class Filesio3 {
//copying content from one file to another
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declare input and output file streams
        FileInputStream infile = null;
        FileOutputStream outfile = null;
        
        //declare a variable to hold the content(byte)
        byte byteRead;
        
        try{
            //connect infile to output.dat
            infile = new FileInputStream("city.txt"); //FileInputStream only refers to existing file
            
            //connect outfile to input.dat
            outfile = new FileOutputStream("cities.txt"); //FileOutputStream is used to create  a file
            
            //reading bytes from output.dat and writing them to input.dat
            
            do{
                byteRead = (byte)infile.read();
                outfile.write(byteRead);
            }while(byteRead != -1);
            
        }catch(FileNotFoundException e){
            System.out.println("File Doesnt Exist....");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally //close files
        {
            try{
                infile.close();
                outfile.close();
            }catch(IOException e){
                
            }
        }
    }
    
}
