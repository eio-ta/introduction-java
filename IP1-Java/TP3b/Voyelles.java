public class Voyelles {
    /*Voyelles : A, E, I, O, U, Y


    /* Écrivez vos fonctions ici */
    public static String characterAtPos (String s, int i) {
	String res = "";
	if (i >= 0 && i < s.length ()) {
	    res = String.valueOf(s.charAt (i));
	}
	return res;
    }

    
    public static void vowels (String s) {
	int voye = 0;
	for (int j = 0; j < s.length(); j = j + 1) {
	    if ( s.charAt(j) == 'a' || s.charAt(j) == 'A' || s.charAt(j) == 'e' || s.charAt(j) == 'E' || s.charAt(j) == 'i' || s.charAt(j) == 'I' || s.charAt(j) == 'o' || s.charAt(j) == 'O' || s.charAt(j) == 'u' || s.charAt(j) == 'U' || s.charAt(j) == 'y' || s.charAt(j) == 'Y') {
		voye = voye + 1;
	    }
	    else {
		voye = voye + 0;
	    }
	}
	System.out.println (voye);
    }

    
    public static void main(String[] args) {

        /* Écrivez vos tests ici */
	vowels ("Hello World !");
    }
}
