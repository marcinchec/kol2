package kompometoda;

public class Dyrektor extends ElementSzkoly
{
    private String name;

    public Dyrektor(String name)
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
