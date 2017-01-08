
/**
 * Write a description of class RandomCylinders here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;
import java.text.DecimalFormat;

public class RandomCylinders
{
    public static void main (String[] args)
    {
        double radius, height, volume, area;

        Random generator = new Random();
        radius = generator.nextInt(10) + 1; 
        height = generator.nextInt(10) + 1;

        volume = Math.PI * Math.pow(radius , 2) * height;
        area = 2 * Math.PI * radius * height;

        DecimalFormat fmt = new DecimalFormat ("0.0");
        
        System.out.print ("Cylinder Information");
        System.out.println ("");
        System.out.print ("Radius: " + radius);
        System.out.println ("");
        System.out.print ("Height: " + height);
        System.out.println ("");
        System.out.print ("The volume is: " + fmt.format(volume));
        System.out.println ("");
        System.out.print ("The surface area is: " + fmt.format(area));
    }
}

    