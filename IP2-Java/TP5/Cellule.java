public class Cellule{
    private Employe emp;
    private Cellule suivant;

    public Cellule(Employe emp, Cellule suivant){
        this.emp = emp;
        this.suivant = suivant;
    }

    public Cellule(Employe emp){
        this(emp, null);
    }

    public void affiche(){
        this.emp.affiche();
        if(this.suivant != null){
            this.suivant.affiche();
        }
    }

    public boolean appartient(String n){
        if(this.emp.getNom().equals(n)){
            return true;
        }
        if(this.suivant == null){
            return false;
        }
        return this.suivant.appartient(n);
    }

    public void demission(String n){
        if(this.suivant.emp.getNom().equals(n)){
            if(this.suivant.suivant == null){
                this.suivant = null;
            } else{
                this.suivant = this.suivant.suivant;
            }
        } else {
            this.suivant.demission(n);
        }
    }

    public boolean augmente(String nom, int montant){
        if(this.emp.getNom().equals(nom)){
            this.emp.setSalaire(montant);
            return true;
        }
        if(this.suivant == null){
            return false;
        }
        return this.suivant.augmente(nom, montant);
    }

    public Employe augmente_Version_1(String nom){
        if(this.emp.getNom().equals(nom)){
            return this.emp;
        }
        return this.suivant.augmente_Version_1(nom);
    }

    public Cellule trouveEmp(String nom){
        if(this.suivant.getEmploye().getNom().equals(nom)){
            return this;
        }
        if(this.suivant == null){
            return null;
        }
        return this.suivant.trouveEmp(nom);
    }

    public void pushIt(){
        if(this.suivant == null){
            return;
        } else {
            if(this.suivant.suivant != null){
                if(this.suivant.getEmploye().getSalaire()>this.suivant.suivant.getEmploye().getSalaire()){
                    Employe e1 = this.suivant.emp;
                    Employe e2 = this.suivant.getSuivant().getEmploye();
                    this.suivant.setEmploye(e2);
                    this.suivant.getSuivant().setEmploye(e1);
                    this.suivant.pushIt();
                } else {
                    return;
                }
            }
        }
    }

    public boolean choixSalaire(int min, int max){
        Cellule tmp = this;
        if(tmp.getEmploye().choixSalaire(min, max)){
            return true;
        }
        return false;
    }

    public boolean croissante(){
        if(this.suivant == null){
            return true;
        } else {
            int x = this.getEmploye().getSalaire();
            int y = this.suivant.getEmploye().getSalaire();
            if(x>=y){
                return false;
            }
            return this.suivant.croissante();
        }
    }

    public void acquisition_Version_1(Entreprise ent){
        if(this.suivant == null){
            ent.ajout(this.emp);
        } else{
            ent.ajout(this.emp);
            this.suivant.acquisition_Version_1(ent);
        }
    }


    public Employe getEmploye(){
        return this.emp;
    }

    public Cellule getSuivant(){
        return this.suivant;
    }
    public void ajout(Employe emp){
        if(suivant==null){
            this.suivant= new Cellule(emp);
        }
        else if (suivant.emp.ajout(emp)){
            this.suivant= new Cellule(emp,this.suivant);
        }
        else {
            this.suivant.ajout(emp);
        }
    }

    public void setSuivant(Cellule a){
        this.suivant = a;
    }

    public void setEmploye(Employe a){
        this.emp = a;
    }

}