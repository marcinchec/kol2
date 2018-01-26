package kompometoda;

public class Uczniowie extends ElementSzkoly
{
    private String name;

    public Uczniowie(String name)
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
