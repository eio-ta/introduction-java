public class Test {
	public static void main(String[] args) {
		System.out.println("EXERCICE 01");
		Robot r1 = new Robot('a', "texte 1");
		Robot r2 = new Robot('b', "texte 2");
		Robot r3 = new Robot('c', "texte 3");
		System.out.println(r1.description());
		System.out.println();

		System.out.println("EXERCICE 02");
		Groupe grp1 = new Groupe();
		grp1.prendreTete(r1);
		grp1.affiche();
		System.out.println();

		System.out.println("EXERCICE 03");
		grp1.ajouteNouveau(r2);
		grp1.ajouteNouveau(r3);
		grp1.affiche();
		System.out.println(grp1.numerologie()); //Il y a un problème sur cette fonction, la réponse devrait être '6'.
		System.out.println(grp1.bandNom());
		grp1.chantez();
		System.out.println();

		System.out.println("EXERCICE 04");
		System.out.println();
		System.out.println("ANCIEN TABLEAU");
		grp1.affiche();
		System.out.println();
		System.out.println("TABLEAU DES VIEUX");
		Groupe old = grp1.couperAPartirDe('b');
		old.affiche();




		
	}

}