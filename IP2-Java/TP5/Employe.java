public class Employe{
    private final String nom;
    private int salaire;

    public Employe(String nom, int sal){
        this.nom = nom;
        this.salaire = sal;
    }

    public String getNom(){
        return this.nom;
    }

    public int getSalaire(){
        return this.salaire;
    }

    public void setSalaire(int montant){
        this.salaire += montant;
    }

    public void affiche(){
        System.out.println("Nom de l'employé : " + this.getNom() + " Salaire : " + this.getSalaire());
    }

    public boolean choixSalaire(int min, int max){
        return (this.salaire <= max && this.salaire >= min)? true : false;
    }

    public boolean ajout(Employe emp){
        return (emp.salaire<=this.salaire);
    }
}