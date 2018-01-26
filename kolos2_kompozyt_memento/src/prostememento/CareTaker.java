package prostememento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker
{
    private List<Memento> lista_memento = new ArrayList<>();

    public void add(Memento m )
    {
        lista_memento.add(m);
    }

    public Memento getMemento(int index)
    {
        return lista_memento.get(index);
    }
}
