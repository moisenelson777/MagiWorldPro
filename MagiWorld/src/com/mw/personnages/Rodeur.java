package com.mw.personnages;

public class Rodeur extends Personnage {

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

		return "Chuut je suis le "+this.getClasseJoueur()+" "+this.getIdJoueur()+" niveau "+this.getNiveau()+" je poss�de "+this.getVie()+" de vitalit�, "+this.getForce()+" de force, "+this.getAgilite()+" d'agilit� et "+this.getIntelligence()+" d'intelligence !";
	}

}
