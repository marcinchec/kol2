package wizytator;

public class Furniture implements Items
{
    public int price;

    public Furniture(int price)
    {
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
