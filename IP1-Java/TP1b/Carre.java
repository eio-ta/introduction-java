/*

   Ce programme lit un entier tapé au clavier et l'affiche

*/
public class Carre{
    // Le point d'entrée du programme.
    public static void main (String[] args) {

       	System.out.println("Largeur ?");
	int x = Integer.parseInt(System.console ().readLine ());
		System.out.println("Longueur ?");
	int y = Integer.parseInt(System.console ().readLine ());
	
       	// On affiche la premiere ligne
	for(int i=0;i<x;i=i+1){
	    System.out.print("#");
	}
	System.out.println();

	// On cree une ligne vide
	String ch = "#";

	for(int i=0;i<x-2;i=i+1){
	    ch = ch + "#";
	}

	ch = ch + "#";

	// On affiche les 8 lignes vides
	for(int i=0;i<x-2;i=i+1){
	    System.out.println(ch);
	}

	//On affiche la derniere ligne
	// On affiche la premiere ligne 
	for(int i=0;i<y;i=i+1){
	    System.out.print("#");
	}
	System.out.println();
    }
}
