package wizytator;

import java.util.List;

public class Dyrektor implements Kompozyt_szkola
{
    private String name;

    public Dyrektor(String name)
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
