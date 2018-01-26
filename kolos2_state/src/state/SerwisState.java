package state;

import java.util.Random;

public class SerwisState implements State
{
    @Override
    public State execute(State state) throws InterruptedException
    {
        System.out.println("SerwisState is starting");
        Thread.sleep(2000);
        Random generator=new Random();
        int value= generator.nextInt(100);
        System.out.println("SerwisState ends");
        if(value%3==0)
            return new AwariaState();
        return new LogingState();
    }
}
