package kompometoda1;

import java.util.List;

public class Osoby extends ElementSzkoly
{
    private String name;
    private String pozycja;
    public Osoby(String name,String pozycja)
    {
        this.name = name;
        this.pozycja = pozycja;
    }

    @Override
    public void add(ElementSzkoly el)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public List<ElementSzkoly> getOsoby()
    {
        return null;
    }

    public String getPozycja()
    {
        return pozycja;
    }
}
