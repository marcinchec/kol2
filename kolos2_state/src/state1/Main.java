package state1;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Context context = new Context();

        while(true)
        {
            context.execute();
        }
    }
}
