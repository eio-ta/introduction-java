public class Robot {
	private final char nom;//lettre entre ’a’ et ’z’
	private int energie;
	private final String texte; //ce qu’il doit dire
	
	public Robot(char nom, String paroles){
		this.nom = nom;
		// on donne une énergie entre 10 et 20
		energie = 10 + (int)(Math.random() * 11);
		texte = paroles;
	}
	
	public String description() {
		String s = "Robot " + this.nom + " dit " + this.texte + " quand il parle et a " + this.energie + " point d'énergie";
		return s;
	}
	
	public boolean nomCorrect() {
		return ('a' <= this.nom && this.nom < 'z');
	}
	
	public char getNom() {
		return this.nom;
	}
	
	public int getEnergie() {
		return this.energie;
	}
	
	public String getTexte() {
		return this.texte;
	}
	
	
	public void chante() {
		int x = (int)(this.getNom()) - (int) 'a' + 1;
		while(x!=0) {
			System.out.println(this.getTexte());
			x -= 1;
		}
		if(this.energie <10) {
			this.energie = 0;
		} else {
			this.energie -= 10;
		}
	}
}
