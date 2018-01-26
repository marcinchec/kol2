package state1;


public class Context
{
    private State current;
    private State prev;
    public Context()
    {
        this.current = new Start();
    }

    public void execute() throws InterruptedException
    {
        current.execute(this);
    }
    public void setState(State s)
    {
        prev=current;
        current=s;
    }
    public void setPrev(State s)
    {
        prev=s;
    }
    public State getPrev()
    {
        return prev;
    }
}
