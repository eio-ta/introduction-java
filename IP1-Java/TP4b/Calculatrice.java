public class Calculatrice {

    /* Écrivez vos fonctions ici */
    public static int somme (String s) {

        if (s.charAt(0) == '+' || s.charAt(s.length()-1) == '+') {
            return -1;

        } else {
           int somme = 0;
            for (int i = 0; i < s.length(); i = i + 2) {
               char c = s.charAt(i);
               int b = Character.getNumericValue(c);
               somme = somme + b;
           }
           return somme;
        }
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        System.out.println (somme("3+8"));
        System.out.println (somme("+7+8"));
        System.out.println (somme("4+3+9+"));

    }
}
