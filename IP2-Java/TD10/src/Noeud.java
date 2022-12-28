public class Noeud {
	private Noeud gauche;
	private Noeud droit;
	
	public Noeud(Noeud g, Noeud d) {
		this.gauche = g;
		this.droit = d;
	}

	////////Getteurs & Setteurs///////
	
	public Noeud getGauche() {
		return this.gauche;
	}
	
	public Noeud getDroit() {
		return this.droit;
	}
	
	public void setGauche(Noeud n) {
		this.gauche = n;
	}
	
	public void setDroit(Noeud n) {
		this.droit = n;
	}
	
	//////////////////////////////////
	
	public boolean estFeuille() {
    	return ((gauche == null) && (droit == null));
    }
	
	public void bourgeons() {
		if(this.estFeuille()) {
			this.setGauche(new Noeud(null, null));
			this.setDroit(new Noeud(null, null));
		} else {
			if (this.gauche != null) this.gauche.bourgeons();
			if (this.droit != null) this.droit.bourgeons();
		}
	}
	
	public void elagage() {
		if()
		
	}
	
}