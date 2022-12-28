public class Memoire {
	private Memoire precedente;
	private Memoire suivante;
	private int valeur;
	
	public Memoire() {
		this.precedente = null;
		this.suivante = null;
		this.valeur = 0;
	}
	
	public Memoire(int taille) {
		this();
		Memoire tmp = this;
		while(taille > 1) {
			tmp.suivante = new Memoire();
			Memoire tmp2= tmp.suivante;
			tmp2.precedente =tmp;
			tmp = tmp.suivante;
			taille--;
			}
	}
	
	//*******************GETTERS & SETTERS*******************//
	public Memoire getSuivante() {
		return this.suivante;
	}
	
	public Memoire getPrecedente() {
		return this.precedente;
	}
	
	public int getValeur() {
		return this.valeur;
	}
	
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
	//*********************************************************//
	
	private void afficherPrecedente() {
		if(this.precedente == null) {
			System.out.print(this.valeur + " ");
			return;
		} else {
			this.precedente.afficherPrecedente();
			System.out.print(this.valeur + " ");
		}
	}
	
	private void afficherCurseur() {
		if(this.precedente == null) {
			return;
		} else {
			this.precedente.afficherCurseur();
			System.out.print("  ");
		}
	}
	private void afficherCurseur2(){
		this.afficherCurseur();
		System.out.print(" ^");
		System.out.println();
	}
	
	private void afficherSuivante() {
		if(this.suivante == null) {
			System.out.print(this.valeur + " ");
			return;
		} else {
			System.out.print(this.valeur + " ");
			this.suivante.afficherSuivante();
		}
	}
	
	public void inspecte(int taille) {
		repeat(taille);
		System.out.println();
		this.afficherPrecedente();
		this.suivante.afficherSuivante();
		System.out.println();
		this.afficherCurseur2();
	}
	
	public void repeat(int taille) {
		for(int i=0; i<taille; i++) {
			System.out.print("--");
		}
	}

	public void incremente(){
		this.valeur+=1;
	}

	public void decremente(){
		this.valeur-=1;
	}

	public int getTaille(int taille){
		return taille;
	}
	
}
