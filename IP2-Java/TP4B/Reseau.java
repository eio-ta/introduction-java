public class Reseau{
    private String nom;
    private Maison siege;

    public Reseau(String nom, Maison a){
        this.nom = nom;
        this.siege = a;
    }

    public Reseau(String nom){
        this(nom, null);
    }

    public void afficher(){
        System.out.println(this.nom);
        int longueur = this.nom.length();
        while(longueur!=0){
            System.out.print("-");
            longueur--;
        }
        System.out.println();
        this.siege.affiche();
    }

    public boolean estPresent(Espion e){
        if(this.siege == null){
            return false;
        }
        return this.siege.estPresent(e);
    }

    public void ajouterEspion(Espion e){
        if(this.estPresent(e)){
            System.out.println("L'espion est déjà dans le réseau.");
        }
        if(this.siege == null){
            this.siege = new Maison(e);
        } else {
            Maison pi = new Maison(e);
            this.siege.getDerniereMaison().changerLigne(pi);
        }
    }
}