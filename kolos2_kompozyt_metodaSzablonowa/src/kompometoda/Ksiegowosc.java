package kompometoda;

import java.util.ArrayList;
import java.util.List;

public class Ksiegowosc extends ElementSzkoly
{
    private List<ElementSzkoly> osoby_ksiegowosc = new ArrayList<>();
    @Override
    public void add(ElementSzkoly el)
    {
        this.osoby_ksiegowosc.add(el);
    }

    @Override
    public void remove(ElementSzkoly el)
    {
        this.osoby_ksiegowosc.remove(el);
    }
}
