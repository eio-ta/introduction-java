public class Cellule {
	private Cellule precedente;
	private Cellule suivante;
	private boolean noire;
	private boolean prochainEtat;
	
	public Cellule(boolean noire) {
		this.precedente = null;
		this.suivante = null;
		this.noire = noire;
		this.prochainEtat= false;
	}
	
	public void afficher() {
		if(suivante == null) {
			if(this.noire) {
				System.out.print(" #");
			} else {
				System.out.print(" -");
			}
		} else {
			if(this.noire) {
				System.out.print(" #");
			} else {
				System.out.print(" -");
			}
			suivante.afficher();
		}
	}
	
	public void prochaineEtape() {
		if(this.suivante != null) {
			boolean a1 = this.precedente.getNoire();
			boolean a2 = this.suivante.getNoire();
			if(a1 == a2 && a2 == this.getNoire() && a1 == this.getNoire()) {
				this.prochainEtat = false;
			} else {
				this.prochainEtat = true;
			}
				this.suivante.prochaineEtape();
				return;
		} else {
			boolean a1 = this.precedente.getNoire();
			boolean a2 = false;
			if(a1 == a2 && a2 == this.getNoire() && a1 == this.getNoire()) {
				this.prochainEtat = false;
			} else {
				this.prochainEtat = true;
				return;
			}
		}
	}
	
	public void MiseAJour() {
		if(this.suivante == null){
			this.noire = this.prochainEtat;
			return;
		} else {
			this.noire = this.prochainEtat;
			this.suivante.MiseAJour();
			return;
		}
	}

	public int compteurFalse(){
		int compteur = 0;
		if(precedente == null){
			compteur++;
		} else {
			if(precedente.getNoire() == false){
				compteur++;
			}
		}
		if (suivante == null){
			compteur++;
		} else {
			if(suivante.getNoire() == false){
				compteur++;
			}
		}
		if(this.getNoire() == false){
			compteur++;
		}
		return compteur;
	}

	public int compteurTrue(){
		int compteur = 0;
		if(precedente == null){
			compteur = compteur;
		} else {
			if(precedente.getNoire() == true){
				compteur++;
			}
		}
		if (suivante == null){
			compteur = compteur;
		} else {
			if(suivante.getNoire() == true){
				compteur++;
			}
		}
		if(this.getNoire() == true){
			compteur++;
		}
		return compteur;
	}

	public void prochaineEtapeM(){
		if(this.suivante != null){
			int compteurF = this.compteurFalse();
			int compteurT = this.compteurTrue();
			if(compteurF > compteurT){
				this.prochainEtat = false;
			} else {
				this.prochainEtat = true;
			}
			this.suivante.prochaineEtapeM();
			return;
		} else {
			int compteurF = this.compteurFalse();
			int compteurT = this.compteurTrue();
			if(compteurF > compteurT){
				this.prochainEtat = false;
			} else {
				this.prochainEtat = true;
			}
			return;
		}
	}
	

	//------------------------GETTERS------------------------//
	public Cellule getPrecedente() {
		return this.precedente;
	}
	
	public Cellule getSuivante() {
		return this.suivante;
	}
	
	public boolean getNoire() {
		return this.noire;
	}

	//------------------------SETTERS------------------------//
	public void setSuivante(Cellule a) {
		this.suivante = a;
	}
	
	public void setPrecedente(Cellule a) {
		this.precedente = a;
	}
	
	

}
