public class Signes {

    // Écrivez vos fonctions ici
    public static int[] samesign (int[] t1, int[] t2) {

        
        if (t1.length != t2.length) {
            int[] t3 = new int [0];
            return t3;

        } else {
            int[] samesign = new int [t1.length];
            for (int i=0; i<t1.length; i++) {
                if (t1[i]*t2[i]<0) {
                    samesign[i] = -1;
                } else {
                    samesign[i] = 1;
                }
            }
        return samesign;
        }
        
    }

    public static void printIntArray (int[] a){
	    for (int i = 0; i<a.length ; i++){
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
    }

    public static void main(String[] args) {
        int[] t1 = {1000,1,-1,1};
        int[] t2 = {-1,1,-1,-1000};
        printIntArray(samesign(t1,t2));
    }
}
