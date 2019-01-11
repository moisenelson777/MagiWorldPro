	package com.mw.personnages;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Personnage {

	Scanner sc = new Scanner(System.in);
	protected static int IdJoueur = 0;
	protected String classeJoueur;
	protected int niveau;
	protected int vie;
	protected int force;
	protected int agilite;
	protected int intelligence;
	
	public Personnage() {
		IdJoueur++;
	}
	public static String getIdJoueur() {
		return "joueur "+IdJoueur;
	}
	public static void setIdJoueur(int idJoueur) {
		IdJoueur = idJoueur;
	}
	public String getClasseJoueur() {
		return  this.getClass().getSimpleName();
	}
	public void setClasseJoueur(String classeJoueur) {
		this.classeJoueur = classeJoueur;
	}
	public int getNiveau() {
		return niveau;
	}
	public void setNiveau(int niveau) {
		this.niveau = niveau;
		this.vie = this.niveau * 5;
	}
	public int getVie() {
		return vie;
	}

	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public int getAgilite() {
		return agilite;
	}
	public void setAgilite(int agilite) {
		this.agilite = agilite;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	abstract void attaqueBasique(Personnage adversaire);
	abstract void attaqueSpeciale(Personnage adversaire);
	
	public abstract String toString();
	
	public void caracteresPersonnage() throws BadValueException {
		
		//boolean caracteresValides;
		do {
		System.out.println();
		this.setNiveau(checkingCaractere("Niveau du personnage ?"));
		
		this.setForce(checkingCaractere("Force du personnage ?"));
		
		this.setAgilite(checkingCaractere("Agilité du personnage ?"));
		
		this.setIntelligence(checkingCaractere("Intelligence du personnage ?"));
		
		if(this.force+this.agilite+this.intelligence > this.niveau) throw new BadValueException();
		}while(this.force+this.agilite+this.intelligence > this.niveau);
		
		System.out.println(this.toString());
	}
	
	 public int checkingCaractere(String caractere) {
		 System.out.println(caractere);
		 boolean caractereValide;
		 int valeur = 0;
		 
		 do {
	            try {
	            	valeur = sc.nextInt();
	                caractereValide = true;
	                if (valeur < 1) {
		                System.err.println("Merci de saisir une valeur supérieure ou égale à  1");
		                caractereValide = false;
		            }
		            if (valeur > 100) {
		                System.err.println("Merci de saisir une valeur inférieure ou égale à  100");
		                caractereValide = false;
		            }
	            } catch (InputMismatchException e) {
	                sc.next();
	                System.err.println("Merci de saisir une valeur valide");
	                caractereValide = false;
	            }
	        } while (!caractereValide);
	        return valeur;
	    }
}