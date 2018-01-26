package wizytator;

public class XMLWizytator implements Wizytator
{
    @Override
    public String visit_start(Szkola szkola)
    {
        String val="";
        val+="<"+szkola.getClass().getSimpleName()+">";
        return val;
    }

    @Override
    public String visit_stop(Szkola szkola)
    {
        String val="";
        val+="</"+szkola.getClass().getSimpleName()+">";
        return val;
    }

    @Override
    public String visit_start(GabinetDyrektora gabinet)
    {
        String val="";
        val+="\t<"+gabinet.getClass().getSimpleName()+">";
        return val;
    }

    @Override
    public String visit_stop(GabinetDyrektora gabinet)
    {
        String val="";
        val+="\t</"+gabinet.getClass().getSimpleName()+">";
        return val;
    }

    @Override
    public String visit(Dyrektor dyr)
    {
        String data="";
        data+="\t\t<Dyrektor>"+dyr.getName()+"</Dyrektor>";
        return data;
    }

    @Override
    public String visit_start(Klasa klasa)
    {
        String val="";
        val+="\t<"+klasa.getClass().getSimpleName()+">";
        return val;
    }

    @Override
    public String visit_stop(Klasa klasa)
    {
        String val="";
        val+="\t</"+klasa.getClass().getSimpleName()+">";
        return val;
    }

    @Override
    public String visit(Uczen uczen)
    {
        String data="";
        data+="\t\t<Uczen>"+uczen.getName()+"</Uczen>";
        return data;
    }
}
