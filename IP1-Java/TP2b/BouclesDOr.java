public class BouclesDOr {

    /* Écrivez vos fonctions ici */

 
    public static void filter_even (int n) {

	int i = n;
	for (i = 0; i < 65635; i = i + 1) {
	    if (n % 2 == 0) {
		System.out.println (n);
		    }
	    else {
		System.out.println ("...");
		    }
	}
    }


    public static void main(String[] args) {
        filter_even (57);
    }
}


