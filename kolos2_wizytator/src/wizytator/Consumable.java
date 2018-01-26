package wizytator;

public class Consumable implements Items
{
    public int price;

    public Consumable(int price)
    {
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
