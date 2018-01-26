package kompometoda1;

public abstract class Convert
{
    public final String konwertuj(Szkola szkola)
    {
        String output="";
        output+=dodajznacznikotwarcia();
        output+="szkola";
        output+=dodajznacznikzamknieciaspec();

        for(ElementSzkoly e : szkola.zawartosc)
        {
            output+="\n"+"\t";
            output+=dodajznacznikotwarcia();
            output+=e.getName();
            output+=dodajznacznikzamknieciaspec();

            for(ElementSzkoly e1 : e.getOsoby())
            {
                output+="\n"+"\t"+"\t";
                output+=dodajznacznikotwarcia();
                output+=e1.getPozycja();
                output+=dodajznacznikzamkniecianorm();
                output+=e1.getName();
                if(isxml())
                {
                    output += dodajznacznikotwarcia();
                    output += "/" + e1.getPozycja();
                }
                output+=dodajznacznikzamkniecianorm();

            }
            output+="\n"+"\t";
            if(isxml())
            {
                output += dodajznacznikotwarcia();
                output += "/" + e.getName();
            }
            output+=dodajznacznikzamkniecianorm();
        }



        output+="\n";
        if(isxml())
        {
            output += dodajznacznikotwarcia();
            output += "/szkola";
        }
        output+=dodajznacznikzamkniecianorm();

        return output;
    }

    public abstract String dodajznacznikotwarcia();
    public abstract String dodajznacznikzamkniecianorm();
    public abstract String dodajznacznikzamknieciaspec();

    public boolean isxml(){return false;}
    public boolean isjson() {return false;}
}
