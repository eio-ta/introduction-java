public class Agent{
    private String nom;
    private Tache[] tachesExecutables;

    Agent(String nom){
	this.nom = nom;
	tachesExecutables = new Tache[0];
    }

    public boolean isEmpty(){
	return this.tachesExecutables.length==0;
    }

    public void ajouteTache(Tache tache){
	Tache[] newTab = new Tache[tachesExecutables.length+1];
	for(int i=0; i<tachesExecutables.length; i++){
	    newTab[i] = tachesExecutables[i];
	}
	newTab[newTab.length-1] = tache;
	this.tachesExecutables = newTab;
    }

    public void retireTache(Tache tache){
	Tache[] newTab = new Tache[tachesExecutables.length-1];
	int comp = 0;
	for(int i=0; i<tachesExecutables.length; i++){
	    if(tache != tachesExecutables[i]){
		newTab[comp] = tachesExecutables[i];
		comp++;
	    }
	}
	this.tachesExecutables = newTab;
    }
    

}
