package derek;

public class Main
{
    public static void main(String[] args)
    {
        MediatorSklepu mediator = new MediatorSklepu();

        Tadzio tadek = new Tadzio(mediator);

        Zenek zenus = new Zenek(mediator);

        tadek.ofertaSprzedazy("Ogorki",100);
        tadek.ofertaSprzedazy("Pomidory",100);
        tadek.ofertaKupna("Jablka",20);

        zenus.ofertaKupna("Ogorki",100);
        zenus.ofertaSprzedazy("Jablka",20);

        mediator.poka_magazyn();
    }
}
