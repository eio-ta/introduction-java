class Exo1 {

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
        int[][] tab= {{1, 2, 3}, {4, 5}, {6}};
        printLines(tab);
        System.out.println();
        int[][] tab1= {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}};
        printLines(cutIntArrayArray(tab1,3));


    }
}