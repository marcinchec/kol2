package state1;

import java.util.Random;

public class SerwisState implements State
{
    @Override
    public void execute(Context context) throws InterruptedException
    {
        System.out.println("SerwisState is starting");
        Thread.sleep(2000);
        Random generator=new Random();
        int value= generator.nextInt(100);
        System.out.println("SerwisState ends");
        if(value%3==0)
            context.setState(new AwariaState());
        context.setState(new LogingState());
    }
}
