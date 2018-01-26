package wizytator;

import java.util.List;

public interface Kompozyt_szkola
{
    void dodaj(Kompozyt_szkola el);
    String accept(Wizytator wizytator);
}
