package state;

import java.util.Random;

public class GraState implements State
{
    @Override
    public State execute(State state) throws InterruptedException
    {
        System.out.println("GraState is starting");
        Thread.sleep(2000);
        Random generator=new Random();
        int value= generator.nextInt(100);
        System.out.println("GraState ends");
        if(value%3==0)
            return new AwariaState();
        return new SesjaState();
    }
}
