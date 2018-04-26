

import static java.lang.System.*;

public class WordFun
{
    private String word;
    private String original;
    private String newWord;
    public WordFun()
    {
        original = "wzzza a";
    }

    public WordFun(String w)
    {
        original = w;
       
    }

    public void setWord(String w)
    {
        original = w;
    }

    public void makeUpper()
    {
       word = original.toUpperCase();
       //out.println(word);
    }

    public void addHyphen()
    {
        int loc = word.indexOf(" ");
        String sub1 = "";
        String sub2 = "";
 
        sub1 = word.substring(0,loc);
        loc = loc + 1;
        sub2 = word.substring(loc);
        newWord = sub1 + "-" + sub2;
    }

  public String toString()
    {
        return (original + "\n\n" + word + "\n\n" + newWord + "\n\n");
    }
}