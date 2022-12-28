import java.util.Random;

public class test{

    public static Random rand = new Random();
    public static int randRange(int a, int b){
        return rand.nextInt(b-a)+a;
    }

    public static boolean appartientOuPas(int[] tab, int n){
        for(int i=0; i<tab.length; i++){
            if(tab[i] == n){
                return true;
            }
        }
        return false;
    }

    public static int[] carré(int lico){
        int[] tab = new int[3];
        if(lico >= 0 && lico <=2){
            tab[0]=0;
            tab[1]=1;
            tab[2]=2;
        }
        if(lico >= 3 && lico <=5){
            tab[0]=3;
            tab[1]=4;
            tab[2]=5;
        }
        if(lico >= 6 && lico <=8){
            tab[0]=6;
            tab[1]=7;
            tab[2]=8;
        }
        return tab;
    }

    public static int[] TableauPASAdmissible(int[][] tab, int i, int j){
        //Compter le nombre de valeurs admissibles
        int cmpt = 0;
        //Étape 1 : valeurs pas admissibles dans la ligne
        for(int k= 0; k<tab[i].length; k++){
            if(tab[i][k] != 0){
                cmpt = cmpt+1;
            }
        }
        //Étape 2 : valeurs pas admissibles dans la colonne
        for(int k=0; k<tab.length; k++){
            if(tab[k][j] != 0){
                cmpt = cmpt+1;
            }
        }
        //Étape 3 : valeurs pas admissibles dans le carré
        int[] tabligne = carré(i);
        int[] tabcolonne = carré(j);
        for(int k=tabligne[0]; k<tabligne[2]+1; k++){
            for(int p=tabcolonne[0]; p<tabcolonne[2]+1; p++){
               if(tab[k][p] != 0){
                   cmpt = cmpt+1;
                }
            }
        }

        //Créer un tableau avec les valeurs pas admissibles
        int[] res = new int[cmpt];
        cmpt = 0;
        //Étape 1 : valeurs pas admissibles dans la ligne
        for(int k= 0; k<tab[i].length; k++){
            if(tab[i][k] != 0){
                res[cmpt] = tab[i][k];
                cmpt = cmpt+1;
            }
        }
        //Étape 2 : valeurs pas admissibles dans la colonne
        for(int k=0; k<tab.length; k++){
            if(tab[k][j] != 0){
                res[cmpt] = tab[k][j];
                cmpt = cmpt+1;
            }
        }
        //Étape 3 : valeurs pas admissibles dans le carré
        for(int k=tabligne[0]; k<tabligne[2]+1; k++){
            for(int p=tabcolonne[0]; p<tabcolonne[2]+1; p++){
               if(tab[k][p] != 0){
                res[cmpt] = tab[k][p];
                   cmpt = cmpt+1;
                }
            }
        }
        return res;
    }

    public static int[] aide(int[][]tab, int i, int j){

        if(tab[i][j] != 0){
            int[] valeursPASadmissibles = TableauPASAdmissible(tab, i, j);
            int[] valeursPOSSIBLES = {1,2,3,4,5,6,7,8,9};
        
            //On regarde combien y a de valeurs possibles.
            int cmpt = 0;
            for(int k=0; k<valeursPOSSIBLES.length; k++){
                int n = valeursPOSSIBLES[k];
                if(appartientOuPas(valeursPASadmissibles, n) == false){
                    cmpt = cmpt+1;
                }
            }
            //On remplit le tableau.
            int[] res = new int[cmpt];
            cmpt = 0;
            for(int k=0; k<valeursPOSSIBLES.length; k++){
                int n = valeursPOSSIBLES[k];
                if(appartientOuPas(valeursPASadmissibles, n) == false){
                    res[cmpt] = valeursPOSSIBLES[k];
                    cmpt = cmpt+1;
                }
            }
            return res;
        } else{
            int n = tab[i][j];
            int[] res = {n};
            return res;
        }
    }





    public static void main(String[] args){
        int[][] t = {{1,2,3,4,5,6,7,8,9}, {4,5,6,7,8,9,1,2,3}, {7,8,9,1,2,3,4,5,6}, {2,3,1,5,6,4,8,9,7}, {5,6,4,8,9,7,2,3,1}, {8,9,7,2,3,1,5,6,4}, {3,1,2,6,4,5,9,7,8}, {6,4,5,9,7,8,3,1,2}, {9,7,8,3,1,2,6,4,5}};
        int cmpt = 0;
        while(cmpt != 70){
            int i = randRange(0, 9);
            int j = randRange(0, 9);
            t[i][j] = 0;
            cmpt = cmpt+1;
        }
        for(int i=0; i<t.length; i++){
            for(int j=0; j<t[i].length; j++){
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }

        int[] res = TableauPASAdmissible(t, 1, 1);
        System.out.println();
        for(int i=0; i<res.length; i++){
            System.out.print(res[i] + " ");
        }
        System.out.println();

        int[] possible = aide(t, 1, 1);
        System.out.println();
        for(int i=0; i<possible.length; i++){
            System.out.print(possible[i] + " ");
        }
        System.out.println();

    

    }
}