package derek;

public abstract class Kontrahent
{
    private Mediator mediator;
    private int kod_kontrahenta;

    public Kontrahent(Mediator mediator)
    {
        this.mediator = mediator;
        mediator.dodaj_kontrahenta(this);
    }

    public void ofertaSprzedazy(String sklep, int liczba)
    {
        mediator.ofertaSprzedazy(sklep,liczba,this.kod_kontrahenta);
    }

    public void ofertaKupna(String sklep, int liczba)
    {
        mediator.ofertaKupna(sklep,liczba,this.kod_kontrahenta);
    }

    public void setKod_kontrahenta(int kod_kontrahenta)
    {
        this.kod_kontrahenta = kod_kontrahenta;
    }
}
