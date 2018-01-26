package lancuch;

public class Dodawanie implements Chain
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
        if(request.getType()=="dodawanie")
        {
            System.out.println("dodawanie "+request.getA()+ " "+request.getB());
            System.out.println(request.getA()+request.getB());
        }
        else
        {
            this.nextChain.calculate(request);
        }
    }
}
