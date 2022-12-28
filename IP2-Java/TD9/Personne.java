public class Personne {
    private final String prenom, nomDeFamille;
    private Personne mere, pere;

    ////////////////GETTEURS////////////////
    public String getPrenom() {
        return this.prenom;
    }

    public String getNomDeFamille() {
        return this.nomDeFamille;
    }

    public Personne getPere() {
        return this.pere;
    }

    public Personne getMere() {
        return this.mere;
    }
    ////////////////////////////////////////

    public Personne (String prenom, String nomDeFamille) {
        this.prenom = prenom;
        this.nomDeFamille = nomDeFamille;
        this.mere = null;
        this.pere = null;
        
    }

    public Personne (String prenom, String nomDeFamille, Personne pere, Personne mere) {
        this.prenom = prenom;
        this.nomDeFamille = nomDeFamille;
        this.pere = pere;
        this.mere = mere;
    }

        public boolean MemePersonne(Personne p) { //Teste si deux personnes sont égales
        return (this.getPrenom().equals(p.getPrenom()) && this.getNomDeFamille().equals(p.getNomDeFamille()));
    }

    public boolean estFrereOuSoeur(Personne p) {
        return (this.getPere().MemePersonne(p.getPere()) && this.getMere().MemePersonne(p.getMere()));
    }

    public boolean estCousinGermain(Personne p) {
        if((p.getPere().getPere() == null || p.getPere().getMere() == null) && (p.getMere().getPere() != null || p.getMere().getMere() != null)) {
            if(p.getMere().estFrereOuSoeur(this.getPere())) return true;
            if(p.getMere().estFrereOuSoeur(this.getMere())) return true;
            return false;
        }
        if ((p.getMere().getPere() == null || p.getMere().getMere() == null) && (p.getPere().getPere() != null || p.getPere().getMere() != null)) {
            if(p.getPere().estFrereOuSoeur(this.getPere())) return true;
            if(p.getPere().estFrereOuSoeur(this.getMere())) return true;
            return false;
        } else {
            if(p.getMere().estFrereOuSoeur(this.getPere())) return true;
            if(p.getMere().estFrereOuSoeur(this.getMere())) return true;
            if(p.getPere().estFrereOuSoeur(this.getPere())) return true;
            if(p.getPere().estFrereOuSoeur(this.getMere())) return true;
            return false;
        }
    }


    public int nbAscendantsVivants() {
        int noeud_pere = 0; int noeud_mere = 0;
        if(this.getPere() != null) noeud_pere = 1+this.getPere().nbAscendantsVivants();
        if(this.getMere() != null) noeud_mere = 1+this.getMere().nbAscendantsVivants();
        return noeud_mere + noeud_pere;
    }

    public boolean possedeCommeAscendant(Personne p) {
        if(this.getPere() != null) {
            if(this.getPere().MemePersonne(p)) return true;
            if(this.getPere() != null) return getPere().possedeCommeAscendant(p);
        }
        if(this.getMere() != null) {
            if(this.getMere().MemePersonne(p)) return true;
            if(this.getMere() != null) return getMere().possedeCommeAscendant(p);
        }
        return false;
    }

    public int distanceDAscendance(Personne p){
        int a = 0;
        if(this.possedeCommeAscendant(p)) {
            Personne tmp = this;
            while(!tmp.getPere().MemePersonne(p)) {
                if(tmp.getPere().possedeCommeAscendant(p)) {
                    tmp = tmp.getPere();
                    a += 1;
                }
                if(tmp.getMere().possedeCommeAscendant(p)) {
                    tmp = tmp.getMere();
                    a += 1;
                }
            }
        }
        return a+1;
    }

    public void afficheAscendantUn(Personne p) {
        if(this.possedeCommeAscendant(p)) {
            Personne tmp = this;
            while(!tmp.getPere().MemePersonne(p)) {
                if(tmp.getPere().possedeCommeAscendant(p)) {
                    System.out.print("enfant de " + tmp.getPrenom() + " " + tmp.getNomDeFamille() + ", ");
                    tmp = tmp.getPere();
                }
                if(tmp.getMere().possedeCommeAscendant(p)) {
                    System.out.print("enfant de " + tmp.getPrenom() + " " + tmp.getNomDeFamille() + ", ");
                    tmp = tmp.getMere();
                }
            }
            System.out.print("enfant de " + p.getPrenom() + " " + p.getNomDeFamille() + ", ");
        }
        System.out.println();
    }

    public boolean estSansParent() {
        return ((pere == null) && (mere == null));
    }

    public int nbDeGenerations() {
        if(this.estSansParent()) return 1;
        int nb_mere = 0; int nb_pere = 0;
        if(this.pere != null) nb_pere = this.getPere().nbDeGenerations();
        if(this.getMere() != null) nb_mere = this.getMere().nbDeGenerations();
        return 1+Math.max(nb_pere, nb_mere);
    }

}
