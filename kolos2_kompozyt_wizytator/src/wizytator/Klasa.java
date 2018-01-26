package wizytator;

import java.util.ArrayList;
import java.util.List;

public class Klasa implements Kompozyt_szkola
{
    private List<Kompozyt_szkola> uczniowie = new ArrayList<>();
    private String name;

    public Klasa(String name)
    {
        this.name = name;
    }

    @Override
    public void dodaj(Kompozyt_szkola el)
    {
        uczniowie.add(el);
    }

    @Override
    public String accept(Wizytator wizytator)
    {
        String o=wizytator.visit_start(this)+"\n";
        for(Kompozyt_szkola sz : uczniowie)
        {
            o+=sz.accept(wizytator)+"\n";
        }
        o+=wizytator.visit_stop(this);
        return o;
    }

    public String getName()
    {
        return name;
    }
}
