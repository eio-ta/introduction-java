public class CadreBonus {
    
    /* Écrivez vos fonctions ici */
    public static void line (int n) {
	for (int i = 0; i < n; i = i + 1) {
	    System.out.print("#");
	}
	System.out.println ();
    }

    public static String characterAtPos (String s, int i) {
	String res = "";
	if (i >=0 && i < s.length ()) {
	    res = String.valueOf(s.charAt (i));
	}
	return res;
    }

    public static void frame (String s) {

	//PARTIE  01
	System.out.print ("+" + "-");
	for (int i=0; i<(s.length()/2); i=i+1) {
	    System.out.print ("-");
	}
	System.out.print ("-" + "+");
	System.out.println ();

	//PARTIE 02
	System.out.print ("|" + " ");
	for (int j=0; j<(s.length()/2); j=j+1) {
	    System.out.print (characterAtPos (s,j));
	}
	System.out.print (" " + " " + "|");
	System.out.println ();

	//PARTIE 03
	System.out.print ("|" + " ");
	for (int j=6; j<s.length(); j=j+1) {
	    System.out.print (characterAtPos (s,j));
	}
	System.out.print ("|");
	System.out.println ();	

	//PARTIE 04
	System.out.print ("+" + "-");
	for (int i=0; i<(s.length()/2); i=i+1) {
	    System.out.print ("-");
	}
	System.out.print ("-" + "+");
	System.out.println ();
    }
    
    public static void main(String[] args) {
	/* Écrivez vos tests ici */
        line (7);
	frame ("Hello\nWorld !");
    }
}
	
