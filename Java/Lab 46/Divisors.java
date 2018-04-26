

public class Divisors
{
    private int num;
    public Divisors (int n)
    {
      num = n;
    }
    public String findDivisors(int numb)
    {
        String num = new String();
        System.out.print(numb + " has divisors ");
         int i=1;
        while(i <numb)
        {
            long check=numb%i;
            //System.out.println(check);
            if(check==0)
            {
                num = Integer.toString(numb);
                System.out.print(i+" ");
            }
           i ++;
        }
        
        return num;
    }
    
    public String toString()
    {
        return findDivisors(num);
    }
}