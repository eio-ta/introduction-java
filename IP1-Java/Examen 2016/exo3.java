public class exo3 {

    public static void sumPrevious(int k, int i, int[] f){
        int somme = 0;
        for(int j=1; j<=k; j++){
            somme = somme+f[i-j];
        }
        f[i] = somme;
    }

    public static int[] initialize(int n, int k){
        int[] res = new int[n];
        for(int i=0; i<k; i++){
            res[i] = 1;
        }
        return res;
    }

    public static int kbonacci (int n, int k){
        int[] res = initialize(n, k);
        for(int i=k; i<res.length; i++){
            sumPrevious(k, i, res);
        }
        afficherTableau(res);
        return res[n-1];
    }

    public static void afficherTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
          System.out.print(tableau[i] + " ");
        }
        System.out.println();
    }

    public static void main (String[] args){
        int n = 9;
        int k = 2;
        System.out.println(kbonacci(n, k));
    }
}