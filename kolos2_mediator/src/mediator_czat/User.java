package mediator_czat;

public class User
{
    private String name;

    public User(String name)
    {
        this.name = name;

    }

    public String getName()
    {
        return name;
    }

    public void sendmsg(String msg)
    {
        Chat.sendit(this,msg);
    }
}
