package prostememento;

public class Main
{
    public static void main(String[]args)
    {
        Originator origin = new Originator();
        CareTaker caretaker = new CareTaker();

        origin.setState("jeden");
        origin.setState("dwa");
        caretaker.add(origin.saveToMemento());
        origin.setState("trzy");
        origin.setState("cztery");
        caretaker.add(origin.saveToMemento());
        origin.getStateFromMemento(caretaker.getMemento(0));
        System.out.println(origin.getState());
        origin.getStateFromMemento(caretaker.getMemento(1));
        System.out.println(origin.getState());
    }
}
