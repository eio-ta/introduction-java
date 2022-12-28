public class CellRob{
    private Robot rob;
    private CellRob precedente;
    private CellRob suivante;

    public CellRob(Robot rob, CellRob prec, CellRob suiv){
        this.rob = rob;
        this.suivante = suiv;
        this.precedente = prec;
    }

    //////////////////////////////////////GETTERS & SETTERS//////////////////////////////////////
    public CellRob getSuivante(){
        return this.suivante;
    }

    public CellRob getPrecedente(){
        return this.precedente;
    }

    public Robot getRobot(){
        return this.rob;
    }

    public void setSuivante(CellRob suiv){
        this.suivante = suiv;
    }

    public void setPrecedente(CellRob prec){
        this.precedente = prec;
    }
    /////////////////////////////////////////////////////////////////////////////////////////////

    public void affiche(){
        this.rob.description();
        CellRob aux = this.suivante;
        while(aux!=this){
            aux.getRobot().description();
            aux=aux.getSuivante();
        }
    }

    public boolean appartient(int id){
        if(this.getRobot().getID() == id){
            return true;
        }
        CellRob aux = this.suivante;
        while(aux!=this){
            if(aux.getRobot().getID() == id){
                return true;
            } else {
                aux=aux.getSuivante();
            }
        }
        return false;
    }

    public boolean appartient(char nom){
        if(this.getRobot().getNom() == nom){
            return true;
        }
        CellRob aux = this.suivante;
        while(aux!=this){
            if(aux.getRobot().getNom() == nom){
                return true;
            } else {
                aux=aux.getSuivante();
            }
        }
        return false;
    }

    public void supprimer(int id){
        if(this.getRobot().getID() == id){
            CellRob tmp = this.getSuivante();
            CellRob tmpP = this.getPrecedente();
            tmpP.setSuivante(tmp);
            tmp.setPrecedente(tmpP);
        }
        CellRob aux = this.suivante;
        while(aux!=this){
            if(aux.getRobot().getID() == id){
                CellRob tmp = aux.getSuivante();
                CellRob tmpP = aux.getPrecedente();
                tmpP.setSuivante(tmp);
                tmp.setPrecedente(tmpP);
                return;
            } else {
                aux=aux.getSuivante();
            }
        }
    }

    public void supprimer(char nom){
        if(this.getRobot().getNom() == nom){
            CellRob tmp = this.getSuivante();
            CellRob tmpP = this.getPrecedente();
            tmpP.setSuivante(tmp);
            tmp.setPrecedente(tmpP);
        }
        CellRob aux = this.suivante;
        while(aux!=this){
            if(aux.getRobot().getNom() == nom){
                CellRob tmp = aux.getSuivante();
                CellRob tmpP = aux.getPrecedente();
                tmpP.setSuivante(tmp);
                tmp.setPrecedente(tmpP);
                return;
            } else {
                aux=aux.getSuivante();
            }
        }
    }

    public void parlerNFois(int n, int np){
        this.rob.parle(np);
        CellRob aux = this.suivante;
        while(aux!=this){
            aux.getRobot().parle(np);
            aux = aux.getSuivante();
        }
    }


}
