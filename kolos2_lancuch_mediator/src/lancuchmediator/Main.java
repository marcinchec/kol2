package lancuchmediator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			while (true)
			{
				String czytaj = br.readLine();
				dokumentacja(Integer.valueOf(czytaj));
			}
		} catch (IOException e)
		{
			e.printStackTrace();
		}
    }

    public static void dokumentacja(int val)
	{
		Mediator mediator=new ConcreteMediator();
		Zlecenie wycena = new Wycena("Jan jan",mediator);
		Zlecenie analiza = new Analiza("Wielki Analityk 15lat doswiadczenia",mediator);
		Zlecenie oprogramowanie = new Oprogramowanie("Robie se programa ziomek",mediator);
		Zlecenie front = new Frontend("Jestem frontend",mediator);
		switch (val)
		{
			case 1:
				wycena.doIt();
				break;
			case 2:
				wycena.setNext(analiza);
				wycena.doIt();
				break;
			case 3:
				wycena.setNext(analiza);
				analiza.setNext(oprogramowanie);
				wycena.doIt();
				break;
			case 4:
				wycena.setNext(analiza);
				analiza.setNext(oprogramowanie);
				oprogramowanie.setNext(front);
				wycena.doIt();
				break;
		}
	}
}
