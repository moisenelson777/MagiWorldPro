package com.mw.personnages;

public class Mage extends Personnage {

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
		
		return "Abracadabra je suis le "+this.getClasseJoueur()+" "+this.getIdJoueur()+" niveau "+this.getNiveau()+" je possède "+this.getVie()+" de vitalité, "+this.getForce()+" de force, "+this.getAgilite()+" d'agilité et "+this.getIntelligence()+" d'intelligence !";
	}

}
