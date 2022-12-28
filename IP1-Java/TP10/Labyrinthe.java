import java.util.*;
import java.io.*;
import java.util.Random;

public class Labyrinthe{
    //Cette fonction prend en argument le nom d'un fichier
    //contenant la description d'un labyrinthe
    //et renvoie la liste de liste d'entiers correspondante
    public static int[][]chargeLabyrinthe(String nomFichier){
	int[][]labyrinthe={};
	try{
	    Scanner sc=new Scanner(new File(nomFichier)).useDelimiter("\n");
	    int c=0;
	    //On compte le nombre de lignes
	    while(sc.hasNext()){
		c=c+1;
		String tmp=sc.next();
	    }
	    labyrinthe=new int[c][];
	    sc=new Scanner(new File(nomFichier)).useDelimiter("\n");
	    int i=0;
	    while(sc.hasNext()){
		String ligne=sc.next();
		String[] splitLigne=ligne.split(",");
		labyrinthe[i]=new int[splitLigne.length];
		for(int j=0;j<splitLigne.length;j=j+1){
		    labyrinthe[i][j]=Integer.parseInt(splitLigne[j]);
		}
		i=i+1;
	    }
	    
	}
	catch(Exception e){
	    System.out.println("Probleme dans la lecture du fichier "+nomFichier);
	    e.printStackTrace();
	}
	return labyrinthe;
	}

    
    public static void afficheLab(int[][] lab){
	for(int i=0; i<lab.length; i++){
	    for(int j=0; j<lab[i].length; j++){
		if(lab[i][j] == 0) {
		    System.out.print("X");
		}else{
		    System.out.print(" ");
		}
	    }
	    System.out.println();
	}
    }
    
    public static int[][] copieLab(int[][] lab){
	int[][] copie = new int[lab.length][];
	for(int i=0; i<lab.length; i++){
	    copie[i] = new int[lab[i].length];
	    for(int j=0; j<lab[i].length; j++){
		copie[i][j] = lab[i][j];
	    }
	}
	return copie;
    }

    public static int caseHaut(int[][] lab, int l, int c){
	//0<=l<=29, 0<=c<=29
	if(l==0 || l>29){
	    return -1;
	}else{
	    return lab[l-1][c];
	}
    }
    
    public static int caseBas(int[][] lab, int l, int c){
	//0<=l<=29, 0<=c<=29
	if(l==29){
	    return -1;
	}else{
	    return lab[l+1][c];
	}
    }
    
    public static int caseGauche(int[][] lab, int l, int c){
	//0<=l<=29, 0<=c<=29
	if(c==0 || c>29){
	    return -1;
	}else{
	    return lab[l][c-1];
	}
    }
    
    public static int caseDroite(int[][] lab, int l, int c){
	//0<=l<=29, 0<=c<=29
	if(c>=29){
	    return -1;
	}else{
	    return lab[l][c+1];
	}
    }
    
    public static int[][] voisinsLibres(int[][] lab, int l, int c){
	int compteur = nombredevoisins(lab, l, c);
	int[][] res = new int[compteur][2];
	compteur = 0;
	
	if (caseHaut(lab,l,c) == 1){
	    res[compteur][0] = l-1;
	    res[compteur][1] = c;
	    compteur = compteur+1;
	}
	if (caseBas(lab,l,c) == 1){
	    res[compteur][0] = l+1;
	    res[compteur][1] = c;
	    compteur = compteur+1;
	}
	if (caseGauche(lab,l,c) == 1){
	    res[compteur][0] = l;
	    res[compteur][1] = c-1;
	    compteur = compteur+1;
	}
	if (caseDroite(lab,l,c) == 1){
	    res[compteur][0] = l;
	    res[compteur][1] = c+1;
	    compteur = compteur+1;
	}
	return res;	 
    }
    
    public static void changeVoisins(int[][] lab, int l, int c, int i){
	int[][] memo = voisinsLibres(lab, l, c);
	for(int k=0; k<memo.length; k++){
	    if (lab[memo[k][0]][memo[k][1]] == 1){
		lab[memo[k][0]][memo[k][1]] = i+1;
	    }
	}
    }
    
    public static void etapeParcours(int[][] lab, int i){
	for(int k=0; k<lab.length; k++){
	    for(int j=0; j<lab[k].length; j++){
		if(lab[k][j] == i){
		    changeVoisins(lab, k, j, i);
		}
	    }
	}
    }
    
    public static boolean finParcours(int[][] lab){
	
	if(lab[lab.length-1][lab.length-1] != 1){
	    return true;
        }
        
	for(int i=0; i<lab.length; i++){
	    for(int j=0; j<lab[i].length; j++){
		if(lab[i][j]>=1){
		    int nb = nombredevoisins(lab, i, j);
		    if(nb == 0){
			return false;
		    }
		}
	    }
	}
	return true;
    }
    

    public static int parcours(int[][] lab){
	lab[0][0] = 2;
	int i = 2;
	while(finParcours(lab) == false){
	    etapeParcours(lab, i);
	    i++;
	}
	int caseminimal = lab[lab.length-1][lab.length-1]-2;
	return caseminimal;
    }
    
    public static int[][] genereLab(int n, int m, int a){
	int[][] lab = new int[n][m];
	lab[0][0] = 1;
	lab[n-1][m-1] = 1;

	//Tirage de a cases au hasard
	for(int i=0; i<a; i++){
	    int l = randInt(0,lab.length-1);
	    int c = randInt(0,lab.length-1);
	    if(lab[l][c] == 0){
		lab[l][c] = 1;
	    }
	}

	//Vérifions si le lab est true
	while(finParcours(lab) == false){
	    for(int i=0; i<a; i++){
	        int l = randInt(0,lab.length-1);
	        int c = randInt(0,lab.length-1);
		if(lab[l][c] == 0){
		    lab[l][c] = 1;
		}
	    }
	}
	
	return lab;
    }

    
  
    
    //FONCTIONS AJOUTEES
    public static void printA(int[][] array){
	for(int i=0; i<array.length; i++){
		for(int j=0; j<array[i].length; j++){
			System.out.print(array[i][j]);
			System.out.print(" ");
		    }
		    System.out.println();
	    }
    }

    static Random rand = new Random ();

    public static int randInt (int min, int max) {
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public static int nombredevoisins(int[][] lab, int l, int c){
	int compteur = 0;
	if (caseHaut(lab,l,c) == 1){
	    compteur = compteur+1;
	}
	if (caseBas(lab,l,c) == 1){
	    compteur = compteur+1;
	}
	if (caseGauche(lab,l,c) == 1){
	    compteur = compteur+1;
	}
	if (caseDroite(lab,l,c) == 1){
	    compteur = compteur+1;
	}
	return compteur;
    }

    
    public static void main(String[] args){
	int[][] lab = chargeLabyrinthe("labyrinthe1.csv");
	int[][] copie = copieLab(lab);
        int[][] generelab = genereLab(30, 30, 5);
	printA(generelab);
	afficheLab(generelab);
	System.out.println(finParcours(generelab));
	
	
    }
}
