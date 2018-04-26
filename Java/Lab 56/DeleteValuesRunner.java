

import java.util.Arrays;

public class DeleteValuesRunner
{
    public static void main( String args[] )
    {
        int[] two;
        int[] one = {5,0,1,5,7,10,8,5,4,3,6};
        System.out.println(Arrays.toString(one));
        System.out.println("# of 5s= " + DeleteValues.getCount (one,5));
        System.out.println(" Before removing all 5s" + Arrays.toString(one));
        two = DeleteValues.removeVals(one,5);
        System.out.println( "After removing all 5s " +Arrays.toString(two));
        System.out.println( "# of 5s = " + DeleteValues.getCount(two,5));
        
        
    }
}