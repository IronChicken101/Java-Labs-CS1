public class Airplane
{
    int TAKE_OFF_SPEED = 150;
    int ASCEND_RATE = 150;
    int ASCEND_MAX = 450;
    int CRUSING_SPEED = 585;
    int DES_RATE = 150;
    int DES_MAX = 150;
    int FBR = 12;
    int ALT_CHANGE = 2000;    
    private boolean ground;
    private double latitude;
    private double longitude;
    private int heading;
    private int altitude;
    private int speed;
    private int fuel;
    

    public Airplane(int alt, double lat, double lon, int s, int f, int head, boolean g)
    {
        altitude = alt;
        latitude = lat;
        longitude = lon;
        speed = s;
        fuel = f;
        heading = head;
        ground = g;
    }
    
      
    public void setAltitude(int alt)
    {
        altitude = alt;
    }
    
    public void setLat (double lat)
    {
        latitude = lat;
    }
    
    public void setLon (double lon)
    {
        longitude = lon;
    }
    
    public void setSpeed (int s)
    {
        speed = s;
    }
    
    public void setHeading(int h)
    {
        heading = h;
    }
    
    public int getAltitude()
    {
        return altitude;
    }
    
    public double getLat()
    {
        return latitude;
    }
    
    public double getLon()
    {
        return longitude;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public int getHeading()
    {
        return heading;
    }
    
    public boolean getGround()
    {
        return ground;
    }
    
    public int getAltChange()
    {
        return ALT_CHANGE;
    }
    
    public void takeOff()
    {
        speed = TAKE_OFF_SPEED;
        altitude = altitude + 4;
        ground = false;
        fuel = fuel - FBR;
    }
    
        public void cruising()
    {
        speed = CRUSING_SPEED;
        ground = false;
        fuel = fuel - FBR;
    }
    
    
    public void ascend()
    {
        if (speed < 450)
        {
            speed = speed + ASCEND_RATE;
        }
        altitude = altitude + ALT_CHANGE;
        ground = false;
        fuel = fuel - FBR;
    }
    
    public void descend()
    {
        if (speed > DES_MAX)
        {
            speed = speed - DES_RATE;
        }
        altitude = altitude - ALT_CHANGE;
        ground = false;
        fuel = fuel - FBR;
    }
    
    public void landing(int FIN_ALT)
    {
        speed = 0;
        ground = true;
        altitude = FIN_ALT;
        fuel = fuel - FBR;
    }
    
    public String toString()
    {
        return "Latitude: " + String.format("%.4f",latitude)+ ", Longitude: " + String.format("%.4f", longitude) + ", Altitude: " + altitude + "\nSpeed: " + speed + " MPH, Heading: " + heading + " Degrees\nFuel: " + fuel + " Gallons, onGround: "+ground+"\n\n" ;
    }
}
