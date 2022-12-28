class Exo2 {

    public static int sumArrayOfArrays(int[][] tab){
        int somme = 0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                somme = somme+tab[i][j];
            }
        }
        return somme;
    }

    public static boolean holdsOddInt(int[][] tab){
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                if(tab[i][j]%2 == 1){
                    return true;
                }
            }
        }
        return false;
    }

    public static int numberOfOneDigitInt(int[][] tab){
        int compteur = 0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                if(tab[i][j]>=0 && tab[i][j]<10){
                    compteur++;
                }
            }
        }
        return compteur;
    }


    //Merci Jles pour cette question.
    public static int[][] positionArray(int[][] A){
		int x = A.length;
		for (int i=0; i<A.length; i++){
			x = x+A[i].length;
		}
		int[][] R= new int[x][2];
		int b = 0;
		for (int i=0; i<A.length; i++){
			for (int j=0; j<A[i].length; j++){
				if (A[i][j]%9 == 0){
					R[b][0] = i;
					R[b][1] = j;
					b++;
				}
			}
		}
		return cutIntArrayArray(R,b);
	}

    public static int sumOfEvenInt(int[][] tab){
        int somme = 0;
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                if(tab[i][j]%2 == 0){
                somme = somme+tab[i][j];
                }
            }
        }
        return somme;
    }

    public static int[] rowSums(int[][] tab){
        int[] res=new int[tab.length];
        int somme = 0;
        for(int i=0; i<res.length; i++){
            for(int k=0; k<tab[i].length; k++){
                somme = somme+tab[i][k];
            }
            res[i] = somme;
            somme = 0;
        }
        return res;
    }

    public static int[] rowWiseCount(int n, int[][] tab){
        int[] res=new int[tab.length];
        int compteur = 0;
        for(int i=0; i<res.length; i++){
            for(int k=0; k<tab[i].length; k++){
                if(tab[i][k]>n){
                    compteur++;
                }
            }
            res[i] = compteur;
            compteur = 0;
            
        }
        return res;
    }

    public static int[] columnSums(int[][] tab){

        //Connaître le maxi de taille du tableau
        int maxi = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i].length>maxi){
                maxi = tab[i].length;
            }
        }

        //nouveau tableau de tableau de même taille
        int[][] copy=new int[tab.length][maxi];
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++) {
                copy[i][j] = tab[i][j];
            }
        }

        //Création du nouveau tableau-résultat
        int[] res = new int[maxi];
        int somme = 0;
        int indice = 0;
        for(int i=0; i<maxi; i++){
            for(int j=0; j<copy.length; j++){
                somme = somme+copy[j][i];
            }
            res[i] = somme;
            somme = 0;
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

    public static int[][] cutIntArrayArray(int[][] tab, int n) {

        int[][] res=new int[n][];
        for(int i=0; i<n; i++){
            res[i]= new int [tab[i].length];
            for(int j=0; j<tab[i].length; j++) {
                res[i][j] = tab[i][j];
            }
        }
        return res;
    }

    public static void printArrayInt (int[] tab){
        System.out.print("{ ");
        for(int i=0; i<tab.length-1; i++){
            System.out.print(tab[i] + ", ");
        }
        System.out.println(tab[tab.length-1] + " }");
    }

    public static void main(String[] args) {
        int[][] Q1 = {{1, 2, 3}, {4, 5}};
        System.out.println("Question 01 = " + sumArrayOfArrays(Q1));

        int[][] Q2 = {{2, 4, 6}, {8, 10}, {12}};
        int[][] Qu2 = {{4, 6, 3}, {2}, {9, 11}};
        System.out.println("Question 02 (cas paire) = " + holdsOddInt(Q2));
        System.out.println("Question 02 (cas impaire) = " + holdsOddInt(Qu2));

        int[][] Q3 = {{11, 3, 12}, {1, 100}};
        System.out.println("Question 03 = " + numberOfOneDigitInt(Q3));

        int[][] Q4 = {{9, 4, 27}, {81}, {3, 45}};
        System.out.println("Question 04 : ");
        printLines(positionArray(Q4));

        int[][] Q5 = {{1, 2, 3}, {4, 5}};
        System.out.println("Question 05 (somme paire)= " + sumOfEvenInt(Q5));

        int[][] Q6 = {{2, 3}, {5, 8, 13, 21}, {34}};
        System.out.println("Question 06 (somme par ligne)= ");
        printArrayInt(rowSums(Q6));

        int[][] Q7 = {{12, 1}, {37, 8, -1, 21}, {0}};
        System.out.println("Question 07= ");
        printArrayInt(rowWiseCount(10,Q7));

        int[][] Q8 = {{2, 3}, {5, 8, 13, 21}, {34}};
        System.out.println("Question 08= ");
        printArrayInt(columnSums(Q8));
        
    }
}