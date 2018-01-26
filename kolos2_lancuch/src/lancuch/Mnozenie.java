package lancuch;

public class Mnozenie implements Chain
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
        if(request.getType()=="mnozenie")
        {
            System.out.println("mnozenie "+request.getA()+ " "+request.getB());
            System.out.println(request.getA()*request.getB());
        }
        else
        {
            this.nextChain.calculate(request);
        }
    }
}
