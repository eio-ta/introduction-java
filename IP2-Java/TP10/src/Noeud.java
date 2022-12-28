import java.util.LinkedList;

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
    
    //////////////////////////GETTEURS//////////////////////////
    public int getEtiquette() {
    	return this.etiquette;
    }
    
    public Noeud getDroit() {
    	return this.droit;
    }
    
    public Noeud getGauche() {
    	return this.gauche;
    }
    
    ////////////////////////////////////////////////////////////
    
    public void espace(int n) {
    	while(n != 0) {
    		System.out.print(" ");
    		n -= 1;
    	}
    }
    
    public boolean estFeuille() {
    	return ((gauche == null) && (droit == null));
    }
    
    
    public int profondeur() {
    	if (estFeuille()) return 1;
    	int hg = 0; int hd = 0;
    	if (gauche != null) hg = gauche.profondeur();
    	if (droit != null) hd = droit.profondeur();
    	return 1+Math.max(hg,hd);
    }
    
    public void affiche(int esp) {
    	if(droit != null) this.droit.affiche(esp + 1);
    	espace(esp);
    	System.out.println(this.etiquette);
    	if(gauche != null) this.gauche.affiche(esp + 1);
    }
    
    
}