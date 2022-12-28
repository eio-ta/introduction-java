public class exo4{

    public static boolean canMove(int n, int[][] doors, int p1, int p2){
        for(int i=0; i<doors[p1].length; i++){
            if(doors[p1][i] == p2){
                return true;
            }
        }
        return false;
    }

    public static void checkPath(int n, int[][] doors, int[] p){
        int u = 0;
        boolean b = true;
        for(int i=0; i<p.length; i++){
            if(canMove(n, doors, u, p[i]) == false){
                b = false;
            }
            u = p[i];
        }
        if (b){
            System.out.println("Roméo a trouvé Juliette !");
        } else{
            System.out.println("Pauvre Roméo !");
        }
    }

    public static void main(String[] args){
        int[][] doors = {{1}, {0}, {0,3}, {2}};
        int[] p = {2};
        checkPath(4, doors, p); 
        //System.out.println(canMove(4, doors, 0, 2));

    }
}