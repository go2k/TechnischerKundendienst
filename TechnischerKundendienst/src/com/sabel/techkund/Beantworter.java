package com.sabel.techkund;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

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
	private HashMap<String, String> map;

	/**
	 * Erzeuge einen Beantworter - nichts Besonderes zu tun.
	 */
	public Beantworter() {
		this.rnd = new Random();
		this.antworten = new ArrayList<>();
		standartAntwortenBefuellen();
		map = new HashMap<>();
		antwortenHashMapBefuellen();
	}

	/**
	 * Erzeuge eine Antwort.
	 * 
	 * @return Einen String, der die Antwort enthält.
	 */
	public String generiereAntwort(Set<String> eingabe) {

		for (String wort : eingabe) {
			if (wort != null) {
				return map.get(wort);
			}
		}

		return antworten.get(rnd.nextInt(antworten.size()));
	}

	public String generiereAntwort2(String eingabe) {

		String antwort = "";

		for (String wort : map.keySet()) {
			if (eingabe.toLowerCase().contains(wort.toLowerCase())) {
				antwort = map.get(wort.toLowerCase());
			}
		}

		if (antwort == null) {
			antwort = antworten.get(rnd.nextInt(antworten.size()));
		}
		return antwort;
	}

	private void antwortenHashMapBefuellen() {
		map.put("linux", "Tolles OS");
		map.put("windows", "Testen sie doch mal Linux, das könnte helfen....");
		map.put("osx", "auch ganz brauchbar...");
		map.put("absturz", "das war sicher Windows...");
		map.put("mac", "nette Geräte");
		map.put("bluescreen", "na dann viel erfolg!");
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
