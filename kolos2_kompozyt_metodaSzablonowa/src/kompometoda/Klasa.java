package kompometoda;

import java.util.ArrayList;
import java.util.List;

public class Klasa extends ElementSzkoly
{
    private List<ElementSzkoly> osoby_klasa = new ArrayList<>();
    @Override
    public void add(ElementSzkoly el)
    {
        this.osoby_klasa.add(el);
    }

    @Override
    public void remove(ElementSzkoly el)
    {
        this.osoby_klasa.remove(el);
    }
}
