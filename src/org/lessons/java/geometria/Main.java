package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		InitRettangolo init = new InitRettangolo();

		Rettangolo rettangolo = init.init();
		System.out.println("l'area del rettangolo calcolato è:  "+rettangolo.area());
		System.out.println("il perimetro del rettangolo calcolato è:  "+rettangolo.perimetro());
		rettangolo.disegna();
		
	}
}


//Dato che l'esercizio era stato gia svolto ho solo aggiunto i modificatori d'accesso, private e protected al costruttore e ai paraetri del 
//costruttore, ho poi provato a "snellire" i comandi nel main costruendo un'altra classe che si occupa di inizializzare il rettangolo.
//non so se è corretto come ragionamento, sempliciamente volevo provare, sicuramente è più complesso del necessario. ma siamo qui per provare.


//in base all'eserizio svolto non sono riuscita ad applicare i metodi get e set, ma sono chiari:
//nel momento in cui abbiamo i paraetri del costruttore privati per poterli riassegnare o anche solo 
//mostrare devono passare per un metodo che convenzionalmente chiamiamo rispettivamente setNome() e getNome()
