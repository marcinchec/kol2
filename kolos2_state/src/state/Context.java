package state;

public class Context
{
    private State current;
    private State prev;
    public Context(State current)
    {
        this.current = current;
    }

    public void execute() throws InterruptedException
    {
        State nowy=current.execute(prev);
        prev=current;
        this.current=nowy;
        this.execute();
    }
}
