import javax.swing.*;

public class Aufgabe2_1810653115
{
    public static void main(String[] args)
    {
        // Eingabe der beiden Zahlen
        int eingabe1 = Integer.parseInt(JOptionPane.showInputDialog("Bitte Zahl 1 eingeben"));
        int eingabe2 = Integer.parseInt(JOptionPane.showInputDialog("Bitte Zahl 2 eingeben"));

        //ist die Zahl gleich
        if (eingabe1 == eingabe2)
        {
            System.out.println(eingabe1);
        }
        else
        {
            // Zählervariable für notwendige Schritte
            int zaehler = 0;
            while (eingabe1 != eingabe2)
            {
                //Eingabe 1 größer Eingabe2
                if (eingabe1 > eingabe2)
                {
                    zaehler++;
                    eingabe2++;
                }
                //Eingabe 2 größer Eingabe1
                else if (eingabe2 > eingabe1)
                {
                    zaehler++;
                    eingabe1++;
                }
            }
            // Ausgabe der Schritte und der Zahl
            System.out.println(eingabe1);
            System.out.println(zaehler + " Schritte waren notwendig!");
        }
    }
}
