package proxy;

import java.io.IOException;
import java.util.Vector;

public interface IDaneBankowe
{
    Vector<String> pobierzDane(Config config) throws IOException;
}
