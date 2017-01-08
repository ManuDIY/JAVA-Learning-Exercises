
/**
 * Write a description of class Flight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flight
{

    private int number;
    private String airlinename, destination, origin;
    
    public static void main(String args[])
    {
        Flight f1 = new Flight("Southwest", 345, "LAX", "JFK");
        Flight f2 = new Flight("United", 191, "CHI", "DFW");
        Flight f3 = new Flight("American", 763, "DFW", "GRR");
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        
    }

    public Flight(String airline, int num, String orig, String dest)
    {
        airlinename = airline;
        number = num;
        origin = orig;
        destination = dest;
        
        
    }
    
    public void setNumber(int num)
    {
        number = num;
        
    }
    
    public int getNumber()
    {
        
        return number;
    }
    
    public void setAirline(String airline)
    {
        airlinename = airline;
          
    }
    
    public String getAirline()
    {  
        return airlinename;
        
    }
    
    public void setDestination(String dest)
    {
        destination = dest;
        
    }
    
    public String getDestination()
    {
        return destination;
        
    }
    
    public void setOrigin(String orig)
    {
        origin = orig;
        
    }
    
    public String getOrigin()
    {
        return origin;
        
    }
    
    
    public String toString()
    {
       
       return airlinename + "\t" + number + "  " + origin + " to " + destination; 
        
    }
    

        
    
}
