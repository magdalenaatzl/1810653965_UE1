package fhkufstein;

public class Aufgabe5_1810653965 {
    public static void main(String[]args)
    {
        int zahl1 = 10;
        int zahl2 = 5;

        System.out.println(zahl1++);
        System.out.println(zahl2++);
        System.out.println(zahl1);
        System.out.println(zahl2);
        System.out.println(++zahl1);
        System.out.println(++zahl2);
        System.out.println(zahl1);
        System.out.println(zahl2);

        /*
        Inkremente erhöhen den Wert um 1 (Dekremente verringern den Wert um 1)

        Postfix: zahl++ --> Variable wird erst nach dem Zugriff inkrementiert
        Deshalb werden in Zeile 9 und 10 zunächst noch die Originalwerte ausgegeben
        wenn man aber die Zahlen wieder ausgibt (Zeile 11 und 12) werden sie um eins erhöht.

        Präfix: ++zahl --> Variable wird bereits vor dem Zugriff inkrementiert
        Deshalb werden die Zahlen in Zeile 13 und 14  bereits hier um eins erhöht.
         */
    }
}
