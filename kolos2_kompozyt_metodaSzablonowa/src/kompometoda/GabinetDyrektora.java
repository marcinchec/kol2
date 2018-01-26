package kompometoda;

import java.util.ArrayList;
import java.util.List;

public class GabinetDyrektora extends ElementSzkoly
{
    private List<ElementSzkoly> osoby_gabinet_dyrektora= new ArrayList<>();
    @Override
    public void add(ElementSzkoly el)
    {
        this.osoby_gabinet_dyrektora.add(el);
    }

    @Override
    public void remove(ElementSzkoly el)
    {
        this.osoby_gabinet_dyrektora.add(el);
    }
}
