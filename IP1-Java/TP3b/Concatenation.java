public class Concatenation {

    /* Écrivez vos fonctions ici */

    public static void concatNTimes (String s, int n) {
	int nombredefois = 0 + n;
	if (n < 0) {
	System.out.println ();
	}
	else {
	    for (int i = 0; i < n; i = i + 1) {
		System.out.print (s);
	    }
	}
    }

    public static void main(String[] args) {
	
	/* Écrivez vos tests ici */
	concatNTimes ("manger",6);

        

    }
}
