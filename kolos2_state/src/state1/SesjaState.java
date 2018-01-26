package state1;

import java.util.Random;

public class SesjaState implements State
{

    @Override
    public void execute(Context context) throws InterruptedException
    {
        System.out.println("SesjaState is starting");
        Thread.sleep(2000);
        Random generator=new Random();
        int value= generator.nextInt(100);
        System.out.println("SesjaState ends");
        if(value%3==0)
            context.setState(new AwariaState());
        if(value%2==0)
            context.setState(new GraState());
        else
            context.setState(new LogingState());
    }
}
