package derek;

import java.util.ArrayList;
import java.util.List;

public class MediatorSklepu implements Mediator
{
    private List<Kontrahent> kontrahenci;
    private List<Oferta> ofertyKupna;
    private List<Oferta> ofertySprzedazy;
    private int kod_kontrahenta=0;

    public MediatorSklepu()
    {
        kontrahenci=new ArrayList<>();
        ofertyKupna=new ArrayList<>();
        ofertySprzedazy = new ArrayList<>();
    }

    @Override
    public void dodaj_kontrahenta(Kontrahent kontrahent)
    {
        kontrahenci.add(kontrahent);
        kod_kontrahenta++;
        kontrahent.setKod_kontrahenta(kod_kontrahenta);
    }

    @Override
    public void ofertaSprzedazy(String sklep, int liczba, int kod_kontrahenta)
    {
        boolean isSold = false;

        for(Oferta o : ofertyKupna)
        {
            if(o.getSymbol()==sklep && o.getLiczba()==liczba)
            {
                System.out.println(liczba +" : "+ sklep+" sprzedal "+o.getKod_kupujacego());
                ofertyKupna.remove(o);
                isSold=true;
            }
            if(isSold)
                break;
        }
        if(!isSold)
        {
            System.out.println("dodano: "+liczba+" "+sklep);
            Oferta nowa = new Oferta(liczba,sklep,kod_kontrahenta);
            ofertySprzedazy.add(nowa);
        }
    }

    @Override
    public void ofertaKupna(String sklep, int liczba, int kod_kontrahenta)
    {
        boolean isBought = false;

        for(Oferta o : ofertySprzedazy)
        {
            if(o.getSymbol()==sklep && o.getLiczba()==liczba)
            {
                System.out.println(liczba +" : "+ sklep+" kupil "+o.getKod_kupujacego());
                ofertySprzedazy.remove(o);
                isBought=true;
            }
            if(isBought)
                break;
        }
        if(!isBought)
        {
            System.out.println("dodano: "+liczba+" "+sklep);
            Oferta nowa = new Oferta(liczba,sklep,kod_kontrahenta);
            ofertyKupna.add(nowa);
        }
    }

    public void poka_magazyn()
    {
        System.out.println("Do sprzedania");
        for(Oferta o : ofertySprzedazy)
        {
            System.out.println(o.getLiczba()+" : "+o.getSymbol());
        }

        System.out.println("Do kupienia");
        for(Oferta o : ofertyKupna)
        {
            System.out.println(o.getLiczba()+" : "+o.getSymbol());
        }
    }
}
