class test{

    public static int[] slideLeftAndMerge(int[] tab){
        int[] res = new int[4];
        int entrée = 0;
        int sortie = 0;

        while(entrée<4){
            if(tab[entrée] == tab[entrée+1]){
                res[sortie] = tab[entrée]+tab[entrée+1];
                sortie = sortie+1;
                entrée = entrée+2;
            }else{
                res[sortie] = tab[entrée];
                sortie = sortie+1;
                entrée = entrée+1;
            }
        }
        return res;
    }

    public static void printIntArray(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] row = {2,2,2,0};
        printIntArray(row);
        printIntArray(slideLeftAndMerge(row));
        int[] row1 = {2,2,2,2};
        printIntArray(row1);
        printIntArray(slideLeftAndMerge(row1));
        int[] row2 = {4,2,2,0};
        printIntArray(row2);
        printIntArray(slideLeftAndMerge(row2));
    }
}