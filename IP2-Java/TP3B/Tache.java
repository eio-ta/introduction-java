public class Tache{
    private final String nom;
    private Tache[] necessairePour;
    private static int numéro;
    private final int numéroDeTache;
    private int nbDependances;
    private Agent agent;

    Tache(String nom, Agent agent){
	this.nom = nom;
	necessairePour = new Tache[0];
	numéro++;
	numéroDeTache = numéro;
	nbDependances = 0;
	this.agent = agent;
		
    }

    public void declareNecessairePour(Tache t1){
	Tache[] newtab = new Tache[necessairePour.length+1];
	for(int i=0; i<necessairePour.length; i++){
	    newtab[i] = necessairePour[i];
	}
	newtab[newtab.length-1] = t1;
	this.necessairePour = newtab;
        t1.nbDependances++;
	if(t1.estExecutable()){
	    t1.agent.retireTache(t1);
	}
    }

    public void afficher(){
	System.out.print("Tâche " + this.numéroDeTache + ": " + this.nom + ". ");
	if(necessairePour.length>0){
	    System.out.print("Est nécessaire avant les tâches ");
	    for(int i=0; i<necessairePour.length; i++){	 
		System.out.print(this.necessairePour[i].numéroDeTache);
		if(i+1<necessairePour.length){
		    System.out.print(", ");
		}
	    }
	}
	System.out.println();
    }

    public boolean estExecutable(){
	return this.nbDependances==0;
    }

    public void faire(){
	System.out.println("Agent " + this.agent + " : " + this.nom);
	t1.agent.retireTache(t1);
	
	
	
    }
}
