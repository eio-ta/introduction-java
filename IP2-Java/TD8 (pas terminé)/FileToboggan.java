public class FileToboggan{
    private Enfant courant;
    private int nbMax;

    public FileToboggan(int nbMax){
        this.nbMax = nbMax;
        courant = null;
    }

    public void affiche(){
        if(this.courant.getSuivante() != null){
            this.courant.affiche();
        } else {
            this.courant.getEnfant().description();
        }
    }

    /*public void ajouter(String nom){
        if(courant == null){
            Enfant enf = new Enfant(nom);
            Cellule courant = new Cellule(enf);
        }
        if(courant.getEnfant().getNom() == courant.getSuivante().getEnfant().getNom()){
            Cellule nouveauEnf = new Cellule(nom);
            courant.setSuivante(nouveauEnf);
            courant.setPrecedente(nouveauEnf);
            nouveauEnf.setPrecedente(courant);
            nouveauEnf.setSuivante(courant);
        } else {
            Enfant tmp = new Enfant(nom);
            Cellule nouveauEnf = new Cellule(tmp);
            nouveauEnf.setPrecedente(courant.getPrecedente());
            nouveauEnf.setSuivante(courant);
            courant.setPrecedente(nouveauEnf);
            nouveauEnf.getPrecedente().setSuivante(nouveauEnf);            
        }
    }*/

    /*public boolean appartient(String nom){
        if(courant.getEnfant().getNom() == nom){
            return true;
        } else {
            return courant.appartient(nom);
        }
    }

    public void supprimer(String nom){
        if(appartient(nom)){
            if(courant.getEnfant().getNom() == nom){
                Cellule tmp = courant.getSuivante();
                Cellule tmpP = courant.getPrecedente();
                tmpP.setSuivante(tmp);
                tmp.setPrecedente(tmpP);
                courant = tmp;
            } else {
                courant.supprimer(nom);
            }
        } else {
            System.out.println("Cet enfant ne fait de toboggan : on ne peut pas le supprimer.");
        }
    }

    public Enfant unTour(){
        this.courant.setNombre() += 1;
        if(this.courant.getNombre() >=nbMax){
            Enfant tmp = this.courant.getEnfant();
            this.supprimer(this.courant.getNom());
            return tmp;
        } else {
            int aléatoire = (int)Math.random();
            if(aléatoire == 0){
                courant = courant.getSuivante();
                return null;
            } else {
                Enfant tmp = this.courant.getEnfant();
                this.supprimer(this.courant.getNom());
                return tmp;
            }
        }
    }*/

    
}