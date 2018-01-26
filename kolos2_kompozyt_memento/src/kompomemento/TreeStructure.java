package kompomemento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class TreeStructure
{
    protected List<TreeStructure> nodes=new ArrayList<>();
    protected CareTaker caretaker = new CareTaker();
    protected Originator originator = new Originator();
    public abstract void add(TreeStructure t);
    public String getKey(){return "";}
    public double getValue(){return 0;}
    public void setKey(String k){}
    public void setValue(double v){}

    public List<TreeStructure> getNodes()
    {
        return nodes;
    }

    public void zmien(String key, double value,Leaf search, TreeStructure node)
    {
        for(TreeStructure n : node.getNodes())
        {
            if(n.getKey()==search.getKey() && n.getValue()==search.getValue())
            {
                originator.setState(String.valueOf(n.getValue()));
                caretaker.add(originator.saveToMemento());
               // n.setKey(key);
                n.setValue(value);

            }
            zmien(key,value,search,n);
        }
    }

    public void cofnij(String key, TreeStructure node)
    {
        for(TreeStructure n : node.getNodes())
        {
            if(n.getKey()==key)
            {
                originator.getStatefromMomento(caretaker.getMem(caretaker.getMementos().size()-1));
                n.setValue(Double.valueOf(originator.getState()));
                System.out.println(originator.getState());
            }
            cofnij(key,n);
        }
    }
}
