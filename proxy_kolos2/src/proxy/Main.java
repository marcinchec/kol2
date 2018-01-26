package proxy;

import java.io.IOException;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector<String> dane=new Vector<>();
        Config conf = new Config("testlgin");
        Proxy prox = new Proxy();
        try
        {
            dane = prox.pobierzDane(conf);
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        for(String d : dane)
        {
            System.out.println(d);
        }
    }
}
