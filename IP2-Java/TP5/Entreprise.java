public class Entreprise{
    private String nom;
    private Cellule premier; 

    public Entreprise(String nom, Cellule premier){
        this.nom = nom;
        this.premier = premier;
    }

    public Entreprise(String nom){
        this(nom, null);
    }

    public void affiche(){
        if(premier == null){
            System.out.println("Cette entreprise est vide.");
        } else {
            this.premier.affiche();
        }
    }

    public boolean appartient(String n){
        if(premier == null){
            return false;
        } else {
            return this.premier.appartient(n);
        }
    }

    public void ajout(Employe emp){
        if(!(appartient(emp.getNom()))){
            if(premier==null){
                premier= new Cellule(emp);
            }
            else if(premier.getEmploye().getSalaire()>=emp.getSalaire()){
                premier = new Cellule(emp, premier);
            }
            else if (premier.getEmploye().getSalaire()<emp.getSalaire()){
                premier.ajout(emp);
            }
        }

    }

    public void demission(String n){
        if(appartient(n)){
            if(premier.getEmploye().getNom().equals(n)){
                premier = premier.getSuivant();
            } else{
            this.premier.demission(n);
            }
        }
    }

    public boolean augmente(String nom, int montant){
        if(appartient(nom)){
            if(premier.getEmploye().getNom().equals(nom)){
                premier.getEmploye().setSalaire(montant);
                return true;
            } else{
            this.premier.augmente(nom, montant);
            }
        }
        return false;
    }

    public boolean augmente_Version_1(String nom, int montant){
        if(appartient(nom)){
            if(premier.getEmploye().getNom().equals(nom)){
                Employe tmp = premier.getEmploye();
                tmp.setSalaire(montant);
                this.demission(nom);
                this.ajout(tmp);
                return true;
            } else{
                Employe tmp = this.premier.augmente_Version_1(nom);
                tmp.setSalaire(montant);
                this.demission(nom);
                this.ajout(tmp);
                return true;
            }
        }
        return false;
    }

    public boolean augmente_Version_2(String nom,int montant){
        if(appartient(nom)){
            if(premier.getEmploye().getNom().equals(nom)){
                premier.getEmploye().setSalaire(montant);
                if(premier.getEmploye().getSalaire()>premier.getSuivant().getEmploye().getSalaire()){
                    Employe e1 = this.premier.getEmploye();
                    Employe e2 = this.premier.getSuivant().getEmploye();
                    this.premier.setEmploye(e2);
                    this.premier.getSuivant().setEmploye(e1);
                    this.premier.pushIt();
                    return true;
                }
            } else {
                Cellule a = this.premier.trouveEmp(nom);
                Cellule b = a.getSuivant();
                b.getEmploye().setSalaire(montant);
                a.pushIt();
            return true;
            }
        }
        return false;
    }

    public void permuter(String nom, int montant){
        if(appartient(nom)){
            if(premier.getEmploye().getNom().equals(nom)){
                premier.getEmploye().setSalaire(montant);
                if(premier.getEmploye().getSalaire()>premier.getSuivant().getEmploye().getSalaire()){
                    Employe e1 = this.premier.getEmploye();
                    Employe e2 = this.premier.getSuivant().getEmploye();
                    this.premier.setEmploye(e2);
                    this.premier.getSuivant().setEmploye(e1);
                }
            }
        }
    }

    public Entreprise choixSalaire(int min, int max){
        Entreprise tmp = this;
        Entreprise bon = new Entreprise("bonSalaire");
        if(tmp.premier == null){
            return tmp;
        } else {
            while(tmp.premier.getSuivant() != null){
                if(tmp.premier.choixSalaire(min, max)){
                    bon.ajout(tmp.premier.getEmploye());
                    tmp.premier = tmp.premier.getSuivant();
                } else{
                    tmp.premier = tmp.premier.getSuivant();
                }
            }
        }
        return bon;
    }

    public boolean croissante(){
        if(premier == null){
            return true;
        } else {
            return this.premier.croissante();
        }
    }

    public void acquisition_Version_1(Entreprise ent){
        if(ent.premier != null){
            if(this.premier == null){
                this.premier = ent.premier;
            } else {
                ent.premier.acquisition_Version_1(this);
            }
        }
    }

}