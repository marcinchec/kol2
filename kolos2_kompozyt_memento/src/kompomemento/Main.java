package kompomemento;


import jdk.nashorn.api.tree.Tree;

public class Main {

    public static void main(String[] args) {
        TreeStructure root = new Node();

        TreeStructure n1=new Node();
        n1.add(new Leaf("A",13.5));
        n1.add(new Leaf("B",-12.3));
        root.add(n1);

        TreeStructure n2 = new Node();
        n2.add(new Leaf("C",22.7));
        root.add(n2);

        root.add(new Leaf("D",35.7));

        traverse(root);
        Leaf searched = new Leaf("C",22.7);
        root.zmien("C",20.3,searched,root);
        searched = new Leaf("C",20.3);
        root.zmien("C",212.3,searched,root);
        searched=new Leaf("D",35.7);
        root.zmien("D",300.0,searched,root);
        traverse(root);

        root.cofnij("C",root);
        root.cofnij("C",root);
        root.cofnij("D",root);

        traverse(root);
    }

    public static void traverse(TreeStructure node)
    {
        for(TreeStructure n : node.getNodes())
        {
                System.out.println(n.getKey()+" "+n.getValue());

            traverse(n);
        }
    }
}
