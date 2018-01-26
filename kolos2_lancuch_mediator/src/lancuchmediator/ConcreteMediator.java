package lancuchmediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator
{
    private List<Zlecenie> colleagues;

    public ConcreteMediator()
    {
        colleagues=new ArrayList<>();
    }

    public void dodaj(Zlecenie nowe)
    {
        colleagues.add(nowe);
    }
    @Override
    public void send(String wycena, Zlecenie next)
    {
       for(Zlecenie z : colleagues)
       {
           if(z==next)
           {
               z.setMsg(wycena);
               break;
           }
       }
    }
}
