package state;

import java.util.Random;

public class SesjaState implements State
{
    @Override
    public State execute(State state) throws InterruptedException
    {
        System.out.println("SesjaState is starting");
        Thread.sleep(2000);
        Random generator=new Random();
        int value= generator.nextInt(100);
        System.out.println("SesjaState ends");
        if(value%3==0)
            return new AwariaState();
        if(value%2==0)
            return new GraState();
        else
            return new LogingState();
    }
}
