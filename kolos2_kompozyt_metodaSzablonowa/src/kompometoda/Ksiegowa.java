package kompometoda;

public class Ksiegowa extends ElementSzkoly
{
    private String name;

    public Ksiegowa(String name)
    {
        this.name = name;
    }

    @Override
    public void add(ElementSzkoly el)
    {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(ElementSzkoly el)
    {
        throw new UnsupportedOperationException();
    }
}
