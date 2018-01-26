package wizytator;

public class Main {

    public static void main(String[] args) {
	    Szkola szkola = new Szkola("Jakas Szkola");

	    GabinetDyrektora gabinet = new GabinetDyrektora("Gabinet Dyrektora");
	    gabinet.dodaj(new Dyrektor("Jan Nowak"));

	    szkola.dodaj(gabinet);

	    Klasa klasa1 = new Klasa("Klasa 4C");

	    klasa1.dodaj(new Uczen("Zenek Zenonowicz"));
	    klasa1.dodaj(new Uczen("Jan Kowalski"));
	    klasa1.dodaj(new Uczen("Wojtek Wojtkowski"));

	    szkola.dodaj(klasa1);

	    Wizytator wizyt = new XMLWizytator();
		System.out.println(szkola.accept(wizyt));
    }
}
