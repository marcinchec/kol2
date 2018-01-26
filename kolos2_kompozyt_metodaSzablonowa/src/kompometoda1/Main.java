package kompometoda1;

public class Main
{
    public static void main(String[] args)
    {
        Szkola szkola = new Szkola();

        ElementSzkoly gabinetdyrektora = new MiejscaSzkoly("gabinet dyrektora");
        gabinetdyrektora.add(new Osoby("John Doe","dyrektor"));
        szkola.dodaj(gabinetdyrektora);

        ElementSzkoly sekretariat=new MiejscaSzkoly("sekretariat");
        sekretariat.add(new Osoby("Magda Nowak","sekretarka"));
        szkola.dodaj(sekretariat);

        ElementSzkoly ksiegowosc = new MiejscaSzkoly("ksiegowosc");
        ksiegowosc.add(new Osoby("Edyta Nowak","ksiegowa"));
        szkola.dodaj(ksiegowosc);

        ElementSzkoly biblioteka = new MiejscaSzkoly("biblioteka");
        biblioteka.add(new Osoby("Janina Kowalska","bibliotekarka1"));
        biblioteka.add(new Osoby("Monika Kowalska","bibliotekarka2"));
        szkola.dodaj(biblioteka);

        ElementSzkoly sala=new MiejscaSzkoly("sala gimnastyczna");
        szkola.dodaj(sala);

        ElementSzkoly pokojNauczycielski = new MiejscaSzkoly("pokoj nauczycielski");
        pokojNauczycielski.add(new Osoby("Janusz Niewiadomski","nauczyciel1"));
        pokojNauczycielski.add(new Osoby("Marian Kowalski","nauczyciel2"));
        pokojNauczycielski.add(new Osoby("Grazyna Zarko","nauczyciel3"));
        szkola.dodaj(pokojNauczycielski);

        ElementSzkoly klasa = new MiejscaSzkoly("klasa1");
        klasa.add(new Osoby("Jolanta Miodek","uczen1"));
        klasa.add(new Osoby("Alicja Kot","uczen2"));
        klasa.add(new Osoby("Michal Kloszard","uczen3"));
        szkola.dodaj(klasa);

        for(ElementSzkoly e : szkola.zawartosc)
        {
            System.out.println(e);
        }
        Convert convert = new ConvertToJSON();

        System.out.println( convert.konwertuj(szkola));

        convert=new ConvertToXML();
        System.out.println(convert.konwertuj(szkola));
    }
}
