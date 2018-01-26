package state1;

public interface State
{
    void execute(Context context) throws InterruptedException;
}
