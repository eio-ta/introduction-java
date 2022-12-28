public class Etudiant{
    final String prenom ; // le prenom ,
    final String nom ; // le nom et
    double note ; // la note de l’etudiant ( sur 20).
    static int nombreDEtudiants = 0; // le nombre d’etudiants dans la promo
    static double sommeDesNotes = 0; // la somme des notes des etudiants
    
    public  Etudiant(String prenom, String nom, double note){
	this.prenom = prenom;
	this.nom = nom;
	this.note = note;
	nombreDEtudiants ++;
	sommeDesNotes = sommeDesNotes + note;
    }
    
    void afficher(){
	System.out.print(this.nom + " " + this.prenom +": " + this.note);
	System.out.println();
    }
    
    boolean estAdmis(){
	double n = this.note;
	if(n>=10)
	    return true;
	else 
	    return false;
    }
    
    static double moyenne(){
	double m = sommeDesNotes/nombreDEtudiants;
	return m;
    }
    
    boolean meilleurQueLaMoyenne(){
	double n = this.note;
	double m = moyenne();
	if (n>m)
	    return true;
	else 
	    return false;
    }
    
    void modifierNote(double nouvelleNote){
	sommeDesNotes = sommeDesNotes - this.note;
	this.note = nouvelleNote;
	sommeDesNotes = sommeDesNotes + this.note;
    }
}
