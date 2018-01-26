package kompometoda;

import java.util.ArrayList;
import java.util.List;

public class PokojNauczycielski extends ElementSzkoly
{
    private List<ElementSzkoly> osoby_pokoj_nauczycielski = new ArrayList<>();
    @Override
    public void add(ElementSzkoly el)
    {
        this.osoby_pokoj_nauczycielski.add(el);
    }

    @Override
    public void remove(ElementSzkoly el)
    {
        this.osoby_pokoj_nauczycielski.remove(el);
    }
}
