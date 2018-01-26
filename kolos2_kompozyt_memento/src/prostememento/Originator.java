package prostememento;

public class Originator
{
    private String state;

    public Memento saveToMemento()
    {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento m)
    {
        state=m.getState();
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }
}
