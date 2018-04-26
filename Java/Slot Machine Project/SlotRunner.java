

public class SlotRunner
{
    public static void main(String[] args)
    {
        SlotMachine test = new SlotMachine("grape", "cherry", "banana", "orange", "seven", "apple");
        int count = 1;           
        //to be used in Part A
        while ( !test.getWinner() )
        {
            System.out.println("Spin " + count + ": " + test.spin());
            if(test.getWinner() == true)
                System.out.println("you won");
            else
                System.out.println("you lose");
            count++;
        }    
        System.out.println();
    
    //you will add code for Part B
        test = new SlotMachine("grape", "cherry", "banana", "orange", "seven", "apple");
        trials(test, 1);
        
        test = new SlotMachine("grape", "cherry", "banana", "orange", "seven", "apple");
        trials(test, 5);
        
        test = new SlotMachine("grape", "cherry", "banana", "orange", "seven", "apple");
        trials(test, 10);
        
        test = new SlotMachine("grape", "cherry", "banana", "orange", "seven", "apple");
        trials(test, 100);
        
        test = new SlotMachine("grape", "cherry", "banana", "orange", "seven", "apple");
        trials(test, 1000);
        
        test = new SlotMachine("grape", "cherry", "banana", "orange", "seven", "apple");
        trials(test, 5000);
    }
    
    //to be used in Part B  
    public static void trials(SlotMachine test, int num)
    {
        int count = 0;
        double average = 0.0;
        for(int x = 0; x < num; x++) {
            while ( !test.getWinner() ){
            test.spin();
            count++;
        }   
    }   
        average = (double)count/num;
        System.out.println("avg for " + num + " trials is: " + average); 
}
}
