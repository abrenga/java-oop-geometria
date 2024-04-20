package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner lati = new Scanner(System.in);
		System.out.print("Inserisci la base");
		int base = lati.nextInt();
		System.out.print("Inserisci l'altezza");
		int altezza = lati.nextInt();
		Rettangolo rettangolo = new Rettangolo(base, altezza);
		
		int perimetro = rettangolo.perimetro();
		int area = rettangolo.area();
		
		
		System.out.println("perimetro: "+ perimetro);
		
		System.out.println("area: "+ area);
		
		rettangolo.disegna();
	}
}
