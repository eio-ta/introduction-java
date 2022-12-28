public class Fruit{
    public String nom; // le nom du fruit
    public int poids; // le poids du fruit en grammes

    public Fruit(String n, int p){
        //À COMPLÉTER
        nom = n;
	    poids = p;
    }

    public static void afficher(Fruit f){
        System.out.println("Ce fruit est un(e) " + f.nom + " et pèse " + f.poids + " grammes.");
    }

    public static Fruit hybridation(Fruit f1, Fruit f2){
        String newname = "(" + f1.nom + f2.nom + ")";
        int newpoids = f1.poids + f2.poids;
        return new Fruit(newname, newpoids);
    }

}


    /*RÉPONSES AUX QUESTIONS :
    2) f, g et h sont des pointeurs vers les nouveaux objets de la classe Fruit crées par l'instruction "new". f et h pointent vers le même objet.
    4) On doit inclure les deux fichiers Fruit.java et Test.java pendant la compilation.*/
    