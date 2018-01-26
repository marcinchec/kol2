package lancuch;

public class Dzielenie implements Chain
{
    private Chain nextChain;
    @Override
    public void setNext(Chain c)
    {
        nextChain=c;
    }

    @Override
    public void calculate(Numbers request)
    {
        if(request.getType()=="dzielenie")
        {
            System.out.println("dzielenie "+request.getA()+ " "+request.getB());
            System.out.println(request.getA()/request.getB());
        }
        else
        {
            System.out.println("operacja spoza listy dozwolonych!!");
        }
    }
}
