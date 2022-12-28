public class Trio{
    Etudiant[] membres;
    
    Trio(Etudiant e1, Etudiant e2, Etudiant e3){
	membres = new Etudiant[3];
	membres[0] = e1;
	membres[1] = e2;
	membres[2] = e3;
    }

    Etudiant premier(){
	Etudiant a = membres[0];
	for(int i=0; i<membres.length; i++){
	    if(membres[i].note > a.note){
		a = membres[i];
	    }
	}
	return a;
    }

    int classement(String prenom, String nom){
	boolean a = true;
	int x=0;
	int classement = 1;
	for(int i=0; i<3; i++){
	    if(this.membres[i].prenom.equals(prenom) && this.membres[i].nom.equals(nom)){
		a = false;
		x=i;
	    }
	}
	if(a){
	    return 0;
	}else{
	    for(int i=0; i<3; i++){
		if(membres[i].note > membres[x].note){
		    classement++;
		}
	    }
	    return classement;
	}      
    }

    //En cas de ex-aequo, l'élève ressort avec une meilleure position.

    double moyenne(){
	double x = 0;
	for(int i=0; i<3; i++){
	    x = x + this.membres[i].note;
	}
	return x/3;
    }

    boolean meilleurQueLaMoyenne(){
	double moytrio = moyenne();
	double moypromo = Etudiant.moyenne();
	if(moytrio > moypromo){
	    return true;
	}else{
	    return false;
	}
    }
}
