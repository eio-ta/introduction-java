import java.util.Random;
public class RandomArray {
 static Random rand = new Random();

/* ************************************************************************** */
  

    //  QUESTION 1 
    public static int[] createRandomArray(int n) {
        int[] tab = new int [n];
        for (int i = 0; i<tab.length; i++) {
            tab[i] = rand.nextInt(n);
        }
        return tab;
    }
	

    // QUESTION 2
    public static int[] minMaxAverage(int[] a) {

        int min = 1000;
        int max = 0;
        int[] tab2 = new int [3];

        for (int i = 0; i<a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        tab2[0] = min;
        tab2[1] = max;
        tab2[2] = (tab2[0]+tab2[1])/2;
        return tab2;
    }
    
 
    // QUESTION 3
    public static int[] occurrences(int[] a) {
        int[] b = new int [( 1+(minMaxAverage(a))[1])];
	 for (int i = 0; i < b.length; i++) {
	     b[i]=0;
	 }
	 for (int j = 0; j <a.length; j++) {
	     b[a[j]]++;
        }
        return b;
    }
  
    // QUESTION 4a
    public static int[] countingSort(int[] a) {

        int[] b = occurrences(a);
        int[] c = new int [a.length];
        int d = 0;
    
        for (int i=0; i<b.length; i++) {
            
            for (int j=0; j<b[i]; j++) {
                c[d] = i;
                d = d + 1;
            }
        }
        return c;
    }
  
    // QUESTION 4b
    public static void countingSort2(int[] a) {
        int[] b = occurrences(a);
        int[] c = new int [a.length];
        int d = 0;
    
        for (int i=0; i<b.length; i++) {
            
            for (int j=0; j<b[i]; j++) {
                c[d] = i;
                d = d + 1;
            }
        }

        for (int i = 0; i<c.length ; i++){
	        System.out.print(c[i] + " ");
	    }
	    System.out.println();
    }


      /******************************************/
      /*     Fonctions auxiliaires              */
      /******************************************/
	
    public static boolean  intArrayEquals (int[] a, int[] b){
    	if (a.length!=b.length) {
	        return false;
		}
	    for (int i=0; i<a.length; i++){
	        if (a[i]!=b[i]){
	        	return false;
	        }
	    }
	    return true;
    }
  
    public static void printIntArray (int[] a){
	    for (int i = 0; i<a.length ; i++){
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
    }

    /* ********************************************************** */
    /*      Fonction Principale                                   */
    /* ********************************************************** */


    public static void main(String[] args){
        //QUESTION 01
        //System.out.println("Entrez un entier positif (la taille du tableau):");
        //int n = Integer.parseInt(System.console().readLine());
        //int[] a = createRandomArray(n);	
        //printIntArray(a);

        //System.out.println ();

        //QUESTION 02
        //printIntArray(minMaxAverage(createRandomArray(100)));

        //System.out.println ();

        //QUESTION 03
        //int[] a = {1,3,0,0,0,1};
        //printIntArray(occurrences(a));

        //System.out.println ();

        //QUESTION 04-a
        //printIntArray(countingSort(a));

        //QUESTION 04-b
        //countingSort2(a);

        //VÉRIFICATION
        int[] a = createRandomArray(100);
        int[] b = countingSort(a);
        countingSort2(a);
        System.out.println(intArrayEquals(a,b));
    }


}
