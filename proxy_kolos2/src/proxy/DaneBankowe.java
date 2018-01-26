package proxy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class DaneBankowe
{
    private Vector<String> wszystkie_dane=new Vector<>();


    public Vector<String> pobierzDane(Config config) throws IOException
    {
        try {
            BufferedReader br = new BufferedReader(new FileReader(config.getPath_dane()));
            String linia;
            while((linia=br.readLine())!=null)
            {
                String dane=linia.substring(0, 5);
                dane+=":";
                dane+=linia.substring(5);
                wszystkie_dane.add(dane);
            }

        } catch (FileNotFoundException ex) {
            ex.getStackTrace();
        }
        return wszystkie_dane;
    }

    public Vector<String> getDane()
    {
        return wszystkie_dane;
    }
}
