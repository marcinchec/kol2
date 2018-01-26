package state1;

public class AwariaState implements State
{
    @Override
    public void execute(Context context) throws InterruptedException
    {
        System.out.println("Awaria");
        Thread.sleep(2000);
        context.setState(context.getPrev());
    }
}
