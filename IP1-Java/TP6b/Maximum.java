public class Maximum {

    // Écrivez vos fonctions ici
    public static int maximum (int[] tab) {

        int number = tab[0];
        int indice = 0;

        for (int i=1; i<tab.length; i++) {
            if (number<tab[i]) {
                number = tab[i];
                indice = i;
            } else {
                number=number;
            }
        }
        return indice;
    }

    public static void main(String[] args) {
        int[] tab = {1000,7,1,1,1};
        System.out.print ("Le maximum est à l'indice : ");
        System.out.println (maximum(tab));
    }
}
