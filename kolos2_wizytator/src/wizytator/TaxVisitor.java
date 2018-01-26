package wizytator;

public class TaxVisitor implements Visitor
{
    @Override
    public void visit(Furniture furniture)
    {
        System.out.println(furniture.price*1.20);
    }

    @Override
    public void visit(Electronics electronics)
    {
        System.out.println(electronics.price*1.1);
    }

    @Override
    public void visit(Consumable consumable)
    {
        System.out.println(consumable.price*1.2);
    }
}
