package lancuchmediator;

public interface Mediator
{
    void send(String wycena,Zlecenie next);
    void dodaj(Zlecenie nowe);
}
