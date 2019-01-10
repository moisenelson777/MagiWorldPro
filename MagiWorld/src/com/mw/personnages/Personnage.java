	package com.mw.personnages;

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
		
		System.out.println("Niveau du personnage ?");
		this.setNiveau(sc.nextInt());
		
		System.out.println("Force du personnage ?");
		this.setForce(sc.nextInt());
		
		System.out.println("Agilité du personnage ?");
		this.setAgilite(sc.nextInt());
		
		System.out.println("Intelligence du personnage ?");
		this.setIntelligence(sc.nextInt());
		
		if(this.force+this.agilite+this.intelligence > this.niveau) throw new BadValueException();
		
		System.out.println(this.toString());
	}
}