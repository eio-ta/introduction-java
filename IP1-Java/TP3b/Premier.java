public class Premier {
    
    /* Écrivez vos fonctions ici */
    public static boolean isPrime (int n) {
	boolean isPrime = true;

	//Partie négative
	if (n < 2) {
	    isPrime = false;
	}

	//Partie 2 à +
	    for (int i = 2; i <= n / 2; i = i + 1) {
		if (n != i && n % i == 0) {
		    isPrime = false;
		    break;
		}
	    }
       
	    return isPrime;
	
    }
    

    public static void main(String[] args) {
	
	 /* Écrivez vos tests ici */
	System.out.println (isPrime (17));
	System.out.println (isPrime (12));
	System.out.println (isPrime (1));
    }
}
