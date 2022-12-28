public class CharCode {

    public static int charToCode(char c) {
        return (int) c;
    }

    public static char codeToChar(int code) {
        return (char) code;
    }

    /* Écrivez vos fonctions ici */

    public static String minuscule (char c) {

        int asciiChar = (int) c;
        if ( c >= 65 && c <= 90) {
            return "MAJUSCULE";
        }
        if ( c >= 97 && c <= 122) {
            return "minuscule";
        } else {
            return "caractère spécial";
        }
    }

    public static void main(String[] args) {

        /* Écrivez vos tests ici */
        System.out.println ();
        System.out.println ("Question 01");
        System.out.println ();
        System.out.println (charToCode('a'));
        System.out.println (charToCode('m'));
        System.out.println (charToCode('M'));
        System.out.println ();
        System.out.println ();
        System.out.println ("Question 02");
        System.out.println ();
        System.out.println (minuscule('a'));
        System.out.println (minuscule('H'));
        System.out.println (minuscule('é'));
        System.out.println ();
        System.out.println ();
        System.out.println ("Question 03");
        System.out.println ();

        for (int i = 97; i <= 122; i = i + 1) {
            System.out.print (codeToChar(i));
        }
        System.out.println ();
    }
}
