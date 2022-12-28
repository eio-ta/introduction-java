public class LapinBlanc {

    /* Écrivez votre fonction ici */

    public static void secondes (int s) {

	int h = s / 3600;
	s = s - ( h * 3600 );
	int m = s / 60;
	int r = s - ( m * 60);

	System.out.println (h + " " + m + " " + r);
    }

    public static void main(String[] args) {
	    secondes (3725);

        /* Écrivez vos tests */

    }
}
