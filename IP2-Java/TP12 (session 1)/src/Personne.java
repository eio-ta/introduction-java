class Personne {
	private String prenom;
	private String nom;
	private Personne mere;
	private Personne pere;
	
	public boolean MemeFatrie(Personne p) {
		return (this.nom == p.nom && this.mere.nom == p.mere.nom && this.mere.prenom == p.mere.prenom && this.pere.nom == p.pere.nom && this.pere.prenom == p.pere.prenom);
	}
	
	public boolean estCousinGermain(Personne p) {
		return (this.pere.MemeFatrie(p.pere)) || this.pere.MemeFatrie(p.mere) || this.mere.MemeFatrie(p.pere) || this.mere.MemeFatrie(p.mere);	
	}
	
	public boolean possedeCommeAscendant(Personne p) {
		if(this.nom == p.nom && this.prenom == p.prenom) return true;
		if(this.pere != null) return this.pere.possedeCommeAscendant(p);
		if(this.mere != null) return this.mere.possedeCommeAscendant(p);
		return false;
	}
	
	public int distance(Personne p) {
		if(this.nom == p.nom && this.prenom == p.prenom) return 0;
		if(this.pere != null) return 1+this.pere.distance(p);
		if(this.mere != null) return 1+this.mere.distance(p);
		return 0;
	}
	
	public void cEstQui(Personne p) {
		if(this.nom == p.nom && this.prenom == p.prenom) System.out.println('toi');
		if(this.pere != null) this.pere.cEstQui(p); Sytem.out.println('ton père');
		if(this.mere != null) this.mere.cEstQui(p);	
	}
}