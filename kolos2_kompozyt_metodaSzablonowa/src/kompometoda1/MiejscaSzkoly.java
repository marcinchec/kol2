package kompometoda1;

import java.util.ArrayList;
import java.util.List;

public class MiejscaSzkoly extends ElementSzkoly
{
    private String name;

    public MiejscaSzkoly(String name)
    {
        this.name = name;
    }

    private List<ElementSzkoly> osoby = new ArrayList<>();

    @Override
    public void add(ElementSzkoly el)
    {
        this.osoby.add(el);
    }

    @Override
    public String getName()
    {
        return name;
    }


    public String toString()
    {
        String output=name+": \n";

        for(ElementSzkoly e : osoby)
            output+=e.getName()+", ";
        output+="\n";
        return output;
    }

    public List<ElementSzkoly> getOsoby()
    {
        return osoby;
    }

   /* @Override
    public String getPozycja()
    {
        return "miejsca";
    }*/
}
