package wizytator;

import java.util.ArrayList;
import java.util.List;

public class Szkola implements Kompozyt_szkola
{
    private List<Kompozyt_szkola> szkola = new ArrayList<>();
    private String name;

    public Szkola(String name)
    {
        this.name = name;
    }


    @Override
    public void dodaj(Kompozyt_szkola el)
    {
        this.szkola.add(el);
    }

    @Override
    public String accept(Wizytator wizytator)
    {
        String o=wizytator.visit_start(this)+"\n";
        for(Kompozyt_szkola sz : szkola)
        {
            o+=sz.accept(wizytator)+"\n";
        }
        o+=wizytator.visit_stop(this);
        return o;
    }

    public List<Kompozyt_szkola> getList()
    {
        return szkola;
    }

    public String getName()
    {
        return name;
    }

}
