package state1;

import java.util.Random;

public class Start implements State
{

    @Override
    public void execute(Context context) throws InterruptedException
    {
        System.out.println("StartState is starting");
        Thread.sleep(2000);
        Random generator=new Random();
        int value= generator.nextInt(100);
        System.out.println("StartState ends");
        System.out.println(value);
        if(value%3==0)
            context.setState(new AwariaState());
        context.setState(new LogingState());
    }
}
