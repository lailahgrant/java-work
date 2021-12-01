/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandline;

/**
 *
 * @author Fretty
 */
public class CommandLine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2,sum;
        n1 = Integer.parseInt(args[0]);
        n2 = Integer.parseInt(args[1]);
        sum = n1+ n2;
        System.out.println( "the additioin of" +n1+  "and" +n2+ "is ="+ sum );
    }
    
}
