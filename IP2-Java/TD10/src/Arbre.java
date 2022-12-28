public class Arbre {
	private Noeud racine;
	
	public Arbre() {
		this.racine = null;
	}
	
	public Arbre(Noeud n) {
		this.racine = n;
	}
	
	public void bourgeons() {
		if(this.racine != null) {
			if(this.racine.estFeuille()) {
				this.racine.setGauche(new Noeud(null, null));
				this.racine.setDroit(new Noeud(null, null));
			} else {
				if (this.racine.getGauche() != null) this.racine.getGauche().bourgeons();
				if (this.racine.getDroit() != null) this.racine.getDroit().bourgeons();
			}
		}
	}
	
	public void elagage() {
		if (this.racine != null) {
			if(this.racine.estFeuille()) this.racine = null; return;
			if((this.racine.getGauche() != null) && (this.racine.getGauche().estFeuille())) this.racine.setGauche(null);
			if (this.racine.getGauche() != null) this.racine.getGauche().elagage();
			if (this.racine.getDroit() != null) this.racine.getDroit().elagage();
		}
	}
	
}
