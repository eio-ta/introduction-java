public class Fibonacci {

    // Écrivez vos fonctions ici

    public static int[] fibonacci (int n) {

        int[] fibo = new int [n];
        fibo[0] = 0;
        fibo[1] = 1;
        int fn = 0;
        int fn1 = 1;
        int fn2;

        for(int i=2; i<n; i++) {
            fn2 = fn+fn1;
            fibo[i] = fn2;
            fn = fn1;
            fn1 = fn2;
        }
        return fibo;
    }


    public static void printIntArray (int[] a){
	    for (int i = 0; i<a.length ; i++){
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
    }

    public static void main(String[] args) {
        printIntArray(fibonacci(5));

    }
}
