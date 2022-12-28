public class Noeud {
    private int etiquette;
    private Noeud gauche;
    private Noeud droit;

    public Noeud (int etiquette, Noeud g, Noeud d) {
        this.etiquette = etiquette;
        this.gauche = g;
        this.droit = d;
    }

    public Noeud (int etiquette) {
        this(etiquette, null, null);
    }

    public void afficheInfixe() {
        if (gauche != null) gauche.afficheInfixe();
        System.out.print(this.etiquette + ", ");
        if (droit != null) droit.afficheInfixe();
    }

    public void affichePrefixe() {
        System.out.print(this.etiquette + ", ");
        if (gauche != null) gauche.affichePrefixe();
        if (droit != null) droit.affichePrefixe();
    }

    public void affichePostfixe() {
        if (gauche != null) gauche.affichePostfixe();
        if (droit != null) droit.affichePostfixe();
        System.out.print(this.etiquette + ", ");
    }

    public int nbDeNoeuds(){
        int tmp = 0; int tmp2 = 0;
        if (gauche != null) tmp = gauche.nbDeNoeuds();
        if (droit != null) tmp2 = droit.nbDeNoeuds();
        return tmp+tmp2+1;
    }

    public int somme(){
        int somme = 0;
        if (gauche != null) somme = somme + gauche.somme();
        if (droit != null) somme = somme + droit.somme();
        return somme + this.etiquette;
    }

    //QUESTION 6

    public boolean recherche(int e) {
        if(this.etiquette == e) return true;
        boolean testg = false; boolean testd = false;
        if(gauche != null) testg = gauche.recherche(e);
        if(droit != null) testd = droit.recherche(e);
        return (testg || testd);
    }

    public Noeud(int[] tab) {
        if(tab.length == 0){
            return;
        } else if(tab.length == 2){
            System.out.println("Longueur 2");
            this.etiquette = tab[0];
            droit = new Noeud(tab[1]);
            gauche = null;
        } else if(tab.length == 1){
            System.out.println("Longueur 1");
            this.etiquette = tab[0];
            gauche = null;
            droit = null;
        } else {
            System.out.println("Longueur bizarre");
            int r = tab.length/2;
            this.etiquette = tab[r];
            System.out.println(this.etiquette);

            int[] tabG = new int[r];
            for(int i=0; i<r; i++) {
                tabG[i] = tab[i];
                System.out.print(tabG[i] + ", ");
            }
            this.gauche = new Noeud(tabG);

            int[] tabD = new int[tab.length-r];
            int j = 0;
            for(int i=r+1; i<tab.length; i++){
                tabD[j] = tab[i];
                System.out.print(tabD[j] + ", ");
                j++;
            }
            System.out.println("droite");
            this.droit = new Noeud(tabD);
        }
    }
}