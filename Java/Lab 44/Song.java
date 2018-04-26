public class Song
{
    private String artist;
    private String title;
    private int timeSecs;
    
    
     public Song()   // Default constructor
    {
        artist = "Luis Fonsi";
        title = "Despacito";
        timeSecs = 226;
    }
    
    public Song(String a, String t, int s)
    {
        artist = a;
        title = t;
        timeSecs = s;
    }
    
    public String getArtist()
    {
        return artist;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getTimeSecs()
    {
        return timeSecs;
    }
    
    public static void play()
    {
        System.out.println("daba daba da");
    }
    
    
    
    
    
    
    
}