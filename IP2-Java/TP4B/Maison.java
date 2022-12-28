public class Maison{
    private Espion habitant;
    private Maison ligneVers;
    private char id;
    private static int carac = 97; //'a' en ascii

    public Maison(Espion habitant, Maison ligneVers){
        this.habitant = habitant;
        this.ligneVers = ligneVers;
        this.id = (char) carac;
        this.carac++;
    }

    public Maison(Espion habitant){
        this(habitant, null);
    }

    public String description(){
        String s = this.ligneVers == null ? ", ligne non connectée" : (", ligne vers maison " + this.ligneVers.id);
        return ("maison " + this.id + " habitée par " + this.habitant.description() + s);
    }

    public void affiche(){
        System.out.print("Maison         ");
        Maison tmp = this;
        while(tmp!=null){
            System.out.print(tmp.id);
            if(tmp.ligneVers != null){
                System.out.print(" -> ");
            }
            tmp = tmp.ligneVers;
        }
        System.out.println();
        System.out.print("Habitant       ");
        tmp = this;
        while(tmp!=null){
            System.out.print(tmp.habitant.getid());
            System.out.print("    ");
            tmp = tmp.ligneVers;
        }
        System.out.println();
        System.out.print("Loyal ?        ");
        tmp = this;
        while(tmp!=null){
            System.out.print(tmp.habitant.getLoyal());
            System.out.print("    ");
            tmp = tmp.ligneVers;
        }
        System.out.println();
    }

    public boolean estPresent(Espion e){
        Maison tmp = this;
        while(tmp.ligneVers!=null){
            if(e == tmp.habitant){
                return true;
            }
            tmp = ligneVers;
        }
        return false;
    }

    public Maison getDerniereMaison(){
        Maison tmp = this;
        while(tmp.ligneVers!=null){
            tmp = ligneVers;
        }
        return tmp;
    }

    public void changerLigne(Maison newL){
        this.ligneVers = newL;
    }

    public Espion getHabitant(){
        return this.habitant;
    }
}