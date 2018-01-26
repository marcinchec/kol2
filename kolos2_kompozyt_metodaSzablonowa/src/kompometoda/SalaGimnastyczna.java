package kompometoda;

import java.util.ArrayList;
import java.util.List;

public class SalaGimnastyczna extends ElementSzkoly
{
    private List<ElementSzkoly> osoby_sala = new ArrayList<>();
    @Override
    public void add(ElementSzkoly el)
    {
        this.osoby_sala.add(el);
    }

    @Override
    public void remove(ElementSzkoly el)
    {
        this.osoby_sala.remove(el);
    }
}
