class Exo3{

    public static boolean holdsCharlie(String[][] tab){
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                if(tab[i][j].equals("Charlie")){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean holdsE(String[][] tab){
        for(int i=0; i<tab.length; i++){
            for(int j=0; j<tab[i].length; j++){
                for(int k=0; k<tab[i][j].length(); k++){
                    if(tab[i][j].charAt(k) == 'e'){
                    return true;
                    }
                }
            }
        }
        return false;
    }

    
    public static int[][] fWordPositions(String[][] tab, String s){
		int x = tab.length;
		for (int i=0; i<tab.length; i++){
			x = x+tab[i].length;
		}
		int[][] res= new int[x][2];
		int compteur = 0;

		for (int i=0; i<tab.length; i++){
			for (int j=0; j<tab[i].length; j++){
				if (tab[i][j].equals(s)){
					res[compteur][0] = i;
					res[compteur][1] = j;
					compteur++;
				}
			}
		}
		return cutIntArrayArray(res,compteur);
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

    public static void main(String[] args) {
        String[][] Q1 = {{"Riri", "Fifi", "Loulou"}, {"Charlie", "Georgio ", "Valéry"}, {"Franz"}};
        System.out.println("Question 01 = " + holdsCharlie(Q1));

        String[][] Q2 = {{"Il", "abandonna", "son", "roman", "sur", "son", " lit"}, {"Il", "alla", "à", "son", "lavabo"}};
        System.out.println("Question 02 = " + holdsE(Q2));

        System.out.println("Question 03 : ");
        printLines(fWordPositions(Q2,"son"));


    }
}