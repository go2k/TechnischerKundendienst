package com.sabel.techkund;
import java.util.Scanner;

/**
 * Ein Eingabeleser liest eingetippten Text von der Konsole.
 * 
 * @author     Michael Kölling und David J. Barnes
 * @version    0.1 (2008.03.30)
 */
public class Eingabeleser
{
    private Scanner scanner;

    /**
     * Erzeuge einen neuen Eingabeleser, der Text von der Konsole
     * einliest.
     */
    public Eingabeleser()
    {
        scanner = new Scanner(System.in);;
    }

    /**
     * Lies eine Zeile von der Konsole und liefere sie als String.
     *
     * @return  Eine Zeichenkette, die vom Benutzer eingetippt wurde.
     */
    public String gibEingabe() 
    {
        System.out.print("> ");   // Eingabebereitschaft anzeigen
        String eingabezeile = scanner.nextLine();

        return eingabezeile;
    }

}
