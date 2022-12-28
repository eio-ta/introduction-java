public class Test{
    public static void main(String[] args){
	Etudiant e1 = new Etudiant ("Luke", "Skywalker", 8.25);
	Etudiant e2 = new Etudiant ("Leia", "Organa", 11.75);
	Etudiant e3 = new Etudiant ("Elody", "Tang", 14.25);
	System.out.println("nb d’etudiants : " + Etudiant.nombreDEtudiants);
	System.out.println("somme des notes: " + Etudiant.sommeDesNotes);
	e1.afficher();
	e2.afficher();
	System.out.println(e2.estAdmis());
	System.out.println(Etudiant.moyenne());
	//System.out.println(e2.meilleurQueLaMoyenne());
	e2.modifierNote(19.5);
	e2.afficher(); // Organa Leia : 19.5
	System.out.println("moyenne: " + Etudiant.moyenne());
	// moyenne : 14
	// [Si la promotion ne contient que Luke , Leia et vous avec 14.25]
    }
}

/*REPONSES AUX QUESTIONS :
2/ final : caractérise un champ dont la valeur ne pourra pas être changée
après son initialisation (la valeur est définitive);
static : les variables static sont associées directement à la classe, elles sont partagées
Les attributs sont considérés "public", donc elles sont visibles de l'extérieur (donc à partir de d'autres fichiers)*/
