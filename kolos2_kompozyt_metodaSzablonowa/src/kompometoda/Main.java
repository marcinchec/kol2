package kompometoda;

public class Main {

    public static void main(String[] args) {
	    Szkola szkola=new Szkola();

	    ElementSzkoly gabinet_dyrektora = new GabinetDyrektora();
	    ElementSzkoly dyrektor = new Dyrektor("John Doe");
        gabinet_dyrektora.add(dyrektor);
        szkola.add(gabinet_dyrektora);

        ElementSzkoly sekretariat = new Sekretariat();
        ElementSzkoly sekretarka = new Sekretarka("Magda Nowak");
        sekretariat.add(sekretarka);
        szkola.add(sekretariat);

        ElementSzkoly ksiegowosc = new Ksiegowosc();
        ElementSzkoly ksiegowa = new Ksiegowa("Edyta Nowak");
        ksiegowosc.add(ksiegowa);
        szkola.add(ksiegowosc);

        ElementSzkoly biblioteka = new Biblioteka();
        ElementSzkoly bibliotekarka1=new Bibliotekarka("Janina Kowalska");
        ElementSzkoly bibliotekarka2=new Bibliotekarka("Marta Kowalska");
        biblioteka.add(bibliotekarka1);
        biblioteka.add(bibliotekarka2);
        szkola.add(biblioteka);

        ElementSzkoly sala = new SalaGimnastyczna();
        szkola.add(sala);

        ElementSzkoly pokoj_nauczycielski = new PokojNauczycielski();
        ElementSzkoly nauczycielka1 = new Nauczyciele("Janusz Niewiadomski");
        ElementSzkoly nauczycielka2 = new Nauczyciele("Marian Kowalski");
        ElementSzkoly nauczycielka3 = new Nauczyciele("Grazyna Zarko");
        pokoj_nauczycielski.add(nauczycielka1);
        pokoj_nauczycielski.add(nauczycielka2);
        pokoj_nauczycielski.add(nauczycielka3);
        szkola.add(pokoj_nauczycielski);

        ElementSzkoly klasa = new Klasa();
        ElementSzkoly uczen1=new Uczniowie("Jolanta Miodek");
        ElementSzkoly uczen2= new Uczniowie("Alicja Kot");
        ElementSzkoly uczen3=new Uczniowie("Michal Kloszard");
        klasa.add(uczen1);
        klasa.add(uczen2);
        klasa.add(uczen3);
        szkola.add(klasa);

        for(ElementSzkoly e : szkola.osoby_szkola)
        {
            System.out.println(e);
        }
    }
}
