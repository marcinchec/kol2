package nullob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        Character ktos = new Character("Wariat");
        IWeapon weapon=new NullWeapon();
        System.out.println("Choose weapon: 1-sword, 2-axe");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String choosedWeapon= null;
        try
        {
            choosedWeapon = br.readLine();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        switch(choosedWeapon)
        {
            case "1":
                weapon=new Sword();
                break;
            case "2":
                weapon=new Axe();
                break;
        }

        ktos.setWeapon(weapon);
        ktos.attack();
    }
}
