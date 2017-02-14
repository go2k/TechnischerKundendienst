package com.sabel.techkund;

import java.util.Random;

public class Zufallszahlentester {

	private Random rnd;

	public Zufallszahlentester() {
		rnd = new Random();
	}

	public static void main(String[] args) {

		Zufallszahlentester zt = new Zufallszahlentester();
		zt.eineZufallszahlAusgeben();
		zt.zufallszahlenAusgeben(4);

	}

	public void eineZufallszahlAusgeben() {

		System.out.println(rnd.nextInt(100));

	}

	public void zufallszahlenAusgeben(int anzahl) {

		for (int i = 0; i < anzahl; i++) {
			eineZufallszahlAusgeben();
		}
	}

}
