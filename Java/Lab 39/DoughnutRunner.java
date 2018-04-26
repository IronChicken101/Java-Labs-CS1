
public class DoughnutRunner
{
    public static void main (String[] args)
    {
        Doughnut glazed = new Doughnut();
        Doughnut chocolate = new Doughnut("chocolate",26,true);
        System.out.println("doughnut1: " + chocolate.getFlavor());
        glazed.eatDoughnut();
        System.out.println("doughnut2: " + glazed.getFlavor());
        chocolate.eatDoughnut();
    }
}
