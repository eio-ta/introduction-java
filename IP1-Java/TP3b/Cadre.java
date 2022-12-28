public class Cadre {
    
    /* Écrivez vos fonctions ici */
    public static void line (int n) {
	for (int i = 0; i < n; i = i + 1) {
	    System.out.print("#");
	}
	System.out.println ();
    }

    public static void frame (String s) {

	//PARTIE  01
	System.out.print ("+" + "-");
	for (int i=0; i<s.length(); i=i+1) {
	    System.out.print ("-");
	}
	System.out.print ("-" + "+");
	System.out.println ();

	//PARTIE 02
	System.out.print ("|" + " ");
	System.out.print (s);
	System.out.print (" " + "|");
	System.out.println ();

	//PARTIE 03
	System.out.print ("+" + "-");
	for (int i=0; i<s.length(); i=i+1) {
	    System.out.print ("-");
	}
	System.out.print ("-" + "+");
	System.out.println ();
    }
    
    public static void main(String[] args) {
	/* Écrivez vos tests ici */
        line (7);
	frame ("Hello World !");
    }
}
	

