public class ADN {

    /* Écrivez vos fonctions ici */
    public static boolean estADN (String s) {

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != 'A' && c != 'T' && c != 'C' && c != 'G'){
                return false;
            }
        }
        return true;
    }

    public static int masseMolaire (String s) {

        int somme = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                somme = somme + 135;
            }
            if (s.charAt(i) == 'T') {
                somme = somme + 126;
            }
            if (s.charAt(i) == 'G') {
                somme = somme + 151;
            }
            if (s.charAt(i) == 'C') {
                somme = somme + 111;
            } else {
                somme = somme;
            }
        }
        return somme;
    }


    public static String brinComp (String s) {

        String st = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                st = st + "T";
            }
            if (s.charAt(i) == 'T') {
                st = st + "A";
            }
            if (s.charAt(i) == 'G') {
                st = st + "C";
            }
            if (s.charAt(i) == 'C') {
                st = st + "G";
            }
        }
        return st;
    }


    public static boolean sous_sequence (String s, String st) {

        String s2 = brinComp (s);
        return s2.equals(st);
    }



    public static void main(String[] args) {

        /* Écrivez vos fonctions ici */
        System.out.println ("Question 01");
        System.out.println (estADN("TTGAC"));
        System.out.println (estADN("GCAATAG"));
        System.out.println (estADN("AMOG"));
        System.out.println (estADN("CaTg"));

        System.out.println ();
        System.out.println ("Question 02");
        System.out.println (masseMolaire("AGATC"));

        System.out.println ();
        System.out.println ("Question 03");
        System.out.println (brinComp("A"));
        System.out.println (brinComp("AAGT"));

        System.out.println ();
        System.out.println ("Question 04");
        System.out.println (sous_sequence("ATC", "TAG"));
        System.out.println (sous_sequence("AGC", "AAT"));

    }
}
