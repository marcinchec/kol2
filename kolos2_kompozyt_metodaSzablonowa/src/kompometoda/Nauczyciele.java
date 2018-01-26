package kompometoda;

public class Nauczyciele extends ElementSzkoly
{
    private String name;

    public Nauczyciele(String name)
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
