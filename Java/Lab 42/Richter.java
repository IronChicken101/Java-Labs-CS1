
public class Richter
{
    private double magnitude;
    private String damage;

    public Richter()
    {
        magnitude = 0;
        damage = "No Damage";
    }
    
    public Richter(int x)
    {
        magnitude = x;
        damage = "";
    }
    
    public void setMagnitude(double x) 
    {
        magnitude = x;
    }

    public String calcDamage()
    {
        if (magnitude <= 8.0 && magnitude > 7.9)
            damage = "Most structures fall";
        else if (magnitude <= 7.8 && magnitude > 6.9)
            damage = "Most buildings destroyed";
        else if (magnitude <= 6.8 && magnitude > 5.9)
            damage = "Many buildings considerably damaged; some collapse";
        else if (magnitude <= 5.8 && magnitude > 4.5 )
            damage = "Damaged to poorly constructed buildings";
        else if (magnitude <= 4.4 && magnitude > 3.4)
            damage = "Felt by many people, no destruction";
        else if (magnitude <= 3.3 && magnitude > 0)
            damage = "Generally not felt by people";
        else if (magnitude < 0)
            damage = "This number is not valid";
        return damage;
    }
}
