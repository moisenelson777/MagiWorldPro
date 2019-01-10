package com.mw.personnages;

public class Guerrier extends Personnage {

	@Override
	void attaqueBasique(Personnage adversaire) {
		// TODO Auto-generated method stub

	}

	@Override
	void attaqueSpeciale(Personnage adversaire) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		
		return "Woarg je suis le "+this.getClasseJoueur()+" "+this.getIdJoueur()+" niveau "+this.getNiveau()+" je possède "+this.getVie()+" de vitalité, "+this.getForce()+" de force, "+this.getAgilite()+" d'agilité et "+this.getIntelligence()+" d'intelligence !";
	}

}
