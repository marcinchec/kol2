package mediator;

public class ALFAWalidator implements Walidator
{
    @Override
    public boolean validate(String napis)
    {
        String regex = "[A-Za-z0-9]+";
        if(napis.matches(regex))
            return true;
        else
            return false;
    }
}
