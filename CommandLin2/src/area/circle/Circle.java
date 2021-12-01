/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.circle;

/**
 *
 * @author Fretty
 */
public class Circle {
    public static void main(String[] args) {
        int radius = Integer.parseInt(args[0]);
        double area = 3.142*radius*radius;
        double perimeter = 2*3.142*radius;
        System.out.println("Area of a circle is "+area);
        System.out.println("Perimeter of a circle is "+perimeter);
        
    }
    
}
