package state;

public class AwariaState implements State
{
    @Override
    public State execute(State state) throws InterruptedException
    {
        Thread.sleep(2000);
        System.out.println("Awaria");
        return state;
    }
}
