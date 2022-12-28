public class Cellule {
	private Robot rob;
	private Cellule suivant;
	
	public Cellule(Robot rob, Cellule suivant){
		this.rob = rob;
		this.suivant = suivant;
	}
	
	public Cellule(Robot rob){
		this(rob,null);
	}
	
	public void affiche() {
		Cellule tmp = this;
		while(tmp!=null) {
			System.out.println(tmp.rob.description());
			tmp = tmp.suivant;
		}
	}
	
	public void ajouteNouveau(Robot r) {
		Cellule tmp = this;
		while(tmp.suivant!=null) {
			tmp = tmp.suivant;
		}
		tmp.suivant = new Cellule(r);
	}
	
	public int numerologie() {
		Cellule tmp = this;
		int res = 0;
		while(tmp!=null) {
			res += (int)(tmp.rob.getNom()) - (int) 'a' + 1;
			tmp = tmp.suivant;
		}
		return res%9;
	}
	
	public String bandNom() {
		Cellule tmp = this;
		String s = "";
		while(tmp!=null) {
			s += (tmp.rob.getNom());
			tmp = tmp.suivant;
		}
		return s;
	}
	
	public void chantez() {
		Cellule tmp = this;
		while(tmp!=null) {
			tmp.rob.chante();
			tmp = tmp.suivant;
		}
	}

	public Cellule couperAPartirDe(char nom){
		Cellule tmp = this;
		while(tmp.suivant.rob.getNom() != nom){
			tmp = tmp.suivant;
		}
		tmp = tmp.suivant;
		return tmp;
	} 
	
	
	
	
}
