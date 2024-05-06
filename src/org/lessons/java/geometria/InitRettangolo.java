package org.lessons.java.geometria;

import java.util.Scanner;

public class InitRettangolo {
	private Scanner lati = new Scanner(System.in);
	
	private int chiediBase() {
		
		System.out.print("Inserisci la base");
		int base = lati.nextInt();
		return base;
	
	}
	
	
	private int chiediAltezza() {
		System.out.print("Inserisci l'altezza");
		int altezza = lati.nextInt();
		return altezza;
	}
	
	
	public Rettangolo init () {
		Rettangolo rettangolo = new Rettangolo(chiediBase(),chiediAltezza());
		return rettangolo;
	}
	
	

}
