package lancuchmediator;

import java.util.Date;

public class Analiza implements Zlecenie
{
    private Mediator mediator;
    private Zlecenie next;
    private String name;
    private String msg;

    public Analiza(String name, Mediator m)
    {
        this.name = name;
        this.mediator=m;
        mediator.dodaj(this);
    }

    @Override
    public void setNext(Zlecenie zlecenie)
    {
        next=zlecenie;
    }

    @Override
    public void doIt()
    {
        Date data=new Date();
        String wycena="";
        wycena+="Autor: "+name+"\n";
        wycena+="Data: "+ data+"\n";
        wycena+="Tresc: "+this.getClass().getSimpleName()+" || jakas tresc \n\n\n";
        msg+=wycena;
        if(next!=null)
        {
            mediator.send(msg,next);
            next.doIt();
        }
        else
            System.out.println(msg);
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }
}
