package com.sabel.techkund;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

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
        scanner = new Scanner(System.in);
    }

    /**
     * Lies eine Zeile von der Konsole und liefere sie als String.
     *
     * @return  Eine Zeichenkette, die vom Benutzer eingetippt wurde.
     */
    public String gibEingabe2() 
    {
        System.out.print("> ");   // Eingabebereitschaft anzeigen
        String eingabezeile = scanner.nextLine();

        return eingabezeile;
    }

    public Set<String> gibEingabe() 
    {
        System.out.print("> ");   // Eingabebereitschaft anzeigen
        String eingabezeile = scanner.nextLine();
        String[] teile = eingabezeile.split("[ ,.!?;:-]");

        HashSet<String> woerter = new HashSet<>();
         for (String wort : teile) {
			if (wort.length() > 0) {
				woerter.add(wort);
			}
		}        
        return woerter;
    }
    
    

    
}
