package nullob;

public class Character
{
    private IWeapon weapon;
    private String name;

    public Character(String name)
    {
        this.name = name;
    }

    public void setWeapon(IWeapon weapon)
    {
        this.weapon = weapon;
    }

    public void attack()
    {
        weapon.use();
    }
}
