public class Recherche {

    /* Écrivez vos fonctions ici */
    public static int cherche (char c, String s) {

        for (int i = 0; i < s.length(); i = i + 1) {
            if (s.charAt(i) == c) {
                return (i+1);
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        System.out.println ("La lettre recherchée est à la position " + cherche('a',"cheval"));
        System.out.println ("La lettre recherchée est à la position " + cherche('a',"école"));

    }
}
