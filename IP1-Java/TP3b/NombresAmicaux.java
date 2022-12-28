public class NombresAmicaux {

    /* Écrivez vos fonctions ici */
    public static int sumDiv (int n) {
	
	int somme = 0;
	for (int i=1; i<n; i=i+1) {
	    if (n%i == 0) {
		somme = somme + i;
	    }
	}
        return somme;
    }

    public static void verif (int n, int m) {

	if (sumDiv(n) == m) {
	    System.out.print (n);
	    System.out.print (" et ");
	    System.out.print (m);
	    System.out.println (" sont amicaux.");
	}
	else {
	    System.out.print (n);
	    System.out.print (" et ");
	    System.out.print (m);
	    System.out.println (" ne sont pas amicaux.");
	}
    }
    
    public static void main(String[] args) {

	for (int i = 1; i < 500; i = i + 1) {
	    for (int j = 1; j < 500; j = j + 1) {
	        verif (i,j);
	    }
	}
    }
}
