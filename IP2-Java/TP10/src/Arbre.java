import java.util.LinkedList;

public class Arbre {
	private Noeud premier;
	
	public Arbre (Noeud premier) {
		this.premier = premier;
	}
	
	public void affichePenche() {
		this.premier.affiche(0);
	}
	
	public void afficheLargeur() {
		LinkedList<Noeud> noeuds = new LinkedList<Noeud>();
    	Noeud tmp;
    	noeuds.offer(this.premier);
    	while (! noeuds.isEmpty() ){
    		tmp = noeuds.poll();
    		System.out.print( tmp.getEtiquette());
    		if ( tmp.getGauche() != null ) noeuds.offer( tmp.getGauche() );
    		if ( tmp.getDroit() != null ) noeuds.offer( tmp.getDroit());
    	}
	}
	
	public int profondeur() {
		return this.premier.profondeur();
	}
	
	public void afficheTopDown() {
		LinkedList<Paire> p = new LinkedList<Paire>();
    	Paire tmp;
    	p.offer(new Paire(this.premier,0));
    	int hautCour = -1;
    	while (! p.isEmpty() ){
    		tmp = p.poll();
    		Noeud tmpN = tmp.getNoeud();
    		if (tmp.getValeur() != hautCour) {
    			hautCour = tmp.getValeur();
    			System.out.print("\n");  
    		}
    		System.out.print(tmpN.getEtiquette());  
    		if ( tmp.getGauche() != null ) p.offer(new Paire(tmpN.getGauche(), tmp.getValeur()+1));
    		if ( tmp.getDroit() != null ) p.offer(new Paire(tmpN.getDroit(), tmp.getValeur()+1));
    	}
	}
	
}
