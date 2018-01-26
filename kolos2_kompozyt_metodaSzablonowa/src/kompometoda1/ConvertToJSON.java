package kompometoda1;

public class ConvertToJSON extends Convert
{
    @Override
    public String dodajznacznikotwarcia()
    {
        return "{";
    }

    @Override
    public String dodajznacznikzamkniecianorm()
    {
        return "}";
    }

    @Override
    public String dodajznacznikzamknieciaspec()
    {
        return "{:";
    }


    public boolean isjson()
    {
        return true;
    }
}
