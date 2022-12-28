public class Test {
	public static Arbre test(){
		Noeud a = new Noeud (6, null, new Noeud (8));
		Noeud b = new Noeud (9, new Noeud (2), a );
		Noeud c = new Noeud (5, b, null );
		Noeud d = new Noeud (1, new Noeud(4), null);
		Noeud e = new Noeud (7, new Noeud (0), d);
		Noeud f = new Noeud (3, c, e);
		return new Arbre(f);
	}

	public static void main(String[] args) {
		Arbre a = test();
		a.affichePenche();
		System.out.println();
		a.afficheLargeur();
		System.out.println();
		a.afficheTopDown();
	
	}

}
