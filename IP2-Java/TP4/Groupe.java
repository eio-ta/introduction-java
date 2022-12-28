public class Groupe {
	private Cellule chefDeFile;
	
	public Groupe() {
		this.chefDeFile = null;
	}
	
	public void prendreTete(Robot r) {
		if(r.nomCorrect()) {
			this.chefDeFile = new Cellule(r, this.chefDeFile);
		}
	}
	
	public void affiche() {
		if(this.chefDeFile == null) {
			System.out.println("Ce groupe est vide.");
		} else {
			this.chefDeFile.affiche();
		}
	}
	
	public void ajouteNouveau(Robot r) {
		if(r.nomCorrect()) {
			if(this.chefDeFile == null) {
				this.prendreTete(r);
			} else {
				this.chefDeFile.ajouteNouveau(r);
			}
		}
	}
	
	public int numerologie() {
		if(chefDeFile == null) {
			return 0;
		} else {
			return this.chefDeFile.numerologie();
		}
	}
	
	public String bandNom() {
		if(this.chefDeFile == null) {
			return "";
		} else {
			return this.chefDeFile.bandNom();
		}
	}
	
	public void chantez() {
		this.chefDeFile.chantez();
	}

	public Groupe couperAPartirDe(char nom){
		if(this.chefDeFile == null) {
			return this;
		} else {
			Groupe old =  new Groupe();
			old.chefDeFile = this.chefDeFile.couperAPartirDe(nom);
			return old;
		}
	}
}
