import javax.swing.*;


public class Aufgabe3_1810653115
{
    public static void main(String[] args)
    {
        // Fehler bei falsche Eingabe (z.B. Zeichen oder bei leerer Eingabe)
        // Double
        String eingabe = JOptionPane.showInputDialog("Bitte Eingabe tätigen! Double");
        double alter = Double.parseDouble(eingabe);
        String newValue = String.valueOf(alter);

        /* Es können nur Zahlen eingegeben werden, auch mit Kommastellen
         ValueOf gibt den Double Wert als String aus - gibt Integer aus
         parseInt ist nur primitiver Int (nimmt Werte auf - Integer ist Klasse
        */
        JOptionPane.showMessageDialog(null, newValue);
        JOptionPane.showMessageDialog(null, alter);


        // Int
        String eingabe1 = JOptionPane.showInputDialog("Bitte Eingabe tätigen! Int");
        int eingabeint;
        eingabeint = Integer.parseInt(eingabe1);

        JOptionPane.showMessageDialog(null, eingabeint);

        // boolean
        // Immer false außer bei Eingabe true
        String eingabe2 = JOptionPane.showInputDialog("Bitte Eingabe tätigen! Boolean");
        boolean eingabebool;
        eingabebool = Boolean.parseBoolean(eingabe2);

        JOptionPane.showMessageDialog(null, eingabebool);

        // long
        String eingabe3 = JOptionPane.showInputDialog("Bitte Eingabe tätigen! Long");
        long eingabelong;
        eingabelong = Long.parseLong(eingabe3);

        JOptionPane.showMessageDialog(null, eingabelong);

        // char
        // Zeichen und Zahlen
        String eingabe4 = JOptionPane.showInputDialog("Bitte Eingabe tätigen! Char");
        char eingabechar;
        eingabechar = eingabe4.charAt(0);

        JOptionPane.showMessageDialog(null, eingabechar);

        // byte
        String eingabe5 = JOptionPane.showInputDialog("Bitte Eingabe tätigen! Byte");
        byte eingabebyte;
        eingabebyte = Byte.parseByte(eingabe5);

        JOptionPane.showMessageDialog(null, eingabebyte);

        // short
        String eingabe6 = JOptionPane.showInputDialog("Bitte Eingabe tätigen! Short");
        short eingabeshort;
        eingabeshort = Short.parseShort(eingabe6);

        JOptionPane.showMessageDialog(null, eingabeshort);

        // float
        String eingabe7 = JOptionPane.showInputDialog("Bitte Eingabe tätigen! Float");
        float eingabefloat;
        eingabefloat = Float.parseFloat(eingabe7);

        JOptionPane.showMessageDialog(null, eingabefloat);
    }
}
