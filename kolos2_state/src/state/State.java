package state;

public interface State
{
    State execute(State prev) throws InterruptedException;
}
