package com.sabel.techkund;

import java.util.ArrayList;
import java.util.Random;

/**
 * Die Klasse Beantworter beschreibt Exemplare, die automatische Antworten
 * generieren.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 0.1 (2008.03.30)
 */

public class Beantworter {

	private ArrayList<String> antworten;
	private Random rnd;

	/**
	 * Erzeuge einen Beantworter - nichts Besonderes zu tun.
	 */
	public Beantworter() {
		this.rnd = new Random();
		this.antworten = new ArrayList<>();
		standartAntwortenBefuellen();

	}

	/**
	 * Erzeuge eine Antwort.
	 * 
	 * @return Einen String, der die Antwort enthält.
	 */
	public String generiereAntwort() {
		return antworten.get(rnd.nextInt(antworten.size()));
	}

	private void standartAntwortenBefuellen() {
		antwortHinzufuegen("Das klingt interessant. Erzählen Sie mehr...");
		antwortHinzufuegen("naja...");
		antwortHinzufuegen("rtfm...");
		antwortHinzufuegen("doll...");
		antwortHinzufuegen("schön...");
		antwortHinzufuegen("lol...");
		antwortHinzufuegen("pff...");
	}
	
	private void antwortHinzufuegen(String antwort) {
		antworten.add(antwort);
	}
}
