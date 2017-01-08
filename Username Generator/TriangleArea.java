
/**
 * Write a description of class TriangleArea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class TriangleArea
{
    public static void main (String[] args)
    {
        double l1, l2, l3, per, area;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print ("Enter Length 1: ");
        l1 = scan.nextDouble();
        System.out.print ("Enter Length 2: ");
        l2 = scan.nextDouble();
        System.out.print ("Enter Length 3: ");
        l3 = scan.nextDouble();
        
       double s = (l1 + l2 + l3) * .5;
      area = Math.sqrt(s * (s - l1) * (s - l2) * (s - l3) );
        

        DecimalFormat fmt = new DecimalFormat ("0.000");
        
        System.out.print ("The area of the triangle is: " + fmt.format(area));
    }
}    
