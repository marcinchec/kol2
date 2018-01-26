package kompomemento;

public class Leaf extends TreeStructure
{
    private String key;
    private double value;

    public Leaf(String key, double value)
    {
        this.key = key;
        this.value = value;
    }

    @Override
    public void add(TreeStructure t)
    {
        throw new UnsupportedOperationException();
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    public String getKey()
    {
        return key;
    }

    public double getValue()
    {
        return value;
    }
}
