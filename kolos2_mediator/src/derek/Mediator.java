package derek;

public interface Mediator
{
    void dodaj_kontrahenta(Kontrahent kontrahent);
    void ofertaSprzedazy(String sklep, int liczba, int kod_kontrahenta);
    void ofertaKupna(String sklep, int liczba, int kod_kontrahenta);
}
