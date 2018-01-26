package wizytator;

public class Main {

    public static void main(String[] args) {
        Visitor wizytator = new TaxVisitor();

        Consumable cons = new Consumable(20);
        Furniture furni = new Furniture(300);
        Items electro = new Electronics(1200);

        cons.accept(wizytator);
        furni.accept(wizytator);
        electro.accept(wizytator);
    }
}
