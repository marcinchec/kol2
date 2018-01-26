package mediator;

public class NUMWalidator implements Walidator
{
    @Override
    public boolean validate(String napis)
    {
        String regex="[0-9]+";
        if(napis.matches(regex))
            return true;
        else
            return false;
    }
}
