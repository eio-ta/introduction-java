public class Enfant{
    private String nom;
    private int nb;

    public Enfant(String nom){
        this.nom = nom;
        nb = 0;
    }

    //////////////////////////////////////GETTERS & SETTERS//////////////////////////////////////
    public String getNom(){
        return this.nom;
    }

    public int getNombre(){
        return this.nb;
    }

    public void setNombre(){
        this.nb+=1;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////

    public void description(){
        System.out.println("Nom du l'enfant : " + this.nom);
    }
}