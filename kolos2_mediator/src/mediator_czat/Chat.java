package mediator_czat;

import java.util.Date;

public class Chat
{
    public static void sendit(User user,String msg)
    {
        System.out.println(new Date().toString()+ " ["+user.getName()+"]: " + msg);
    }
}
