class Exo4 {

	public static int [] shiftn(int [] a,int n){
		int [] b= new int [a.length];
		int c=0;
		for (int i=0; i<a.length;i++){
			c=(i-n);
			if (c<0){
				c=(c)%a.length+a.length;
			}if (c>a.length-1){
				c=(c)%a.length;
			}
			b[i]=a[c];
		}
		return b;
	}

    public static boolean circulaire(int[] tab1, int[] tab2) {
            int[] a = new int[tab1.length];
            for (int i=0; i<tab1.length; i++){
                a = shiftn(tab2, i);
                if(arrayequals(tab1, a)) {
                    return true;
                }  
            }
            return false;
        }

    public static void printIntArray (int[] a){
	    for (int i = 0; i<a.length ; i++){
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
    }

    public static boolean arrayequals (int[] tab1, int[] tab2) {

        if(tab1.length != tab2.length) {
            return false;
        } else {
            
            for(int i=0; i<tab1.length; i++) {
                if (tab1[i] != tab2[i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {

        //Énoncé de l'exo 4
        int[] tab1={1,2,3,4,5};
        int[] tab2={3,4,5,1,2};
        int[] tab3={3,5,4,1,2};
		System.out.println(circulaire(tab1,tab2));
		System.out.println(circulaire(tab1,tab3));
        //Tester la fonction shiftn
        int[] t = {1000,1,2,3};
        printIntArray(shiftn(t,11));
		System.out.println(arrayequals(shiftn(tab1,3),tab2));

    }
}
