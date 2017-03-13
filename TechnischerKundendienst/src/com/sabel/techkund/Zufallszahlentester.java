package com.sabel.techkund;

import java.util.ArrayList;
import java.util.Random;

public class Zufallszahlentester {

	private Random rnd;
	private ArrayList<String> antworten;

	public Zufallszahlentester() {
		rnd = new Random();
		
		antworten= new ArrayList<>();
		
		antwortHinzufuegen("Ja");
		antwortHinzufuegen("Nein");
		antwortHinzufuegen("Vielleicht");
		
	}
	
	public void antwortHinzufuegen(String antwort) {
		antworten.add(antwort);		
	}
	
	public static void main(String[] args) {

		Zufallszahlentester zt = new Zufallszahlentester();
		zt.eineZufallszahlAusgeben();
		zt.zufallszahlenAusgeben(4);
		System.out.println("########################################################");
		for (int i = 0; i < 3; i++) {
			System.out.println(zt.gibAntwort1());
		}
		System.out.println("########################################################");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(zt.gibAntwort2());
		}
		
		System.out.println("########################################################");
		for (int i = 0; i < 3; i++) {
			System.out.println(zt.gibAntwort3());
		}
		System.out.println("########################################################");
	}

	public void eineZufallszahlAusgeben() {

		System.out.println(rnd.nextInt(100));

	}

	public void zufallszahlenAusgeben(int anzahl) {

		for (int i = 0; i < anzahl; i++) {
			eineZufallszahlAusgeben();
		}
	}

	public String gibAntwort1() {

		int i = rnd.nextInt(3);

		switch (i) {
		case 0:
			return "ja";
		case 1:
			return "nein";
		case 2:
			return "vielleicht";
		default:
			return null;
		}
	}

	public String gibAntwort2() {
		String[] antworten = { "Ja", "Nein", "Vielleicht" };
		return antworten[rnd.nextInt(antworten.length)];
	}

	public String gibAntwort3() {		
		return antworten.get(rnd.nextInt(antworten.size()));
	}
}
