
/**
 * Write a description of class Flight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flight
{
    private String plane, origin, destination;
    private int number;

    public static void main(String args[])
    {
        Flight f1 = new Flight("Southwest", 345, "LAX", "JFK");
        System.out.println(f1);
    }
    
    public Flight(String airline, int num, String orig, String d)
    {
        plane = airline;
        origin = orig;
        destination = d;
        number = num;
    }
    
    public void setNumber(int num)
    {
        number = num;
    }
    
    public int getNumber()
    {
        return number;
    }
    
    public void setAirline(String Airline)
    {
        plane = Airline;
    }
    
    public String getAirline()
    {
        return plane;
    }
    
    public void setDestination(String d)
    {
        destination = d;
    }
    
    public  String getDestination(String destination)
    {
        return destination;
    }
    
    public void setOrigin(String o)
    {
        origin = o;
    }
    
    public String getOrigin()
    {
        return origin;
    }
    
    public String toString()
    {
        return plane + "\t" + number + "\t" + origin + " to " + destination;
    }    
}
