import java.util.Random;

    class Exo1 {

        static Random rand = new Random();
        public static int randRange (int a, int b) {
            return (rand.nextInt(b-a) + a);
        }

        public static int[][] CreateGraph (int n)  {
            int choix;
            int[][] res = new int [n][n];

            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                choix = randRange(1,3);
                    if (i != j) {
                        if (choix == 1) {
                        res[i][j] = 0;
                        res[j][i] = 0;
                        }
                        if (choix == 2) {
                            res[i][j] = 1;
                            res[j][i] = 1;
                        }
                    }
                    else {
                        res[i][j] = 0;
                    }
                }
            }
            return res;
        }

        public static int friends_nbr (int [][] R, int a) {
            int compteur = 0;

            for(int i=0; i<R[a-1].length-1; i++) {
                if (R[a-1][i] == 1) {
                    compteur = compteur+1;
                } else {
                    compteur = compteur;
                }
            }
            return compteur;
        }

        public static void printArrayInt(int[][] tab) {

            System.out.print ("{ ");
            for(int i=0; i<tab.length; i++) {
                System.out.print ("{ ");
                for (int j=0; j< tab.length-1; j++) {
                    System.out.print (tab[i][j] + ", ");
                }
                System.out.print (tab[i][tab.length-1]);
                System.out.print ("}, ");
            }
            System.out.println ("}");
        }
	    

        public static void main(String[] args) {
            printArrayInt(CreateGraph(3));
            int a = 3;
            System.out.println ("L'utilisateur " + a + " a " + friends_nbr(CreateGraph(3), 3) + " ami(s).");
        }
    }