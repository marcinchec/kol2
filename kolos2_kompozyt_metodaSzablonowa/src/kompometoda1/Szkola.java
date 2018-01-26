package kompometoda1;

import java.util.ArrayList;
import java.util.List;

public class Szkola
{
    public List<ElementSzkoly> zawartosc = new ArrayList<>();

    public void dodaj(ElementSzkoly e)
    {
        this.zawartosc.add(e);
    }

}
