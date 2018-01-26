package derek;

public class Oferta
{
    private int liczba=0;
    private String symbol="";
    private int kod_kontrahenta=0;

    public Oferta(int liczba, String symbol, int kod_kupujacego)
    {
        this.liczba = liczba;
        this.symbol = symbol;
        this.kod_kontrahenta = kod_kupujacego;
    }

    public int getLiczba()
    {
        return liczba;
    }

    public String getSymbol()
    {
        return symbol;
    }

    public int getKod_kupujacego()
    {
        return kod_kontrahenta;
    }
}
