package wizytator;

import java.util.List;

public class Uczen implements Kompozyt_szkola
{
    private String name;

    public Uczen(String name)
    {
        this.name = name;
    }

    @Override
    public void dodaj(Kompozyt_szkola el)
    {
        //nothing will happen
    }

    @Override
    public String accept(Wizytator wizytator)
    {
        return wizytator.visit(this);
    }


    public String getName()
    {
        return name;
    }

}
