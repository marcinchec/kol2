package proxy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Proxy implements IDaneBankowe
{
    private DaneBankowe dane=new DaneBankowe();
    private Vector<String> wszystkie_dane=new Vector<>();

    @Override
    public Vector<String> pobierzDane(Config config) throws IOException {
        boolean znaleziono=false;
        try {
            BufferedReader br = new BufferedReader(new FileReader(config.getPath_uprawnienia()));
            String linia;
            while((linia=br.readLine())!=null)
            {
                if(linia.equals(config.getLogin()))
                {
                    znaleziono=true;
                }

            }

        } catch (FileNotFoundException ex) {
            ex.getStackTrace();
        }

        if(znaleziono)
        {
            return dane.pobierzDane(config);
        }
        else
        {
            wszystkie_dane.add("brak uprawnień dostepu");
        }
        return wszystkie_dane;
    }
}
