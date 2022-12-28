class Exo3 {

    public static int position(int[] tab, int x) {
        int compteur = 0;
        for(int i=0; i<tab.length; i++) {
            if(tab[i]<x) {
                compteur++;
            }
        }
        return compteur;
    }

    public static int[] insert(int[] tab, int pos, int x) {
        if(pos>tab.length) {
            return tab;

        } else {
            int[] res = new int[tab.length+1];
            pos = position (tab, x);
            res[pos] = x;

            for(int i=0; i<res.length-1; i++) {
                if (tab[i]<x) {
                    res[i]=tab[i];
                } else {
                    res[i+1]=tab[i];
                }
            }
            return res;
        }
    }
	public static int [] minMaxAverage(int [] a){
		int b=0;
		int c=0;
		for (int i=0; i<a.length;i++){				
			if (a [i]>b){
				b=a [i];
			}
			if (a [i]<c){
				c=a[i];
			}
		}
		int [] t = {c,b,(b+c)/2};
		return t;
	}
    
 
    // QUESTION 3
    public static int[] occurrences(int[] a){
		int [] c= minMaxAverage(a);
		int n= c[1];
		int [] b= new int[n+1];
		for (int i=0; i<=n; i++){
			int d=0;
			for (int j=0; j<a.length;j++){
				if (i==a[j]){
					d=d+1;
				}
			}
			b[i]=d;
		}
		return b;
	}
    public static int[] sort(int[] a){
		int [] b=occurrences(a);
		int [] c= new int [a.length];
		int o=0;
		for (int i=0; i<b.length;i++){
			int d=0;
			while (d<b[i]){
				c[o]=i;
				o=o+1;
				d=d+1;
			}
		}
	return c;
	}
    public static void printtab(int[] tab) {
        System.out.print("{ ");
        for(int i=0; i<tab.length; i++) {
            System.out.print(tab[i]+" ");
        }
        System.out.println("}");
    }


    public static void main (String[] args) {
        /*int[] tab={0,2,4,6,7,8};
        System.out.println(position(tab,1));
        System.out.println(position(tab,-5));
        System.out.println(position(tab,10));*/

        int[] tab={2,5,4,3};
        printtab(insert(tab, 0, 1));
        printtab(insert(tab, 2, 100));
		printtab(sort(tab));

        
    }
}
