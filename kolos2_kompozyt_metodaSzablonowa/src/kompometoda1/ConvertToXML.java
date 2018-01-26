package kompometoda1;

public class ConvertToXML extends Convert
{
    @Override
    public String dodajznacznikotwarcia()
    {
        return "<";
    }

    @Override
    public String dodajznacznikzamkniecianorm()
    {
        return ">";
    }

    @Override
    public String dodajznacznikzamknieciaspec()
    {
        return ">";
    }

    public boolean isxml()
    {
        return true;
    }
}
