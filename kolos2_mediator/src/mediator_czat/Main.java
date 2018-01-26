package mediator_czat;

public class Main
{
    public static void main(String[] args)
    {
        User u1=new User("Janusz");
        User u2 = new User("Zenon");
        User u3 = new User("Tadek");

        u1.sendmsg("Hello Zenon");
    }
}
