package lancuchmediator;

public interface Zlecenie
{
    void setNext(Zlecenie zlecenie);
    void doIt();
    void setMsg(String msg);
}
