package lancuch;

public class Main {

    public static void main(String[] args) {
        Numbers num = new Numbers(10,20,"mnozenie");
        Chain dodaj=new Dodawanie();
        Chain odejmowanie = new Odejmowanie();
        Chain mnozenie = new Mnozenie();
        Chain dzielenie = new Dzielenie();

        dodaj.setNext(odejmowanie);
        odejmowanie.setNext(mnozenie);
        mnozenie.setNext(dzielenie);

        dodaj.calculate(num);
    }
}
