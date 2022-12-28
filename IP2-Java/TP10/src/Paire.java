public class Paire {
	private Noeud noeud;
	private int valeur;
	
	public Paire(Noeud a, int b) {
		this.noeud = a;
		this.valeur = b;
	}
	
	public Noeud getNoeud() {
		return this.noeud;
	}
	
	public int getValeur() {
		return this.valeur;
	}
	
	public Noeud getGauche() {
		return this.noeud.getGauche();
	}
	
	public Noeud getDroit() {
		return this.noeud.getDroit();
	}
	
}
