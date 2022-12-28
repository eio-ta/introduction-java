public class Accord {

    /* Écrivez vos fonctions ici */
    public static void withSIfNeeded (String s, int n) {
	if (n >= 2) {
	    System.out.println (s + "s");
	}
	else {
	    System.out.println (s);
	}
    }

    public static void main(String[] args) {
        /* Écrivez vos tests ici */
	withSIfNeeded ("pomme",2);
	withSIfNeeded ("poire",1);

    }
}
