package lancuchmediator;

import java.util.Date;

public class Wycena implements Zlecenie
{
    private Mediator mediator;
    private Zlecenie next;
    private String name;
    private String msg;

    public Wycena(String name,Mediator m)
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
        //System.out.println(wycena);
        if(next!=null)
        {
            mediator.send(wycena,next);
            next.doIt();
        }
        else
            System.out.println(wycena);
    }

    @Override
    public void setMsg(String msg)
    {
        this.msg=msg;
    }
}
