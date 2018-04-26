public class SongRunner
{
    public static void main(String[] args)
    {
        Song despacito = new Song();
        Song bella = new Song("Andrea Bocelli","La vida es bella",225);
        Song hello = new Song("Adele","Hello",255);
        Song beautiful = new Song("James Blunt","You're beautiful",210);
        
        
        System.out.println("Artists = " + despacito.getArtist() + ", " + bella.getArtist() + ", " + hello.getArtist() + ", " + beautiful.getArtist());
        
        beautiful.play();
    }
}