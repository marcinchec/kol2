package kompomemento;

public class Originator
{
    private String state;

    public void setState(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
    }

    public Memento saveToMemento(){
        return new Memento(state);
    }

    public void getStatefromMomento(Memento memento)
    {
        state=memento.getState();
    }
}
