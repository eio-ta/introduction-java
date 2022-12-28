public class Moyenne {

    /* Écrivez vos fonctions ici */

    
    public static void moyenne ( int x, int y, int z, int a, int b) {

	int somme = x + y + z + a + b;
	System.out.println (somme);

	int moy = ( x + y + z + a + b)/5;
	System.out.println (moy);
    }
        
	
    public static void main(String[] args) {
	moyenne (10, 12, 8, 9, 19);

        /* Écrivez vos tests et le code à exécuter ici */

    }
}
