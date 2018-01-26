package state1;

import java.util.Random;

public class LogingState implements State
{
    @Override
    public void execute(Context context) throws InterruptedException
    {
        System.out.println("LogingState is starting");
        Thread.sleep(2000);
        Random generator=new Random();
        int value= generator.nextInt(100);
        System.out.println("LogingState ends");
        if(value%3==0)
            context.setState(new AwariaState());
        if(value%2==0)
            context.setState(new SerwisState());
        else
            context.setState(new SesjaState());
    }
}
