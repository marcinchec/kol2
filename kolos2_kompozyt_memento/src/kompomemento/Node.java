package kompomemento;

import java.util.ArrayList;
import java.util.List;

public class Node extends TreeStructure
{
   // private List<TreeStructure> nodes = new ArrayList<>();

    @Override
    public void add(TreeStructure t)
    {
        nodes.add(t);
    }

    @Override
    public List<TreeStructure> getNodes()
    {
        return super.getNodes();
    }
}
