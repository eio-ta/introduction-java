class Exo4 {

    public static int[][] squareOfZeros(int n){
        int[][] res = new int[n][n];
        return res;
    }

    public static int[][] rectOfInt(int n, int p){
        int[][] res = new int[p][n];
        int suite = 1;
        for(int i=0; i<p; i++){
            for(int j=0; j<n; j++){
                res[i][j] = suite;
                suite++;
            }
        }
        return res;
    }

    public static int [][] target(int n){
		int [][] R= new int [n][n];
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				if(i<n/2 && j<n/2){
					if(j>i){
						R[i][j]=i+1;
					}
					else{
						R[i][j]=j+1;
					}
				}
				else if (i>n/2 && j>n/2){
					R[i][j]=R[n-i-1][n-j-1];
				}
				else if(i>=n/2 && j<=n/2){
					R[i][j]=R[n-i-1][j];	
				}
				else if(i<=n/2 && j>=n/2){
					R[i][j]=R[i][n-j-1];
				}
			}
		}
		return R;
	}



    public static int[][] triangleOfInt(int n){
        int[][] res = new int[n][];
        int suite = 1;
        for(int i=0; i<n; i++){
            res[i]= new int [i+1];
            for(int j=0; j<res[i].length; j++) {
                res[i][j] = suite;
                suite++;
            }
        }
        return res;
    }

    public static void printLines(int[][] tab) {
        for(int i=0; i<tab.length; i++){
            for (int j=0; j<tab[i].length; j++){
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Question 01");
        printLines(squareOfZeros(3));

        System.out.println("Question 02");
        printLines(rectOfInt(3, 2));

        System.out.println("Question 03");
        printLines(triangleOfInt(3));

        System.out.println("Question 04");
        printLines(target(6));

    }
}