package kompometoda;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka extends ElementSzkoly
{
    private List<ElementSzkoly> osoby_biblioteka=new ArrayList<>();
    @Override
    public void add(ElementSzkoly el)
    {
        this.osoby_biblioteka.add(el);
    }

    @Override
    public void remove(ElementSzkoly el)
    {
        this.osoby_biblioteka.remove(el);
    }
}
