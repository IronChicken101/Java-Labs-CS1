

public class SlotMachine
{
    private String face1;
    private String face2;
    private String face3;
    private String face4;
    private String face5;
    private String face6;
    private boolean winner;
    
    //contructs a 3 reel, 6 icon slot machine with String descriptions of the 6 visual elements
    public SlotMachine(String one, String two, String three, String four, String five, String six)
    {
       face1 = one;
       face2 = two;
       face3 = three;
       face4 = four;
       face5 = five;
       face6 = six;
    }
    
    //simulates a pull of the slot machine handle by calling faceImage() to randomly generate
    //a resulting face for each of the 3 slot machine reels.  If the spin is a win, the method
    //returns a String that presents
    //the resulting spin results (e.g., "Spin is:  apple apple grape").
    public String spin()
    {
        String result1 = faceImage();
        String result2 = faceImage();
        String result3 = faceImage();
        if(result1.equals(result2) && result2.equals(result3) && result1.equals(result3))
           setWinner(true);
        else
            setWinner(false);
        return result1 + " " + result2 + " " + result3;
    }
    
    public void setWinner(boolean b)
    {
       winner = b;
    }
    
    public boolean getWinner()
    {
        return winner;
    }
    
    //returns a random face from the six icons passed in the constructor and saved in
    //face1 to face6.  Uses 1 + (int)(Math.random() * 6) to generate a random number between
    //1 and 6
    public String faceImage()
    {
        int x = 1 + (int)(Math.random() * 6);  //returns 1 thru 6
        if (x == 1) 
            return face1;
        if (x == 2)
            return face2;
        if (x == 3)
            return face3;
        if (x == 4)
            return face4;
        if (x == 5)
            return face5;
        if (x == 6)
            return face6;
        return "error";
    }
}
