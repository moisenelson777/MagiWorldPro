package com.mw.jeu;

import java.util.Scanner;

import com.mw.personnages.*;

public class Configuration {

	Scanner sc = new Scanner(System.in);
	boolean test = false;
	Personnage joueur1 = null;
	Personnage joueur2 = null;
	
	public void jouer() {
		creationJoueurs();
	}
	
	public void creationJoueurs() {
		System.out.println("Création du personnage du joueur 1");
		System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rodeur, 3 : Mage)");
		
			switch(sc.nextInt()) {
			case 1: joueur1 = new Guerrier();
			break;
			case 2 : joueur1 = new Rodeur();
			break;
			case 3 : joueur1 = new Mage();
			break;
		    default : System.out.println("Veuillez entrer une valeur valide");
			}
			
			joueur1.caracteresPersonnage();
			
			System.out.println("Création du personnage du joueur 2");
			System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rodeur, 3 : Mage");
			
				switch(sc.nextInt()) {
				case 1: joueur2 = new Guerrier();
				break;
				case 2 : joueur2 = new Rodeur();
				break;
				case 3 : joueur2 = new Mage();
				break;
			    default : System.out.println("Veuillez entrer une valeur valide");
				}
				
				joueur2.caracteresPersonnage();
	}
}
