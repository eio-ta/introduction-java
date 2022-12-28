public class Decalage {

    // Écrivez vos fonctions ici

    public static int[] shift(int[] t) {

        int[] t1 =new int[t.length];
        
        for(int i=0; i<t.length-1; i++) {
            t1[i+1]=t[i];
        }
        t1[0] = t[t.length-1];

        return t1;
    }

    public static int[] shiftn(int[] t, int n) {

        int[] t1 =new int[t.length];
        int suite = t.length-n;
        int number = suite;
        for(int i=0; i<t.length; i++) {
            t1[i]=t[i];
        }

        for (int i=0; i<t.length-n; i++) {
            t1[i+n]=t[i];
        }

        for(int i=0; i<suite; i++) {
            t1[i] = t[number];
            number = number+1;
        }
        return t1;
    }


    public static void printIntArray (int[] a){
	    for (int i = 0; i<a.length ; i++){
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
    }

    public static void main(String[] args) {
        int[] t = {1000,1,2,3};
        printIntArray(shift(t));

        printIntArray(shiftn(t,4));
    }
}
