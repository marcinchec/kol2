package state;

import java.util.Random;

public class LogingState implements State
{
    @Override
    public State execute(State state) throws InterruptedException
    {
        System.out.println("LogingState is starting");
        Thread.sleep(2000);
        Random generator=new Random();
        int value= generator.nextInt(100);
        System.out.println("LogingState ends");
        if(value%3==0)
            return new AwariaState();
        if(value%2==0)
            return new SerwisState();
        else
            return new SesjaState();
    }
}
