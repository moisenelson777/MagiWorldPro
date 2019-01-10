package com.mw.jeu;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.mw.personnages.*;

public class Configuration {

	Scanner sc = new Scanner(System.in);
	Personnage joueur1;
	Personnage joueur2;
	
	public void jouer() {
		System.out.println("Création du personnage du joueur 1");
		joueur1 = configurationJoueur();
		System.out.println("Création du personnage du joueur 2");
		joueur2 = configurationJoueur();
	}
	
	public Personnage configurationJoueur(){
		Personnage joueur = null;
		
		do {
			System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rodeur, 3 : Mage)");
			
			try {
			switch(sc.nextInt()) {
				case 1: joueur = new Guerrier();
				break;
				case 2 : joueur = new Rodeur(); 
				break;
				case 3 : joueur = new Mage(); 
				break;
				default : System.out.println("Veuillez entrer une valeur valide"); 
				break;
			}
			}catch (InputMismatchException e) {
				joueur = null;
				sc.nextLine();
		}
	}while(joueur == null);
		joueur.caracteresPersonnage();
		return joueur;		
  }
}