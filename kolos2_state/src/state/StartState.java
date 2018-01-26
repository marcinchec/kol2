package state;

import java.util.Random;

public class StartState implements State
{
    @Override
    public State execute(State state) throws InterruptedException
    {
        System.out.println("StartState is starting");
        Thread.sleep(2000);
        Random generator=new Random();
        int value= generator.nextInt(100);
        System.out.println("StartState ends");
        System.out.println(value);
        if(value%3==0)
            return new AwariaState();
        return new LogingState();
    }
}
