package kompometoda;

import java.util.ArrayList;
import java.util.List;

public class Sekretariat extends ElementSzkoly
{
    private List<ElementSzkoly> osoby_sekretariat=new ArrayList<>();
    @Override
    public void add(ElementSzkoly el)
    {
        this.osoby_sekretariat.add(el);
    }

    @Override
    public void remove(ElementSzkoly el)
    {
        this.osoby_sekretariat.remove(el);
    }
}
