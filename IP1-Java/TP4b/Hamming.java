public class Hamming {

    /* Écrivez vos fonctions ici */
    public static int hamming (String s, String st) {

        if (s.length() != st.length()) {
            return -1;
        } else {
            int somme = 0;
            for (int i = 0; i < s.length(); i = i + 1) {
                    if (s.charAt(i) != st.charAt(i)) {
                        somme = somme + 1;
                    } else {
                        somme = somme;
                    }
            }
            return somme;
        }
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */
            System.out.println ("Il y a " + hamming("aaba", "aaha") + " lettre(s) de différence.");
            System.out.println ("Il y a " + hamming("poire","pomme") + " lettre(s) de différence.");
            System.out.println ("Il y a " + hamming("stylo","bouteille") + " lettre(s) de différence.");

    }
}
