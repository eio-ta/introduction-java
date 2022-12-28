import java.util.Random;

    public class Exo1 {

	static Random rand = new Random () ;
    
	public static int randRange ( int a , int b ) {
	    return ( rand . nextInt (b - a ) + a ) ;
	}
    
	public static String tirage () {
	    System.out.println ("Au tour de l'ordinateur. ");
	    int choixO = randRange (1,4);
	    if (choixO == 1) {
		return "Pierre";
	    }
	    if (choixO == 2) {
		return "Feuille";
	    }
		return "Ciseaux";
	}

	public static String coupJoueur () {
	    System.out.println ("Au tour du joueur, choisissez entre Pierre, Feuille ou Ciseaux.");
	    String choixJ = System.console().readLine();
	    return choixJ;
	}

	public static String uneManche () {
	    String choixO = tirage();
	    String choixJ = coupJoueur();
	   
	    
	    if (choixO.equals("Pierre")) {
		
		if (choixJ.equals("Feuille")) {
		    System.out.println ("La feuille enveloppe la pierre.");
		    return "J";
		}
		
		if (choixJ.equals("Ciseaux")) {
		    System.out.println ("La pierre émousse les ciseaux.");
		    return "O";
		}
	    }
	    
	    if (choixO.equals("Feuille")) {
	    
		if (choixJ.equals("Pierre")) {
		    System.out.println ("La feuille enveloppe la pierre.");
		    return "O";
		}
		
		if (choixJ.equals("Ciseaux")) {
		    System.out.println ("Les ciseaux coupent la feuille.");
		    return "J";
		}
	    }
	    
	    if (choixO.equals("Ciseaux")) {
		
		if (choixJ.equals("Feuille")) {
		    System.out.println ("Les ciseaux coupent la feuille.");
		    return "O";
		}
		
		if (choixJ.equals("Pierre")) {
		    System.out.println ("La pierre émousse les ciseaux.");
		    return "J";
		}
	    }
	    return "E";
	}

	public static void main (String [] args) {
	    //System.out.println (tirage());
	    //System.out.println (coupJoueur ());
	    System.out.println (uneManche ());
	}

}
