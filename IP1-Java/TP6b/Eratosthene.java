public class Eratosthene {

    // Écrivez vos fonctions ici

    public static int premier (int p) {

        for(int i=2; i<p; i++) {
            if (p%i == 0) {
                return 0;
            }
        }
        return p;
    }


    public static int[] crible (int n) {

        int[] era = new int [n-1];
        int number = 2;

        for(int i=0; i<era.length; i++) {
            era[i] = premier(number);
            number = number+1;
        }
        return era;
    }

    public static void prime (int n) {
	int compteur = 0;
	int number = 2;
	
	    while(compteur<=10) {
		if (premier(number)!=0) {
		    System.out.print(number);
		    System.out.println(" est premier.");
		    compteur = compteur+1;
		    number = number+1;
		}else {
		    number = number+1;
		}
	    }
    }


    public static void printIntArray (int[] a){

	    for(int i = 0; i<a.length; i++){
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
    }

    public static void main(String[] args) {
        printIntArray(crible(10));
        prime(10);
	
        
    }
}
