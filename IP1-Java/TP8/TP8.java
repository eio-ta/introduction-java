import java.util.Random;

public class TP8 {


	static Random rand= new Random();
	public static int randRange(int a, int b){
		return (rand.nextInt(b-a)+a);
	}
	
	public static int[][] CreateGraph(int n){
		int[][] R= new int [n][n];
		for (int i=0;i<n;i++){
			for (int j=i+1;j<n;j++){
				R[j][i]=randRange(0,2);
				R[i][j]=R[j][i];
			}
		}
	return R;
	}

	public static int friends_nbr(int[][] R, int a){
		int x=0;
		for (int i=0;i<R.length;i++){
			if(R[a][i]==1){
				x++;
			}
		}
		return x;
	}

	public static int[] friends(int[][] R, int a){
		int x=friends_nbr(R,a);
		int j=0;
		int[] T=new int[x];
		for( int i=0;i<R.length;i++){
			if (R[a][i]==1){
				T[j]=i;
				j++;
			}
		}
		return T;
	}

	public static int[] popular(int[][] R){

		int x=0;
		int y=-1;
		for (int i=1;i<R.length;i++){
			if (friends_nbr(R,i)>friends_nbr(R,x)){
				x=i;
			}
		}
		for (int i=0;i<R.length;i++){
			if (friends_nbr(R,i)==friends_nbr(R,x)){
				y++;
			}
		}
		if (y>0){
			int [] T= new int [y+1];
			int a=0;
			for (int i=0;i<R.length;i++){
				if (friends_nbr(R,i)==friends_nbr(R,x)){
					T[a]=i;
					a++;
				}
			}
			return T;
		}	
		else {
			int [] T={x};
			return T;
		}
	}
		

	public static int[] common_friends(int[][] R, int a ,int b){
		int x=0;
		int[] A = friends(R,a);
		int[] B = friends(R,b);
		for (int i=0; i<A.length;i++){
			for (int j=0;j<B.length;j++){
				if(A[i]==B[j]){
					x++;
				}
			}
		}
		int[] C= new int[x];
		int y=0;
		for (int i=0; i<A.length;i++){
			for (int j=0;j<B.length;j++){
				if(A[i]==B[j]){
					C[y]=A[i];
					y++;
				}
			}
		}
		return C;
	}
	public static int[][] add_user(int[][] R,int[] t){
		int[][] T= new int [R.length+1] [R.length+1];
		for (int i=0; i<R.length;i++){
			for (int j=0;j<R.length;j++){
				T[i][j]=R[i][j];
			}
		}
		int[] F=new int [T.length];
		for (int i=0;i<R.length;i++){
			for (int j=0; j<t.length;j++){			
				 if (i==t[j]){
					F[i]=1;
				}
			}
		}
		for (int i=0;i<T.length;i++){
			if (F[i]==1){
				T[i][R.length]=1;
			}
		}
		T[R.length]=F;
		return T;
	}

	public static String[] popular(int[][] R, String[] noms){
		int[] F = popular(R);
		String[] S= new String[F.length];
		for (int i=0; i<F.length; i++){
			S[i]=noms[F[i]];
		}
		return S;
	}

	public static int[] invite(int[][] R, int a) {

		int[] tab = new int[friends_nbr(R,a)];
		int indice = 0;
		for(int i=0; i<R[a].length; i++) {
			if(R[a][i] == 1) {
				tab[indice]=i;
				indice++;
			}
		}
		return tab;
	}

	public static void printab2 (int[][] a){
	    for (int i = 0; i<a.length ; i++){
			System.out.print("{");
			for (int j=0;j<a.length;j++){
	        System.out.print(a[i][j] + " ");
			}
			System.out.print("}, ");
	    }
	    System.out.println();
    }

		
    public static void print(int[] a){
	    for (int i = 0; i<a.length ; i++){
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
	}

	public static void printS (String[] a){
	    for (int i = 0; i<a.length ; i++){
	        System.out.print(a[i] + " ");
	    }
	    System.out.println();
	}	



	public static void main (String [] args){

		int R[][]=CreateGraph(3);

		//Exercice 1
		//Question 1
		printab2(R);
		//Question 2
		int a = 2;
		/*System.out.println(" Nombre d'amis de l'utilisateur " + a + " : " + friends_nbr(R,2));
		Question 3 et 5
		print(friends(R,0));
		print(friends(R,1));
		print(common_friends(R,0,1));
		Question 4
		print(popular(R));
		Question 6
		int[] F= {2,3};
		int[][] T=add_user(R,F);
		printab2(T);
		Question 7
		String[] noms = {"Evan Spiegel", "Mark Zuckerberg", "Jack Dorsey"};
		printS(popular(R,noms));*/

		//Exercice 2
		print(invite(R,a));



	}
}
		
