package kompomemento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker
{
    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento m)
    {
        mementos.add(m);
    }

    public Memento getMem(int index)
    {
        return mementos.get(index);
    }

    public List<Memento> getMementos()
    {
        return mementos;
    }
}
