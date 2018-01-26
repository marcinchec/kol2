package kompometoda;


import java.util.ArrayList;
import java.util.List;

public class Szkola
{
    public List<ElementSzkoly> osoby_szkola=new ArrayList<>();


    public void add(ElementSzkoly el)
    {
        this.osoby_szkola.add(el);
    }


    public void remove(ElementSzkoly el)
    {
        this.osoby_szkola.remove(el);
    }

    public List<ElementSzkoly> getOsoby_szkola()
    {
        return osoby_szkola;
    }
}
