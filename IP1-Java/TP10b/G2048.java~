import java.awt.event.KeyEvent;
import java.awt.Font;
import java.util.Random;

public class G2048 {

    // ---------------------------------------------------------------------- //
    // Fonctions utilitaires que vous pourrez utiliser pour implémenter les
    // questions des exercices

    static Random rand = new Random ();

    /* La fonction suivante renvoie un entier tiré au hasard entre min et max. */
    public static int randInt (int min, int max) {
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    /* Procédure affichant le contenu d'un tableau d'entiers. */
    public static void printIntArray(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /* Procédure inversant les éléments d'un tableau

       Exemple : entrée : {1,2,3,4,5}, sortie : {5,4,3,2,1}
     */
    public static void reverse(int[] t) {
        for(int i = 0; i < t.length / 2; i++) {
            int tmp = t[i];
            t[i] = t[t.length - i - 1];
            t[t.length - i - 1] = tmp;
        }
    }

    /* Procédure inversant les lignes et colonnes d'un tableau de tableaux carré
       (les lignes deviennent les colonnes, et les colonnes deviennent les
       lignes).

       Exemple :
       entrée :
         { {0, 1, 2},
           {3, 4, 5},
           {6, 7, 8} }

       sortie :
         { {0, 3, 6},
           {1, 4, 7},
           {2, 5, 8} }
    */
    public static void transpose(int[][] t) {
        for(int i = 0; i < t.length; i++) {
            for(int j = i+1; j < t.length; j++) {
                int tmp = t[i][j];
                t[i][j] = t[j][i];
                t[j][i] = tmp;
            }
        }
    }

    // ---------------------------------------------------------------------- //

    // La grille
    public static int[][] board;

    // Taille de la grille
    public static int boardSize = 4;

    // Coups :
    public static int LEFT = 0;
    public static int RIGHT = 1;
    public static int UP = 2;
    public static int DOWN = 3;

    // Exercice 1 :
    // Implémentez initBoard, isBoardWinning et newSquareValue ici.

    public static void initBoard (){
        board = new int[boardSize][boardSize];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                board[i][j] = 0;
            }
        }
        board[1][0] = 2;
        board[3][3] = 2;

    }

    public static boolean isBoardWinning(){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == 2048){
		    System.out.println("Vous avez gagné !!");
                    return true;
                }
            }
        }
        return false;
    }

    public static int newSquareValue(){
        int random = randInt(1,10);
        if(random >= 1 && random <9){
            return 2;
        }else{
            return 4;
        }
    }

    // Exercice 2 :
    // Implémentez les fonctions demandées ici.

    public static int[] newEmptyRow(){
        int[] ligne = new int[boardSize];
        return ligne;
    }

    public static int[] slideLeftNoMerge(int[] tab){
        int[] res = new int[boardSize];
        int indice = 0;
        for(int i=0; i<tab.length; i++){
            if(tab[i] != 0){
                res[indice] = tab[i];
                indice++;
            }
        }
        return res;
    }

    public static int[] slideLeftAndMerge(int[] tab){
        int[] res = new int[boardSize];
        int entrée = 0;
        int sortie = 0;
        while(entrée<3){
            if(tab[entrée] == tab[entrée+1]){
                res[sortie] = tab[entrée]+tab[entrée+1];
                sortie = sortie+1;
                entrée = entrée+2;
            }else{
                res[sortie] = tab[entrée];
                res[sortie+1] = tab[entrée+1];
                sortie = sortie+1;
                entrée = entrée+1;
            }
        }
        return res;
    }

    public static int[] slideRowLeft(int[] tab){
        int[] res = slideLeftNoMerge(tab);
        int[] res2 = slideLeftAndMerge(res);
        return res2;
    }

    // ...

    // Exercice 3 :
    // Implémentez les fonctions demandées ici, et complétez slideBoard().

    public static void slideBoardLeft(){
        for(int i=0; i<board.length; i++){
            int[] majboard = slideRowLeft(board[i]);
            board[i] = majboard;
        }
    }

    public static void slideBoardRight(){
        for(int i=0; i<board.length; i++){
            reverse(board[i]);
        }
        slideBoardLeft();
        for(int i=0; i<board.length; i++){
            reverse(board[i]);
        }
    }

    public static void slideBoardUp(){
        transpose(board);
        slideBoardLeft();
        transpose(board);
    }

    public static void slideBoardDown(){
        transpose(board);
        slideBoardRight();
        transpose(board);
    }

    public static void slideBoard(int direction) {
        if (direction == 0){
            slideBoardLeft();
        }
        if (direction == 1){
            slideBoardRight();
        }
        if (direction == 2){
            slideBoardUp();
        }
        if (direction == 3){
            slideBoardDown();
        }
        return;
    }

    

    // Exercice 4 :
    // Complétez addSquare

    public static boolean board0(int i, int j){
        if (board[i][j] != 0){
            return false;
        }else{
            return true;
        }
    }

    public static void addSquare(int value) {
        int i = randInt(0,3);
        int j = randInt(0,3);
        
        while (board0(i, j) == false){
            i = randInt(0,3);
            j = randInt(0,3);
        }

        board[i][j] = value;
	
    }

    // Exercice 5 :
    // Implémentez ce qui est demandé ici.

    public static boolean isValidMove(int direction) {
        int[][] board2 = new int[boardSize][boardSize];
	for(int i=0; i<board.length; i++){
	    for(int j=0; j<board[i].length; j++){
		board2[i][j] = board[i][j];
	    }
	}
	slideBoard(direction);
	for(int i=0; i<board.length; i++){
	    for(int j=0; j<board[i].length; j++){
		if(board2[i][j] != board[i][j]){
		    return true;
		}
	    }
	}
        return false;
    }


   

    public static void main(String[] args) {
        // Écrivez vos tests ici

        // ...

        // Exécute la boucle principale du jeu
        // (runGame est définie ci-dessous, mais il n'est pas nécessaire de
        // comprendre ce qu'elle fait en détail).
        runGame();
    }

    // ---------------------------------------------------------------------- //
    // Ci-dessous, fonctions qu'il n'est pas forcément nécessaire de comprendre.
    //

    // move exécute un tour de jeu : si le coup est valide, alors on décale les
    // cases de la grille, et on en ajoute une nouvelle
    public static void move(int direction) {
        if (isValidMove(direction)) {
            slideBoard(direction);
            addSquare(newSquareValue());
        }
    }

    // dessine la grille courante
    public static void drawBoard() {
        StdDraw.clear();
        for(int i = 0; i <= boardSize; i++) {
            StdDraw.line(0, 0.25 * i, 1, 0.25 * i);
            StdDraw.line(0.25 * i, 0, 0.25 * i, 1);
        }

        for(int i = 0; i < boardSize; i++) {
            for(int j = 0; j < boardSize; j++) {
                if (board[i][j] != 0) {
                    StdDraw.text(j * 0.25 + 0.125,
                                 1 - i * 0.25 - 0.125,
                                 Integer.toString(board[i][j]));
                }
            }
        }
        StdDraw.show();
    }

    // récupère la direction indiquée au clavier
    public static int getDirection() {
        int direction = -1;
        while(direction == -1) {
            if(StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
                direction = LEFT;
            } else if(StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
                direction = RIGHT;
            } else if(StdDraw.isKeyPressed(KeyEvent.VK_DOWN)) {
                direction = DOWN;
            } else if(StdDraw.isKeyPressed(KeyEvent.VK_UP)) {
                direction = UP;
            }
            StdDraw.pause(16);
        }
        StdDraw.clearKeyPressed();
        return direction;
    }

    // boucle principale du jeu : fait jouer des coups jusqu'à ce que la partie
    // soit gagnée
    public static void runGame() {
        Font font = new Font("Sans Serif", Font.PLAIN, 40);
        StdDraw.setCanvasSize(500, 500);
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setFont(font);
        StdDraw.enableDoubleBuffering();

        initBoard();
        drawBoard();

        while(!isBoardWinning()) {
            int direction = getDirection();
            move(direction);
            drawBoard();
        }
    }
}
