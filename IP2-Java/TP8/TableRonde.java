public class TableRonde{
    private CellRob courant;

    public TableRonde(Robot rob){
        this.courant = new CellRob(rob, null, null);
    }

    //////////////////////////////////////GETTERS & SETTERS//////////////////////////////////////
    public CellRob getCourant(){
        return this.courant;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////

    public void affiche(){
        if(this.courant.getSuivante() != null){
            this.courant.affiche();
        } else {
            this.courant.getRobot().description();
        }
    }

    public void ajouteRob(Robot r){
        if(courant.getSuivante() == null){
            CellRob nouveauRob = new CellRob(r, this.courant, this.courant);
            courant.setSuivante(nouveauRob);
            courant.setPrecedente(nouveauRob);
        } else {
            CellRob nouveauRob = new CellRob(r, courant.getPrecedente(), this.courant);
            courant.setPrecedente(nouveauRob);
            nouveauRob.getPrecedente().setSuivante(nouveauRob);
        }
    }

    public boolean appartient(int id){
        if(courant.getRobot().getID() == id){
            return true;
        } else {
            return courant.appartient(id);
        }
    }

    public boolean appartient(char nom){
        if(courant.getRobot().getNom() == nom){
            return true;
        } else {
            return courant.appartient(nom);
        }
    }

    public void supprimer(int id){
        if(appartient(id)){
            if(courant.getRobot().getID() == id){
                CellRob tmp = courant.getSuivante();
                CellRob tmpP = courant.getPrecedente();
                tmpP.setSuivante(tmp);
                tmp.setPrecedente(tmpP);
                courant = tmp;
            } else {
                courant.supprimer(id);
            }
        } else {
            System.out.println("Ce Robot n'est pas assis à cette table : on ne peut pas le supprimer.");
        }
    }

    public void supprimer(char nom){
        if(appartient(nom)){
            if(courant.getRobot().getNom() == nom){
                CellRob tmp = courant.getSuivante();
                CellRob tmpP = courant.getPrecedente();
                tmpP.setSuivante(tmp);
                tmp.setPrecedente(tmpP);
                courant = tmp;
            } else {
                courant.supprimer(nom);
            }
        } else {
            System.out.println("Ce Robot n'est pas assis à cette table : on ne peut pas le supprimer.");
        }
    }

    public void parlerNFois(int n, int np){
        while(n!=0){
		    this.courant.parlerNFois(n, np);
            n--;
        }
    }
    
}
