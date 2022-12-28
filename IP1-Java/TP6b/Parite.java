public class Parite{

    // Écrivez vos fonctions ici

    public static int[] paritysort (int[] tab) {

        int number = 0;
        for(int i=0; i<tab.length; i++) {
            if (tab[i]%2 == 1) {
                number=number+1;
            }
        }

        int[] t1 = new int [tab.length];
        int pre = 0;
        int der = tab.length-number;

        for(int i=0; i<tab.length; i++) {
        
            if (tab[i]%2 == 0) {
                t1[pre] = tab[i];
                pre = pre+1;
            } else {
                t1[der] = tab[i];
                der = der+1;
            }
        }
        return t1;
    }

    public static int pair (int[] tab) {
        int[] pair = paritysort(tab);

        for(int i=0; i<pair.length; i++) {
            if (pair[i]%2 != 0) {
                return i;
            }
        }
        return -1;
    }

    public static int[] paritysort2 (int[] tab) {
        int[] baba = paritysort(tab);
        int[] aabb = new int [baba.length];

        for(int i=0; i<pair(tab)-1; i++) {
            if (baba[i] < baba[i+1]) {
                aabb[i] = baba[i];
                
            } else {
                aabb[i] = baba[i+1];
                aabb[i+1] = baba[i];
            }
        }

        for(int i=pair(tab); i<tab.length-1; i++) {
            if (baba[i] < baba[i+1]) {
                aabb[i] = baba[i];
            } else {
                aabb[i] = baba[i+1];
                aabb[i+1] = baba[i];
            }
        }

        aabb[tab.length-1] = baba[tab.length-1];

        return aabb;
    }

    

    public static void printIntArray (int[] a){
	    for(int i = 0; i<a.length ; i++){
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
    }

    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5,6,8,12,10};
        printIntArray(paritysort(tab));
        printIntArray(paritysort2(tab));

        
    }
}
