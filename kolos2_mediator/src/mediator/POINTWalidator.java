package mediator;

public class POINTWalidator implements Walidator
{
    @Override
    public boolean validate(String napis)
    {
        String regex ="^-[A-Za-z]+";
        if(napis.matches(regex))
            return true;
        else
            return false;
    }
}
