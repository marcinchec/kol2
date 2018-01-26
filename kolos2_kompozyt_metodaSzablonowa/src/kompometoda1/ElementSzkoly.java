package kompometoda1;

import java.util.List;

public abstract class ElementSzkoly
{
    public abstract void add(ElementSzkoly el);
    public abstract String getName();
    public String toString(){return "how";}
    public abstract List<ElementSzkoly> getOsoby();
    public String getPozycja(){return "";}
}
