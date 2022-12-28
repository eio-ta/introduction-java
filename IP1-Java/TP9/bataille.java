import java.util.Random;
public class bataille {

    public static int [][]gridComp = new int [10][10];
    public static int [][]gridPlay = new int [10][10];
    public static char [][]Play = new char [10][10];

    public static Random rand = new Random();
    public static int randRange(int a, int b){
        return rand.nextInt(b-a)+a;
    }

    //Exercice 01 : Remplissage de la grille de l'ordinteur
    public static boolean posOk(int[][] grille, int l, int c, int d, int t){
        if (d==2){
            if(l+t>=10){
                return false;
            }
        } else {
            if(c+t>=10){
                return false;
            }
        }

        if(d==1){
            for(int i=0; i<t+1; i++){
                if(grille[l][c+i]!=0){
                    return false;
                }
            }

        }else{
            for(int i=0; i<t+1; i++){
                if(grille[l+i][c]!=0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void initGridComp (int[][] gridComp){

        for(int i=1; i<6; i++){
            int l = randRange(0,10);
            int c = randRange(0,10);
            int d = randRange(1,3);
            int t = numbert(i);
            
            while(posOk(gridComp, l, c, d, t) == false){
                l = randRange(0,10);
                c = randRange(0,10);
                d = randRange(1,3);
                t = numbert(i);
            }

            if (posOk(gridComp, l, c, d, t)){
                if (d == 1){
                    for(int j=0; j<t; j++){
                        gridComp[l][c+j] = i;
                    }
                } else{
                    for(int j=0; j<t; j++){
                        gridComp[l+j][c] = i;
                    } 
                }
            }
        }
    }

    //Exercice 02 : Remplissage de la grille du joueur
    public static void initGridPlay (int[][] gridPlay){

        System.out.println();
        System.out.println("Au tour du joueur !");
        System.out.println();
        printGrid(gridPlay);

        for(int i=1; i<6; i++){
            System.out.println("Vous voulez placer quel bâteau ? (de 1 à 5)");
            int u = Integer.parseInt(System.console().readLine ());
            System.out.println("Donnez la colonne :");
            String C1 = readString();
            int c = numbert2(C1);
            System.out.println("Donnez la ligne :");
            int l = Integer.parseInt(System.console().readLine ())-1;
            System.out.println("Voulez-vous qu’il soit horizontal (1) ou vertical (2) ?");
            int d = Integer.parseInt(System.console().readLine ());
            int t = numbert(u);
            
            while(posOk(gridPlay, l, c, d, t) == false){
                System.out.println ("Erreur, vous ne pouvez pas placer ce bâteau ici.");
                System.out.println("Pour le bâteau " + u + " : ");
                System.out.println("Donnez la colonne :");
                C1 = readString();
                c = numbert2(C1);
                System.out.println("Donnez la ligne :");
                l = Integer.parseInt(System.console().readLine ())-1;
                System.out.println("Voulez-vous qu’il soit horizontal (1) ou vertical (2) ?");
                d = Integer.parseInt(System.console().readLine ());
            }

            if (posOk(gridPlay, l, c, d, t)){
                if (d == 1){
                    for(int j=0; j<t; j++){
                        gridPlay[l][c+j] = u;
                    }
                } else{
                    for(int j=0; j<t; j++){
                        gridPlay[l+j][c] = u;
                    } 
                }
            }
            System.out.println();
            System.out.println ("Grille du joueur :");
            printGrid(gridPlay);
            System.out.println();
        }
    }

    //Exercice 3 : Premiers tirs de torpilles
    public static boolean hasDrowned(int[][] grid, int n){
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == n){
                    return false;
                }
            }
        }
        return true;
    }

    public static void oneMove(int[][] grid, int l, int c){
        if(grid[l][c] == 0){
            System.out.println ("À l'eau !!");
        }
        if(grid[l][c] != 0){
            System.out.println ("Touché !!");
            grid[l][c] = 6;
            if(hasDrowned(grid, grid[l][c])){
                System.out.println("Le bâteau " + grid[l][c] + " a été coulé !!");
            }
        }
    }

    public static void oneMoveP(int[][] grid, int l, int c){
        if(grid[l][c] == 0){
            System.out.println ("À l'eau !!");
            Play[l][c] = 'o';
        }
        if(grid[l][c] != 0){
            System.out.println ("Touché !!");
            int mémo = grid[l][c];
            grid[l][c] = 6;
            Play[l][c] = 'X';
            if(hasDrowned(grid, mémo)){
                System.out.println("Le bâteau a été coulé !!");
            }
        }
    }

    public static int[] playComp(){
        int a = randRange(0,10);
        int b = randRange(0,10);
        int[] tab = new int[2];
        tab[0] = a;
        tab[1] = b;
        return tab;
    }

    public static boolean isOver(int[][] grid){
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]!=0 && grid[i][j]!=6){
                    return false;
                }
            }
        }
        return true;
    }


    //FONCTION FACULTATIVE !!!!!!!!!!!!!!!
    public static int numbert(int i){
        if(i == 1){
            return 5;
        }
        if(i == 2){
            return 4;
        }
        if(i == 3){
            return 3;
        }
        if(i == 4){
            return 3;
        }
        if(i == 5){
            return 2;
        }
        return 0;
    }

    public static int numbert2(String c){
        if(c.equals("A")){
            return 0;
        }
        if(c.equals("B")){
            return 1;
        }
        if(c.equals("C")){
            return 2;
        }
        if(c.equals("D")){
            return 3;
        }
        if(c.equals("E")){
            return 4;
        }
        if(c.equals("F")){
            return 5;
        }
        if(c.equals("G")){
            return 6;
        }
        if(c.equals("H")){
            return 7;
        }
        if(c.equals("I")){
            return 8;
        }
        if(c.equals("J")){
            return 9;
        }
        return 0;
    }

    public static void printGrid(int[][] tab) {

        String s = "ABCDEFGHIJ";
        System.out.print ("   " + s.charAt(0) + " ");
        for(int i=1; i<s.length()-1; i++){
            System.out.print (s.charAt(i) + " ");
        }
        System.out.println (s.charAt(s.length()-1) + " ");

        for(int i=0; i<tab.length-1; i++){
            System.out.print(i+1 + "  ");
            for (int j=0; j<tab[i].length; j++){
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print(10 + " ");
        for (int j=0; j<10; j++){
            System.out.print(tab[9][j] + " ");
        }
        System.out.println();
    }

    public static void printGridM(char[][] tab) {

        String s = "ABCDEFGHIJ";
        System.out.print ("   " + s.charAt(0) + " ");
        for(int i=1; i<s.length()-1; i++){
            System.out.print (s.charAt(i) + " ");
        }
        System.out.println (s.charAt(s.length()-1) + " ");

        for(int i=0; i<tab.length-1; i++){
            System.out.print(i+1 + "  ");
            for (int j=0; j<tab[i].length; j++){
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print(10 + " ");
        for (int j=0; j<10; j++){
            System.out.print(tab[9][j] + " ");
        }
        System.out.println();
    }

    public static void printL (int[] tab){
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i] + " ");
        }
    }

    public static void printEnd (int[][] tab, char[][] tab2){
        System.out.println();
        System.out.println("    Grille du joueur :                Grille-mémoire :");
        String s = "ABCDEFGHIJ";
        System.out.print ("   " + s.charAt(0) + " ");
        for(int i=1; i<s.length()-1; i++){
            System.out.print (s.charAt(i) + " ");
        }
        System.out.print (s.charAt(s.length()-1) + " ");

        System.out.print ("            ");
        System.out.print ("   " + s.charAt(0) + " ");
        for(int i=1; i<s.length()-1; i++){
            System.out.print (s.charAt(i) + " ");
        }
        System.out.println (s.charAt(s.length()-1) + " ");


        for(int i=0; i<tab.length-1; i++){
            System.out.print(i+1 + "  ");
            for (int j=0; j<tab[i].length; j++){
                System.out.print(tab[i][j] + " ");
            }
            System.out.print ("            ");
            System.out.print(i+1 + "  ");
            for (int j=0; j<tab[i].length; j++){
                System.out.print(tab2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print(10 + " ");
        for (int j=0; j<10; j++){
            System.out.print(tab[9][j] + " ");
        }
        System.out.print ("            ");
        System.out.print(10 + " ");
        for (int j=0; j<10; j++){
            System.out.print(tab2[9][j] + " ");
        }
        System.out.println();
    }

    public static String readString(){
        return System.console().readLine();
    } 

    public static void main(String[] args){
        
        //Étape 01 : on remplit les tableaux des joueurs
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                gridComp[i][j] = 0;
            }
        }
        initGridComp(gridComp);
        System.out.println();
        System.out.println ("Grille de l'ordinateur : faite !");
        System.out.println();
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                gridPlay[i][j] = 0;
            }
        }
        initGridPlay(gridPlay);
        printGrid(gridPlay);
        System.out.println();
        System.out.println ("Grille du joueur : faite !");
        System.out.println();
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                Play[i][j] = ' ';
            }
        }

        //Étape 02 : Que le jeu commence !!
        System.out.println("Règles du jeu : Le but de chaque joueur est de couler tous les bateaux de l’autre joueur. ");
        System.out.println("La grille de gauche est la grille où vous avez disposé vos bâteaux.");
        System.out.println("La grille de droite est une grille (mémoire) qui vous montre où vous avez attaqué.");
        System.out.println();

        printEnd(gridPlay, Play);
        System.out.println();

        while (isOver(gridComp) == false && isOver(gridPlay) == false){
            System.out.println();
            System.out.println ("Au tour de l'ordinateur.");
            int[] playComp = playComp();
            printL(playComp);
            oneMove(gridPlay, playComp[0], playComp[1]);
            System.out.println();
            System.out.println ("Au tour du joueur.");
            int[] playPlay = new int[2];

            System.out.println("Donnez la colonne :");
            String C1 = readString();
            playPlay[1] = numbert2(C1);
            System.out.println("Donnez la ligne :");
            playPlay[0] = Integer.parseInt(System.console().readLine ())-1;
            oneMoveP(gridComp, playPlay[0], playPlay[1]);
            System.out.println();
            printEnd(gridPlay, Play);
        }

        if(isOver(gridComp)){
            System.out.println();
            System.out.println("Le joueur a gagné cette manche !!");
            System.out.println();
            
        }
        if(isOver(gridPlay)){
            System.out.println();
            System.out.println("L'ordinateur a gagné cette manche !!");
            System.out.println();
            
        }
    }
}
