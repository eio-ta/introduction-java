public class Variance {

	public static int var(int [] a){
		int m=0;
		int v=0;
		int c=0;
		for (int i=0;i<a.length;i++){
			m=a[i]+m;
		}
		m=m/a.length;
		for (int i=0;i<a.length;i++){
			if (a[i]-m>=0){
				c=a[i]-m;
			}
			else{
				c=(m-a[i]);
			}
			v=c+v;
		}
		v=v/a.length;
		return v;
	}


    public static void printIntArray (int[] a){
	    for (int i = 0; i<a.length ; i++){
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
    }

    public static void main(String[] args) {
        int[] t = {1000,1,1,1};
		System.out.println(var (t));
    }
}
