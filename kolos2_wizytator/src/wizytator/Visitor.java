package wizytator;

public interface Visitor
{
    void visit(Furniture furniture);
    void visit(Electronics electronics);
    void visit(Consumable consumable);
}
