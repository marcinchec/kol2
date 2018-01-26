package nullob;

public class NullWeapon implements IWeapon
{
    @Override
    public void use()
    {
        System.out.println("Huh, no weapon.");
    }
}
