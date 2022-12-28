public class Automate {
	private Cellule debut;
	private Cellule fin;
	
	public Automate() {
		this.fin = null;
		this.debut = null;
	}

	//Constructeur de la question 8
	public Automate(String str){
		this();
		for(int i=str.length()-1; i>=0; i--){
			if(str.charAt(i) == '#'){
				this.ajoutDebut(true);
			}
			if(str.charAt(i) == '-'){
				this.ajoutDebut(false);
			}
		}
	}
	
	public void ajoutDebut(boolean noire) {
		if(debut == null) {
			this.debut = new Cellule(noire);
		} else {
			Cellule tmp = new Cellule(noire);
			tmp.setSuivante(debut);
			debut.setPrecedente(tmp);
			this.debut = tmp;
		}
	}
	
	public void ajoutFin(boolean noire) {
		if(this.debut == null) {
			this.debut = new Cellule(noire);
		} else {
			if(fin == null) {
				Cellule tmp = new Cellule(noire);
				tmp.setPrecedente(debut);
				debut.setSuivante(tmp);
				this.fin = tmp;
			} else {
				Cellule tmp = new Cellule(noire);
				tmp.setPrecedente(fin);
				fin.setSuivante(tmp);
				this.fin = tmp;
			}
		}
	}
	
	public void afficher() {
		if(this.debut == null) {
			System.out.println("");
		} else {
			debut.afficher();
		}
		
	}
	
	public void initialisation() {
		this.ajoutDebut(true); 
		this.ajoutFin(true);
		this.ajoutFin(true); 
		this.ajoutFin(false);
		this.ajoutFin(false); 
		this.ajoutFin(false); 
		this.ajoutFin(true); 
		this.ajoutFin(false); 
		this.ajoutFin(false); 
		this.ajoutFin(false);
		this.ajoutFin(false);
	}
	
	public void prochaineEtape() {
		debut.getSuivante().prochaineEtape();
	}
	
	public void MiseAJour() {
		debut.getSuivante().MiseAJour();
	}

	public void uneEtape() {
		this.prochaineEtape();
		this.MiseAJour();
		System.out.println();
		this.afficher();
	}

	public void nEtapes(int n){
		this.afficher();
		while(n!=0){
			this.uneEtape();
			n--;
		}
	}

	public void prochaineEtapeM(){
		debut.getSuivante().prochaineEtapeM();
	}

	public void nEtapesM(int n){
		this.afficher();
		while(n!=0){
			this.uneEtapeM();
			n--;
		}
	}

	public void uneEtapeM() {
		this.prochaineEtapeM();
		this.MiseAJour();
		System.out.println();
		this.afficher();
	}



}
