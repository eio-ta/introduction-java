class Exo5_pascal {
    
    public static int[][] pascal(int size){

        int [][] triangle = new int[size][];
        triangle[0] = new int[1];
        triangle[0][0] = 1;

        for (int row=1; row<size; row++) {
            triangle[row] = new int[triangle[row-1].length+1];

            for (int col=0; col<=row; col++) {
                if ((col == 0) || (col == row)) {
                    triangle[row][col] = 1;
                } else {
                    triangle[row][col] = triangle[row-1][col-1]+triangle[row-1][col];
                }
            }
        }
        return triangle;
    }

    public static void print(int[][] tab){
        for(int row=0; row<tab.length; row++) {
            for(int col=0; col<=row; col++) {
                System.out.print(tab[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        print(pascal(13));
    }
}