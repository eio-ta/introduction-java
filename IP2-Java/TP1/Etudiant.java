public class Etudiant{
    String nom, prenom; // les nom et prenom de l’etudiant
    int num; // le numero d’etudiant
    int note; // la note de l’etudiant (sur 20)
    /* A COMPLETER ... */

    Etudiant(String no, String p, int n, int not) {
        nom = no;
        prenom = p;
        num = n;
        note = not;
    }

    public static void afficher(Etudiant etu) {
        System.out.println("Nom " + etu.nom + " Prénom  " + etu.prenom + " (Numéro d'étudiant "+ etu.num + ") : Note " + etu.note);
    }

    public static boolean estAdmis(Etudiant etu) {
        if(etu.note >= 10){
            return true;
        } else{
            return false;
        }
    }

    public static void mention(Etudiant etu) {
        if (etu.note <= 20 && 16 <= etu.note) {
            System.out.println("Très bien");
        } else if (etu.note < 16 && 14 <= etu.note) {
            System.out.println("Bien");
        } else if (etu.note < 14 && 12 <= etu.note) {
            System.out.println("Assez bien");
        } else if (etu.note < 12 && 10 <= etu.note) {
            System.out.println("Passable");
        } else if (etu.note < 10 && 0 <= etu.note) {
            System.out.println("Ajourné");
        } else {
            System.out.println("Note invalide");
        }
    }

}
