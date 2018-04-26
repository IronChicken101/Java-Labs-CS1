public class AirplaneRunner
{
    public static void main(String[] args)
    {
        double AUS_LAT = 30.1941;
        double AUS_LON = -97.6711;
        int AUS_ALT = 545;
        double DALL_LAT = 32.8998; 
        double DALL_LON = -97.0403; 
        int DALL_ALT = 603;
        int oldSpeed = 0;
        int DISTANCE = 188; 
        double distanceTraveled = 0;
        double percentage = 0;
        
        Airplane plane = new Airplane (AUS_ALT, AUS_LAT, AUS_LON, 0, 6865, 10, true);
        System.out.println("Initial State: \n" + plane);
        
        int min = 1;  
        while(plane.getAltitude() < 20000)
        {
            oldSpeed = plane.getSpeed();
            plane.ascend();
            distanceTraveled = updateDisTraveled(plane,oldSpeed,distanceTraveled);
            percentage = distanceTraveled / DISTANCE;
            plane.setLon(calcLongitude(AUS_LON, DALL_LON, percentage));
            plane.setLat(calcLatitude(AUS_LAT, DALL_LAT, percentage));
            System.out.print(("Minute " + min + ", Ascending, Distance Traveled = " + String.format("%.2f",distanceTraveled) +" Miles\n"));
            System.out.println(plane);
            min++;
        }
        
        while (plane.getGround())
        {
            oldSpeed = plane.getSpeed();
            plane.takeOff();
            distanceTraveled = updateDisTraveled(plane,oldSpeed,distanceTraveled);
            percentage = distanceTraveled / DISTANCE;
            plane.setLon(calcLongitude(AUS_LON, DALL_LON, percentage));
            plane.setLat(calcLatitude(AUS_LAT, DALL_LAT, percentage));
            System.out.print(("Minute " + min + ", Taking Off, Distance Traveled = " + String.format("%.2f",distanceTraveled) +" Miles\n"));
            System.out.println(plane);
            min++;
        }
        
        while(percentage <= 0.85)
        {
            oldSpeed = plane.getSpeed();
            plane.cruising();
            distanceTraveled = updateDisTraveled(plane,oldSpeed,distanceTraveled);
            percentage = distanceTraveled / DISTANCE;
            plane.setLon(calcLongitude(AUS_LON, DALL_LON, percentage));
            plane.setLat(calcLatitude(AUS_LAT, DALL_LAT, percentage));
            System.out.print(("Minute " + min + ",Cruising, Distance Traveled = " + String.format("%.2f",distanceTraveled) +" Miles\n"));
            System.out.println(plane);
            min++;
        }
        plane.setAltitude((plane.getAltitude() - DALL_ALT));
        
        while(plane.getAltChange() + AUS_ALT < plane.getAltitude())
        {
            oldSpeed = plane.getSpeed();
            plane.descend();
            distanceTraveled = updateDisTraveled(plane,oldSpeed,distanceTraveled);
            percentage = distanceTraveled / DISTANCE;
            plane.setLon(calcLongitude(AUS_LON, DALL_LON, percentage));
            plane.setLat(calcLatitude(AUS_LAT, DALL_LAT, percentage));
            System.out.print(("Minute " + min + ", Descending, Distance Traveled = " + String.format("%.2f",distanceTraveled) +" Miles\n"));
            System.out.println(plane);
            min++;
        }

        while(plane.getAltitude() > DALL_ALT)
        {
            oldSpeed = plane.getSpeed();
            plane.landing(DALL_ALT);
            distanceTraveled = updateDisTraveled(plane,oldSpeed,distanceTraveled);
            percentage = distanceTraveled / DISTANCE;
            plane.setLon(calcLongitude(AUS_LON, DALL_LON, percentage));
            plane.setLat(calcLatitude(AUS_LAT, DALL_LAT, percentage));
            System.out.print(("Minute " + min + ", Landed, Distance Traveled = " + String.format("%.2f",distanceTraveled) +" Miles\n"));
            System.out.println(plane);
            min++;
        }
        System.out.println("Final State: \n" + plane);
    }
    public static double calcLatitude(double lattOne, double lattTwo, double p)
    {
        double latitude = lattOne + ((Math.abs(lattOne - lattTwo)) * p);
        return latitude;
    }
    
    public static double calcLongitude(double longOne, double longTwo, double p)
    {
        double longitude = longOne + ((Math.abs(longOne - longTwo)) * p);
        return longitude;
    }
    public static double updateDisTraveled(Airplane planeOne, int o, double d)
    {
        Airplane plane = planeOne;
        int oldSpeed = o;
        double newSpeed = plane.getSpeed();
        double distTraveled = d;
        double avgSpeed = (newSpeed + oldSpeed) / 2;
        distTraveled = distTraveled + avgSpeed / 60;
        
        return distTraveled;
    }
}