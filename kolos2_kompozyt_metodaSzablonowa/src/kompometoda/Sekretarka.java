package kompometoda;

public class Sekretarka extends ElementSzkoly
{
    private String name;

    public Sekretarka(String name)
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
