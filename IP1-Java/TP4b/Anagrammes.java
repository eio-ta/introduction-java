public class Anagrammes {

    /* Écrivez vos fonctions ici */
    public static int cherche (char c, String s) {

        for (int i = 0; i < s.length(); i = i + 1) {
            if (s.charAt(i) == c) {
                return (i+1);
            }
        }
        return -1;
    }


    public static String suppression (char c, String s) {

        String res = "";
        for (int i = 0; i < cherche (c,s); i++) {
            if (s.charAt(i) != c) {
                res = res + s.substring(i, i + 1);
            }
        }
        for (int j = cherche(c,s); j < s.length(); j++) {
                res = res + s.substring(j, j + 1);
        }
        return res;
    }


    public static boolean scrabble (String mot, String lettres_dispo) {

        for (int i = 0; i < mot.length(); i = i + 1){
            char c = mot.charAt(i);
            if (cherche(c, lettres_dispo) == -1) {
                return false;
            }
            lettres_dispo = suppression(c, lettres_dispo);
        }
        return true;
    }


    public static boolean anagramme (String u, String v) {

        for (int i = 0; i < u.length(); i++) {
            char c = u.charAt(i);
            if (scrabble (u,v) == true) {
                if (u.length() == v.length()) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        System.out.println ("Question 1");
        System.out.println (suppression('a',"baldaquin"));
        System.out.println ("Question 2");
        System.out.println (scrabble("maison", "auiysmzanpo"));
        System.out.println (scrabble("bungalows", "hbteslo"));
        System.out.println ("Question 3");
        System.out.println (anagramme("parisien", "aspirine"));
        System.out.println (anagramme("chaise", "disque"));

    }
}
