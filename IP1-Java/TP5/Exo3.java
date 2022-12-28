import java.util.Random;

    public class Exo3 {

	static Random rand = new Random () ;
    
	public static int randRange ( int a , int b ) {
	    return ( rand . nextInt (b - a ) + a ) ;
	}
    
	public static String tirage () {
	    int choixO = randRange (1,6);
	    if (choixO == 1) {
		return "Pierre";
	    }
	    if (choixO == 2) {
		return "Feuille";
	    }
	    if (choixO == 3) {
		return "Lézard";
	    }
	    if (choixO == 4) {
		return "Spock";
	    }
		return "Ciseaux";
	}

	public static String coupOrdi () {
	    
	    
	    String choixO = "";
	    String choixJ = coupJoueur ();
		
	    if (choixJ.equals("Feuille")) {
		return "Ciseaux";
	    }
	    if (choixJ.equals("Pierre")) {
		return "Spock";
	    }
	    if (choixJ.equals("Ciseaux")) {
		return "Pierre";
	    }
	    if (choixJ.equals("Spock")) {
		return "Feuille";
	    }
	    if (choixJ.equals("Feuille")) {
		return "Pierre";
	    }	
	}

	public static String coupJoueur () {
	    System.out.println ("Au tour du joueur, choisissez entre Pierre, Feuille, Ciseaux, Lézard ou Spock.");
	    String choixJ = System.console().readLine();
	    return choixJ;
	}

	public static String manche () {
	    
	    String choixJ = coupJoueur();
	    String choixO = "";

	    if (choixJ.equals("Feuille")) {
		choixO = "Ciseaux";
	    }
	    if (choixJ.equals("Pierre")) {
	        choixO = "Feuille";
	    }
	    if (choixJ.equals("Ciseaux")) {
		choixO = "Pierre";
	    }
	    if (choixJ.equals("Spock")) {
		choixO = "Feuille";
	    }
	    if (choixJ.equals("Lézard")) {
		choixO = "Ciseaux";
	    }
	
	   
	    if (choixO.equals("Pierre")) {
		
		if (choixJ.equals("Feuille")) {
		    return "J";
		}
		
		if (choixJ.equals("Ciseaux")) {
		    return "O";
		}

		if (choixJ.equals("Lézard")) {
		    return "O";
		}
		
		if (choixJ.equals("Spock")) {
		    return "J";
		}
	    }
	    
	    if (choixO.equals("Feuille")) {
	    
		if (choixJ.equals("Pierre")) {
		    return "O";
		}
		
		if (choixJ.equals("Ciseaux")) {
		    return "J";
		}

		if (choixJ.equals("Lézard")) {
		    return "J";
		}
		
		if (choixJ.equals("Spock")) {
		    return "J";
		}

	    }
	    
	    if (choixO.equals("Ciseaux")) {
		
		if (choixJ.equals("Feuille")) {
		    return "O";
		}
		
		if (choixJ.equals("Pierre")) {
		    return "J";
		}

		if (choixJ.equals("Lézard")) {
		    return "O";
		}
		
		if (choixJ.equals("Spock")) {
		    return "J";
		}
	    }

	     if (choixO.equals("Lézard")) {
		
		if (choixJ.equals("Feuille")) {
		    return "O";
		}
		
		if (choixJ.equals("Pierre")) {
		    return "J";
		}

		if (choixJ.equals("Ciseaux")) {
		    return "J";
		}
		
		if (choixJ.equals("Spock")) {
		    return "O";
		}
	    }

	     if (choixO.equals("Spock")) {
		
		if (choixJ.equals("Feuille")) {
		    return "J";
		}
		
		if (choixJ.equals("Pierre")) {
		    return "O";
		}

		if (choixJ.equals("Ciseaux")) {
		    return "O";
		}
		
		if (choixJ.equals("Lézard")) {
		    return "J";
		}
	    }
	     
	    return "E";
	}


	public static void chifoumi () {

	    System.out.print ("Nombre de victoire :");
	    int n = Integer.parseInt(System.console().readLine());
	    int vicO = 0;
	    int vicJ = 0;
	    String res = "";

	    while (vicO < n && vicJ < n) {
		String resu = manche();

		if (resu.equals("J")) {
		    vicJ = vicJ + 1;
		}
		if (resu.equals("O")) {
		    vicO = vicO + 1;
		}
		res = res + resu;
	    }
	    System.out.println (res);
	}
		    

	public static void main (String [] args) {
	    //System.out.println (coupOrdi());
	    //System.out.println (manche());
	    chifoumi ();
	}

}
