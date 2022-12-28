public class exo5{

    public static int[][] makeGrid(){
        int[][] res = new int[8][8];
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                res[i][j] = -1;
            }
        }
        return res;
    }

    public static boolean validPos(int r, int c){
        if(r>=0 && r<8 && c>=0 && c<8){
            return true;
        } else{
            return false;
        }
    }

    public static void nextMove(int[][] grid, int k, int r, int c){
        int[][] pos = {{r-2,c+1},{r-2,c-1},{r+1,c-2},{r-1,c+2},{r+1,c+2},{r-1,c-2},{r+2,c+1},{r+2, c-1}};
        for (int i=0; i<8; i++) {
            if(validPos(pos[i][0],pos[i][1])){
                grid[pos[i][0]][pos[i][1]] = k;
            }
        }
    }

    public static void main(String[] args){
        int[][] tableau = makeGrid();
        tableau[4][3] = 1;
        nextMove(tableau, 2, 4, 3, 5, 3);
        for (int i=0; i<8; i++) {
            for(int j=0; j<8; j++){
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println();
        }

    }
}