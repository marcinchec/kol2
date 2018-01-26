package wizytator;

import java.util.ArrayList;
import java.util.List;

public class GabinetDyrektora implements Kompozyt_szkola
{
    private List<Kompozyt_szkola> gabinet = new ArrayList<>();
    private String name;

    public GabinetDyrektora(String name)
    {
        this.name = name;
    }

    @Override
    public void dodaj(Kompozyt_szkola el)
    {
        gabinet.add(el);
    }

    @Override
    public String accept(Wizytator wizytator)
    {
        String o=wizytator.visit_start(this)+"\n";
        for(Kompozyt_szkola sz : gabinet)
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
