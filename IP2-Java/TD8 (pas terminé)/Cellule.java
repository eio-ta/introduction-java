public class Cellule{
    private Enfant enf;
    private Cellule precedente;
    private Cellule suivante;

    public Cellule(Enfant enf){
        this.enf = enf;
        this.suivante = this;
        this.precedente = this;
    }

    //////////////////////////////////////GETTERS & SETTERS//////////////////////////////////////
    public Cellule getPrecedente(){
        return this.precedente;
    }

    public Cellule getSuivante(){
        return this.suivante;
    }

    public Enfant getEnfant(){
        return this.enf;
    }

    public void setPrecedente(Cellule prec){
        this.precedente = prec;
    }

    public void setSuivante(Cellule suiv){
        this.suivante = suiv;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////

    public void affiche(){
        this.enf.description();
        Cellule aux = this.suivante;
        while(aux!=this){
            aux.getEnfant().description();
            aux=aux.getSuivante();
        }
    }
    
    /*public boolean appartient(String nom){
        if(this.getEnfant().getNom() == nom){
            return true;
        }
        Cellule aux = this.suivante;
        while(aux!=this){
            if(aux.getEnfant().getNom() == nom){
                return true;
            } else {
                aux=aux.getSuivante();
            }
        }
        return false;
    }

    public void supprimer(String nom){
        if(this.getEnfant().getNom() == nom){
            Cellule tmp = this.getSuivante();
            Cellule tmpP = this.getPrecedente();
            tmpP.setSuivante(tmp);
            tmp.setPrecedente(tmpP);
        }
        Cellule aux = this.suivante;
        while(aux!=this){
            if(aux.getEnfant().getNom() == nom){
                Cellule tmp = aux.getSuivante();
                Cellule tmpP = aux.getPrecedente();
                tmpP.setSuivante(tmp);
                tmp.setPrecedente(tmpP);
                return;
            } else {
                aux=aux.getSuivante();
            }
        }
    }*/
}

