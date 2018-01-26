package state;

public class Main {

    public static void main(String[] args) throws InterruptedException
    {
	    State start = new StartState();
	    Context context = new Context(start);

        context.execute();


    }
}
