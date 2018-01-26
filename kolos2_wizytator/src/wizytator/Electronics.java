package wizytator;

public class Electronics implements Items
{
    public int price;

    public Electronics(int price)
    {
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
