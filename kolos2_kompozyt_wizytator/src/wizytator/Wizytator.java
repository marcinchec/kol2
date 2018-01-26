package wizytator;

public interface Wizytator
{
    String visit_start(Szkola szkola);
    String visit_stop(Szkola szkola);
    String visit_start(GabinetDyrektora gabinet);
    String visit_stop(GabinetDyrektora gabinet);
    String visit(Dyrektor dyr);
    String visit_start(Klasa klasa);
    String visit_stop(Klasa klasa);
    String visit(Uczen uczen);
}
